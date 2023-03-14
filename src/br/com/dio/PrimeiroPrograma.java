package br.com.dio;

import br.com.dio.gato.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 12;

        System.out.println("Resultado: "+(a+b));*/

        Gato gato = new Gato();
        gato.setNome("NegaPreta");
        gato.setCor("Preto");
        gato.setIdade(5);

        System.out.println(gato);


    }
}
