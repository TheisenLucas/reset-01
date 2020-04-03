package br.com.cwi.tinderevolution.gerenciador;

import br.com.cwi.tinderevolution.acervo.EsporteAcervo;
import br.com.cwi.tinderevolution.dominio.esporte.Esporte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsporteGerenciador {

    private EsporteAcervo acervo = new EsporteAcervo();

    public Esporte salvar(Esporte esporte) {

        List<Esporte> esportes = acervo.listar();

        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                return esporteExistente;
            }
        }

        if (esporte.getNome().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return acervo.salvar(esporte);
    }

    public Esporte editar(int id, Esporte esporteAtualizado) {

        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null) {
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizado);
        }
    }

    public List<Esporte> listar() {
        return acervo.listar();
    }

    public Esporte procurar(int id) {

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
