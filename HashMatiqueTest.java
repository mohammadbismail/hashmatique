import java.util.HashMap;
import java.util.Set;

public class HashMatiqueTest {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("Track1", "Song1");
        myMap.put("Track2", "Song2");
        myMap.put("Track3", "Song3");
        myMap.put("Track4", "Song4");
        Set<String> keys = myMap.keySet();
        for(String key : keys){
            System.out.println(String.format("%s:%s",key,myMap.get(key)));
        }
    }
}
