package tinder.evolution.gerenciador;

import tinder.evolution.acervo.SerieAcervo;
import tinder.evolution.dominio.serie.Serie;

import java.time.LocalDate;
import java.util.List;

public class SerieGerenciador {

    private SerieAcervo acervo = new SerieAcervo();

    public Serie salvar(Serie serie) {

        List<Serie> series = acervo.listar();

        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                return serieExistente;
            }
        }

        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getCategoriaSerie() == null || serie.getLancamento() == null || serie.getNumeroTemporadas() == 0 || serie.getNumeroEpisodios() == 0 || serie.getSinopse().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        if (serie.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(serie);
    }

    public Serie editar(int id, Serie serieAualizada) {

        Serie serieParaEditar = procurar(id);

        if (serieParaEditar == null) {
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAualizada);
        }
    }

    public List<Serie> listar() {
        return acervo.listar();
    }

    public Serie procurar(int id) {

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
