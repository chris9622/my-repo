import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/christianmastropietro/Desktop/Magazzino1/src/input.txt"));
        String line = reader.readLine();
        List<String> n = new ArrayList<>();
        while (line != null) {
            n.add(line);
            line = reader.readLine();
        }
        System.out.println(n);
        System.out.println(n.size());
        var nuovoArrayList = n.stream().filter(e->e.startsWith("Abbigliamento"));
        nuovoArrayList.forEach(System.out::println);
        var arrayListOrdinato= n.stream().filter(e->e.startsWith("Alimentare")).sorted();
        arrayListOrdinato.forEach(System.out::println);
        BufferReader m= new BufferReader();
        System.out.println(m.ricercaByCode("E002"));


    }
}