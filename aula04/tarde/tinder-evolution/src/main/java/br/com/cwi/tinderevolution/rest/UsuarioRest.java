package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.usuario.Usuario;
import br.com.cwi.tinderevolution.gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRest {

    public UsuarioGerenciador gerenciador;

    public UsuarioRest() {
        this.gerenciador = new UsuarioGerenciador();
    }

    @GetMapping
    public List<Usuario> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Usuario procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
