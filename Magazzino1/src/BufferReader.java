import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferReader {

    public String ricercaByCode(String code) throws  Exception{
        BufferedReader reader = new BufferedReader(new FileReader("/Users/christianmastropietro/Desktop/Magazzino1/src/input.txt"));
        String line = reader.readLine();
        List<String> n = new ArrayList<>();
        while (line != null) {
            n.add(line);
            line = reader.readLine();
        }
        for (int i=0;i<n.size();i++){
            if(n.get(i).contains(code)){
                return n.get(i);
            }
        }return "Non ho trovato nulla";
    }






}
