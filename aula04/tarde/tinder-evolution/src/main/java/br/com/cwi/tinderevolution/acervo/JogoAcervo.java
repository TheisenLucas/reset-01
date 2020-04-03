package br.com.cwi.tinderevolution.acervo;

import br.com.cwi.tinderevolution.dominio.jogo.Jogo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JogoAcervo {

    private static int contador = 1;
    private static final List<Jogo> jogos = new ArrayList<>();

    public Jogo salvar(Jogo jogo) {
        jogo.setId(contador++);
        jogos.add(jogo);
        return jogo;
    }

    public List<Jogo> listar() {
        return jogos;
    }

    public Jogo procurar(int id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Jogo jogoParaDeletar = procurar(id);
        if (jogoParaDeletar != null) {
            return jogos.remove(jogoParaDeletar);
        }
        return false;
    }

    public Jogo editar(Jogo jogoParaEditar, Jogo jogoAtualizado) {
        jogoParaEditar.setNome(jogoAtualizado.getNome());
        jogoParaEditar.setPublisher(jogoAtualizado.getPublisher());
        jogoParaEditar.setDataLancamento(jogoAtualizado.getDataLancamento());
        jogoParaEditar.setCategoriaJogo(jogoAtualizado.getCategoriaJogo());
        jogoParaEditar.setPlataformaJogo(jogoAtualizado.getPlataformaJogo());

        return jogoParaEditar;
    }
}
