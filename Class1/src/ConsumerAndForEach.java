import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by lucas on 03/05/2016.
 */
public class ConsumerAndForEach {
    public static void main(String[] args) {
        List<String> newList = Arrays.asList("first", "second", "third");
        Consumer consumerAux = null;

        newList.forEach(consumerAux);
    }
    class listConsumer implements Consumer<String>{
        @Override
        public void accept(String o) {
            System.out.println(o);
        }
    }
}

