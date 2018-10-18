package mx.sintelti.cursos.threads;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestStock {

    public static BigDecimal precio = new BigDecimal(0.0);
    public static void main(String[] args) throws IOException {


        String fileName = "/Users/HP/IdeaProjects/threads/src/main/resources/list.txt";

        List<String> lineas = Files.readAllLines(Paths.get(fileName));


        long Inicio = System.nanoTime();
        for (String empresa : lineas) {

            StockRetriever stockr = new StockRetriever(empresa);
            precio = precio.add(stockr.getStockPrice());
        }

        long fin =System.nanoTime();
        System.out.println(precio);
        System.out.println((fin-Inicio)/1000000000.0);
    }
}


//TODO Leer lineas archivo

//TODO Iterar y sumar cada precio

//TODO Imprimir precio consolidado
