package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.InformacaoProjeto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/info")
public class InformacaoProjetoRest {

    private static int contador = 1;

    private List<InformacaoProjeto> informacaoProjetos = new ArrayList<>();

    @GetMapping
    public List<InformacaoProjeto> listarInformacoesProjeto() {
        return informacaoProjetos;
    }

    @PostMapping
    public InformacaoProjeto salvaAlgumaCoisa(@RequestBody InformacaoProjeto informacaoProjeto) {
        informacaoProjeto.setId(contador);
        informacaoProjetos.add(informacaoProjeto);
        contador++;
        System.out.println("Salvando alguma coisa: " + informacaoProjeto);
        return informacaoProjeto;
    }

    @PutMapping
    public InformacaoProjeto editar(@PathVariable("id") int id, @RequestBody InformacaoProjeto body){

        for (InformacaoProjeto info : informacaoProjetos) {
            if (info.getId() == id) {
                info.setNome(body.getNome());
                info.setDescricao(body.getDescricao());
                info.setLancamento(body.getLancamento());
                return info;
            }
        }

        return null;

    }

    //    @DeleteMapping
//    public void delete(@PathVariable("id") int id) {
//
//    }
}
