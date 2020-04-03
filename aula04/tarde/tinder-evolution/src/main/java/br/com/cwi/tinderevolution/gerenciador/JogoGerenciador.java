package br.com.cwi.tinderevolution.gerenciador;

import br.com.cwi.tinderevolution.acervo.JogoAcervo;
import br.com.cwi.tinderevolution.dominio.jogo.Jogo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JogoGerenciador {

    private JogoAcervo acervo = new JogoAcervo();

    public Jogo salvar(Jogo jogo) {

        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome()) && (jogo.getPlataformaJogo().equals(jogoExistente.getPlataformaJogo()))) {
                return jogoExistente;
            }
        }

        if (jogo.getNome().isEmpty() ||  jogo.getDataLancamento() == null || jogo.getCategoriaJogo() == null ||jogo.getPlataformaJogo() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        if (jogo.getDataLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(jogo);
    }

    public Jogo editar(int id, Jogo jogoAualizado) {

        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAualizado);
        }
    }

    public List<Jogo> listar() {
        return acervo.listar();
    }

    public Jogo procurar(int id) {

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
