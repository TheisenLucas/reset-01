package br.com.cwi.aula04.rest;

import br.com.cwi.aula04.dominio.InformacaoProjeto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/helloworld") //barra é opcional
public class HelloWorldRest {

    @GetMapping("/texto")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/{nome}")
    public String helloWorldComParametros(@PathVariable("nome") String nomeUsuario) {
        return "Hello World, " + nomeUsuario;
    }
}
