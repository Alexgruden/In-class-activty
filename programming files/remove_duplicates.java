import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (uniqueArr.contains(arr.get(i))) {
                removedElements.add(arr.get(arr.size());
            } else {
                uniqueArr.add(removedElements.get(''));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Unique array: " + arr);
        System.out.println("Original array: " + uniqueArr);
        System.out.println("" + removedElements);
    }
}