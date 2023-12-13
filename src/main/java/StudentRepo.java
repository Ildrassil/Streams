import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentRepo {
    Map<Integer, Student> studentMap = new HashMap<>();

    public void createStudentMap() throws IOException {


        Stream<String> lines = Files.lines(Path.of("/Users/jakobschneider/Desktop/NeueFische/Projekte/Streams/src/main/resources/students.csv"));
        studentMap = lines
                .skip(1)
                .filter( line -> !line.isEmpty())
                .distinct()
                .collect(Collectors.toMap(id ->{
                            String[] studentData = id.split(",");
                            return Integer.parseInt(studentData[0]);
                        }, student ->
                        {
                    String[] studentData = student.split(",");
                    return new Student(Integer.parseInt(studentData[0]),
                            studentData[1],
                            Integer.parseInt(studentData[2]),
                            Integer.parseInt(studentData[3]));
                        }));
        System.out.println(studentMap);







            }
        }






