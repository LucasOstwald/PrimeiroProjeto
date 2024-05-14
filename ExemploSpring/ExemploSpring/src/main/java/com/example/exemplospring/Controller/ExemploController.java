package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
    @GetMapping ("ping")
    public String ping (){
        return "Alice in Chains better than Nirvana";

    }

    @GetMapping ("nome/{nome}")
    public String ping (@PathVariable String nome){
        return "O nome recebido é: " + nome;
    }

    @GetMapping ("soma")
    public String somaValores (@RequestParam int x, @RequestParam int y){
        return "A soma é: " + (x+y);

    }
}
