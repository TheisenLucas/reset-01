package br.com.cwi.tinderevolution.gerenciador;

import br.com.cwi.tinderevolution.acervo.UsuarioAcervo;
import br.com.cwi.tinderevolution.dominio.usuario.Usuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioGerenciador {

    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();

        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getNome().equals(usuarioExistente.getNome())) {
                return usuarioExistente;
            }
        }

        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataNascimento() == null || usuario.getBiografia().isEmpty() || usuario.getLocalizacao() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        //if (usuario.getEmail().matches()) //validação de email

        if (usuario.getDataNascimento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(usuario);
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {

        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {

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
