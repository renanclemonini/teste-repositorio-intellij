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

        Livro livro1 = new Livro("Viver Limpo", "NA");

        System.out.println(gato);
        System.out.println(livro1);


    }
}

class Livro{
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
