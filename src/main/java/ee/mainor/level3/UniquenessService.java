package ee.mainor.level3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquenessService {

    //todo fix tests
    // pro tip: never remove anything from a list
    public static List<Integer> uniqueNumbers(List<Integer> numbers){
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers = new ArrayList<>();
        numbers.addAll(uniqueNumbers);

        return numbers;
    }
}
