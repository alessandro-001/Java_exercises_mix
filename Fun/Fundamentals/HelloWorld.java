package Fundamentals;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a list
        List<String> words = Arrays.asList("Hello", "world");

        // Using forEach
        words.forEach(word -> System.out.print(word + " "));
    }
}
