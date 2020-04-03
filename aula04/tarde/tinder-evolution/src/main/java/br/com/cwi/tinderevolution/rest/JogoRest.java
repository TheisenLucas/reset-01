package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.jogo.Jogo;
import br.com.cwi.tinderevolution.gerenciador.JogoGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoRest {

    public JogoGerenciador gerenciador;

    public JogoRest() {
        this.gerenciador = new JogoGerenciador();
    }

    @GetMapping
    public List<Jogo> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Jogo procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Jogo create(@RequestBody Jogo requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Jogo editar(@PathVariable("id") int id, @RequestBody Jogo requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
