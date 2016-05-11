import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> newList = Arrays.asList("1", "666666", "22", "4444", "333", "55555");

//1        newList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//2       newList.sort(Comparator.comparing(s -> s.length()));
//3        newList.sort(Comparator.comparing(String::length));
        newList.sort(Comparator.comparing(String::length));
        Consumer<String> impressor = System.out::println;
        newList.forEach(impressor);
        newList.forEach(System.out::println);

    }
}
