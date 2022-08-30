import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {10, -13, 15, 8, 16, 15, -20, 17};
        List<Integer> numberList = Arrays.asList(array);
        System.out.println("Numbers: " + numberList);

        List<Integer> evenNumberList = numberList.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumberList);

        Optional<Integer> max = evenNumberList.stream().
                map(x -> x * x).
                max(Comparator.comparing(Integer::valueOf));
        System.out.println("Maximum of squares: " + max.get());

    }
}