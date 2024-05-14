package com.example.exemplospring.Exercício;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercício01 {
    @GetMapping("converte")
    //1
    public int Exercício01(@RequestParam String binario) {
        int decimal = 0;
        for (int i=binario.length()-1;i>=0;i--){
            if (binario.charAt(i)=='1'){
                decimal += Math.pow(2, i);
            }}
        return decimal;
    }

    @GetMapping("romanos")
    //2
    public double Exercício2(@RequestParam String roma) {
        int decimal = 0;
        for (int i = roma.length() - 1; i >= 0; i--) {
            String let = String.valueOf(roma.charAt(i));
            switch (let) {
                case "I" -> decimal += 1;
                case "X" -> decimal += 10;
                case "V" -> decimal += 5;
                case "L" -> decimal += 50;
                case "C" -> decimal += 100;
                case "D" -> decimal += 500;
                case "M" -> decimal += 1000;
            }
        }
        return decimal;
    }

    @GetMapping("fatorial")
    //3
    public int Exercício03(@RequestParam int n) {
        int fatorial = 1;
        for (int i=n;i>1;i--){
                fatorial *=i;
            }
        return fatorial;
    }

    @GetMapping("palindromo")
    //4
    public String Exercício04(@RequestParam String palavra) {
        String pal2 = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            pal2 += palavra.charAt(i);
        }
        if (palavra.equals(pal2)) {
            return "é um palíndromo";
        } else {
            return "não é um palíndromo";
        }
    }

    @GetMapping("temperatura")
    //5
    public String Exercício05(@RequestParam double celsius) {
        double temperaturaF = (celsius * (9/5)) + 32;
        return "A temperatura em Fahrenheit é: "+ temperaturaF;
        }

    @GetMapping("media")
    //6
    public String Exercício06(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3) {
        double mediaGeral = (nota1+nota2+nota3)/3;
        return "A média das notas é: "+ mediaGeral;
    }

    @GetMapping("primos")
    public String Exercício07(@RequestParam double numero) {
        boolean primo1 = true;
        for(int j = 2;j<numero;j++) {
            if(numero%j == 0) {
                primo1 = false;
            }
            if(primo1) {
                return "O número " + numero + " é primo";
            } else {
                return "O número "+numero+" não é primo";
            }}
        return " ";
    }


    @GetMapping("minutagem")
    //8
    public String Exercício08(@RequestParam int horas) {
        int totalMinutos = horas * 60;
        return "O total é: "+ totalMinutos + " minutos";
    }

    @GetMapping("area")
    //9
    public String Exercício09(@RequestParam double altura, @RequestParam double base) {
        double areaTri = (altura*base)/2;
        return "A área total do triângulo é: "+ areaTri + " centímetros";
    }
    }