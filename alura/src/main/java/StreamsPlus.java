import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lcunha on 5/17/2016.
 */
public class StreamsPlus {
    public static void main(String[] args) {

        List<SomeCourse> courses = new ArrayList<>();
        courses.add(new SomeCourse("Python", 45));
        courses.add(new SomeCourse("JavaScript", 150));
        courses.add(new SomeCourse("Java 8", 113));
        courses.add(new SomeCourse("C", 55));
        courses.sort(Comparator.comparing(SomeCourse::getStudents));

//        OptionalDouble optDouble = courses.stream()
//                .filter(c -> c.getStudents() >= 100)
//                .mapToInt(SomeCourse::getStudents)
//                .average();
//
//        courses.stream()
//                .filter(c -> c.getStudents() >= 100)
//                .findAny()
//                .ifPresent(someCourse -> System.out.println(someCourse.getName()));

//        courses = courses.stream()
//                .filter(someCourse -> someCourse.getStudents() >= 100)
//                .collect(Collectors.toList());

//        courses.stream()
//                .filter(someCourse -> someCourse.getStudents() >= 100)
//                .collect(Collectors.toMap(SomeCourse::getName,SomeCourse::getStudents))
//                .forEach((name, students) -> System.out.println(name + " has " + students + " students"));

        courses.parallelStream()
                .filter(someCourse -> someCourse.getStudents() >= 100)
                .collect(Collectors.toMap(SomeCourse::getName, SomeCourse::getStudents))
                .forEach((name, students) -> System.out.println(name + " has " + students + " students"));
    }
}

