import java.util.*;
import java.util.function.Consumer;

/**
 * Created by lucas on 03/05/2016.
 */
public class ConsumerAndForEach {
    public static void main(String[] args) {
        List<String> newList = Arrays.asList("first", "second", "third", "aaaaa", "GGGG");

        Collections.sort(newList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) return -1;
                else if(o1.length() < o2.length()) return 0;
                else return 0;
            }
        });

        newList.forEach(new Consumer<String>(){
            public void accept(String palavra) {
                System.out.println(palavra);
            }
        });
    }
}


