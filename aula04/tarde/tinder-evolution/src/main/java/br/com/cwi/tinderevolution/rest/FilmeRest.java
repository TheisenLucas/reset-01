package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.filme.Filme;
import br.com.cwi.tinderevolution.gerenciador.FilmeGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeRest {

    public FilmeGerenciador gerenciador;

    public FilmeRest() {
        this.gerenciador = new FilmeGerenciador();
    }

    @GetMapping
    public List<Filme> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Filme procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Filme create(@RequestBody Filme requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
