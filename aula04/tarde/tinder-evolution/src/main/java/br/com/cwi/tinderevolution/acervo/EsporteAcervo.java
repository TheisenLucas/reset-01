package br.com.cwi.tinderevolution.acervo;

import br.com.cwi.tinderevolution.dominio.esporte.Esporte;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EsporteAcervo {

    private static int contador = 1;
    private static final List<Esporte> esportes = new ArrayList<>();

    public Esporte salvar(Esporte esporte) {
        esporte.setId(contador++);
        esportes.add(esporte);
        return esporte;
    }

    public List<Esporte> listar() {
        return esportes;
    }

    public Esporte procurar(int id) {
        for (Esporte esporte : esportes) {
            if (esporte.getId() == id) {
                return esporte;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Esporte esporteParaDeletar = procurar(id);
        if (esporteParaDeletar != null) {
            return esportes.remove(esporteParaDeletar);
        }
        return false;
    }

    public Esporte editar(Esporte esporteParaEditar, Esporte esporteAtualizado) {
        esporteParaEditar.setNome(esporteAtualizado.getNome());

        return esporteParaEditar;
    }
}
