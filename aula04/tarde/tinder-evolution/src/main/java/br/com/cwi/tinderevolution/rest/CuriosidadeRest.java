package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.curiosidade.Curiosidade;
import br.com.cwi.tinderevolution.gerenciador.CuriosidadeGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curiosidades")
public class CuriosidadeRest {

    public CuriosidadeGerenciador gerenciador;

    public CuriosidadeRest() {
        this.gerenciador = new CuriosidadeGerenciador();
    }

    @GetMapping
    public List<Curiosidade> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Curiosidade procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Curiosidade create(@RequestBody Curiosidade requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Curiosidade editar(@PathVariable("id") int id, @RequestBody Curiosidade requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
