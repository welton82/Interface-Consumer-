package application;

import entities.Produto;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
   public static void main(String[] args) {

       List<Produto> lista = new ArrayList<>();

       lista.add(new Produto("Notebook",1500.60));
       lista.add(new Produto("fone de ouvido",50.00));
       lista.add(new Produto("Tv 29 Lg",3650.54));
       lista.add(new Produto("Armario Itatiaia",2506.30));
       System.out.println(lista);
       System.out.println("=========");
       lista.forEach(new PriceUpdate());

       System.out.println(lista);
       //ou
       System.out.println("=========== OU ================");
       lista.forEach(System.out::print);

    }
}
