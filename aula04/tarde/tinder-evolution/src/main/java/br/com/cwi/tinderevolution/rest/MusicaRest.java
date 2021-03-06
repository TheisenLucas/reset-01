package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.musica.Musica;
import br.com.cwi.tinderevolution.gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaRest {

    public MusicaGerenciador gerenciador;

    public MusicaRest() {
        this.gerenciador = new MusicaGerenciador();
    }

    @GetMapping
    public List<Musica> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Musica procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Musica create(@RequestBody Musica requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Musica editar(@PathVariable("id") int id, @RequestBody Musica requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }

}
