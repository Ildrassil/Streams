import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> filterForOddNumbers(List<Integer> numbers) {

        List<Integer> even = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .collect(Collectors.toList());
        even.stream()
                .forEach(number -> System.out.println(number));
        return even;


    }


    public static Integer calculateSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .reduce(0, (sum, number) -> sum + number);
    }



    public static void main(String[] args) throws IOException {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 13, 12, 15, 16, 17, 18, 19, 20);
        List<Integer> even = filterForOddNumbers(numbers);
        System.out.println(calculateSum(numbers));
        System.out.println(even);

        StudentRepo studentRepo = new StudentRepo();
        studentRepo.createStudentMap();

    }
}