package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class Exercicio01Rest {

    private static int contador = 1;

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    @GetMapping({"identificadorUnico"})
    public Usuario buscaUm (@PathVariable("identificadorUnico") int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    @PostMapping
    public Usuario salvaUsuario(@RequestBody Usuario usuario) {
        usuario.setId(contador);
        usuarios.add(usuario);
        contador++;
        //System.out.println("Salvando usuario: " + usuario);
        return usuario;
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario(@PathVariable("id") int id, @RequestBody Usuario body){

        for (Usuario info : usuarios) {
            if (info.getId() == id) {
                info.setNome(body.getNome());
                info.setIdade(body.getIdade());
                info.setDescricao(body.getDescricao());
                return info;
            }
        }
        return null;
    }
//
//    @DeleteMapping
//    public void delete(@PathVariable("id") int id) {
//
//    }
}
