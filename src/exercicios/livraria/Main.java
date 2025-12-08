package exercicios.livraria;

import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Book> books = List.of(
              new Book("O Senhor dos anéis","Tolken",1930),
              new Book("The Hobbit","Tolken",1935),
              new Book("Crônicas de gelo e fogo","George R. Martin",1996)

      );
    }
}
