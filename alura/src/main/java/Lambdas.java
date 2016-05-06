import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by lcunha on 5/6/2016.
 */
public class Lambdas {
    public static void main(String[] args) {
        List<String> newList = Arrays.asList("1", "666666", "22", "4444", "333", "55555");

        newList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        newList.forEach(s -> System.out.println(s));

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
