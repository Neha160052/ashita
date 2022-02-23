// WAP using java 8: Collect all  even numbers from a list using stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques4EvenNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(
                list.stream()
                        .filter(a -> a % 2 == 0)
                        .collect(Collectors.toList()));
    }
}
