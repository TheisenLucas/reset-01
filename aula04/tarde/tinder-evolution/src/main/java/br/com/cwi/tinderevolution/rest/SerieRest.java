package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.serie.Serie;
import br.com.cwi.tinderevolution.gerenciador.SerieGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieRest {

    public SerieGerenciador gerenciador;

    public SerieRest() {
        this.gerenciador = new SerieGerenciador();
    }

    @GetMapping
    public List<Serie> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Serie procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Serie create(@RequestBody Serie requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Serie editar(@PathVariable("id") int id, @RequestBody Serie requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
