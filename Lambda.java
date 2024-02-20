import java.util.Arrays;

public class Lambda {

    public static void main(String[] args) {
        String[] strings = {"3", "1", "5", "2", "4"};

        // Sorting in Ascending order
        Arrays.sort(strings, (s1, s2) -> Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2)));
        System.out.println("Ascending Order: " + Arrays.toString(strings));

        // Sorting in Descending order
        Arrays.sort(strings, (s1, s2)->Integer.compare(Integer.parseInt(s2),Integer.parseInt(s1)));
        System.out.println("Descending order: " + Arrays.toString(strings));
    }
}
