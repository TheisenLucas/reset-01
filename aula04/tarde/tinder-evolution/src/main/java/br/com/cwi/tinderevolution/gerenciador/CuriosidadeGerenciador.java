package br.com.cwi.tinderevolution.gerenciador;

import br.com.cwi.tinderevolution.acervo.CuriosidadeAcervo;
import br.com.cwi.tinderevolution.dominio.curiosidade.Curiosidade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuriosidadeGerenciador {

    private CuriosidadeAcervo acervo = new CuriosidadeAcervo();

    public Curiosidade salvar(Curiosidade curiosidade) {

        List<Curiosidade> curiosidades = acervo.listar();

        for (Curiosidade curiosidadeExistente : curiosidades) {
            if (curiosidade.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                return curiosidadeExistente;
            }
        }

        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoriaCuriosidade() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return acervo.salvar(curiosidade);
    }

    public Curiosidade editar(int id, Curiosidade curiosidadeAtualizada) {

        Curiosidade curiosidadeParaEditar = procurar(id);

        if (curiosidadeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }

    public List<Curiosidade> listar() {
        return acervo.listar();
    }

    public Curiosidade procurar(int id) {

        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;

    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }

        return false;
    }
}
