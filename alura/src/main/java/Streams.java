import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lcunha on 5/17/2016.
 */
public class Streams {
    public static void main(String[] args) {

        List<SomeCourse> courses = new ArrayList<>();
        courses.add(new SomeCourse("Python", 45));
        courses.add(new SomeCourse("JavaScript", 150));
        courses.add(new SomeCourse("Java 8", 113));
        courses.add(new SomeCourse("C", 55));
        courses.sort(Comparator.comparing(SomeCourse::getStudents));

//        courses.forEach(c -> System.out.println(c.getName()));
//        courses.stream()
//                .filter(c -> c.getStudents() >= 100)
//                .map(c -> c.getStudents())
//                .forEach(System.out::println);

//        int sum = courses.stream()
//                .filter(c -> c.getStudents() >= 100)
//                .mapToInt(SomeCourse::getStudents)
//                .sum();
//
//        System.out.println(sum);

        courses.stream()
                .filter(c -> c.getStudents() > 50)
                .map(SomeCourse::getStudents)
                .forEach(System.out::println);
    }
}

