package pro1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Tool3 {
    public static String analyze(Path path)
    {
        List<String> lines;
        try {
            lines = Files.readAllLines(path);

            HashMap<String,Integer> hashMap = new HashMap<>();
            for(String line : lines)
            {
                if(hashMap.containsKey(line)) {
                    int current = hashMap.get(line);
                    hashMap.put(line,current+1);
                }
                else {
                    hashMap.put(line,1);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // TODO: Všechny řádky hashmapy spojit do jednoho řetězce s dvojtečkami!
        return "Jasno:0,Zataženo:0";
    }

}
