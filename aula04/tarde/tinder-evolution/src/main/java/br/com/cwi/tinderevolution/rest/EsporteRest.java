package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.dominio.esporte.Esporte;
import br.com.cwi.tinderevolution.gerenciador.EsporteGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/esportes")
public class EsporteRest {

    public EsporteGerenciador gerenciador;

    public EsporteRest() {
        this.gerenciador = new EsporteGerenciador();
    }

    @GetMapping
    public List<Esporte> listarTodos() {

        return gerenciador.listar();
    }

    @GetMapping("/{id}")
    public Esporte procurarPorId(@PathVariable("id") int id) {

        return gerenciador.procurar(id);
    }

    @PostMapping
    public Esporte create(@RequestBody Esporte requestBody) {

        return gerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Esporte editar(@PathVariable("id") int id, @RequestBody Esporte requestBody) {

        return gerenciador.editar(id, requestBody);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id) {

        gerenciador.deletar(id);
    }
}
