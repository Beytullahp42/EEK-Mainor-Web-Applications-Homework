package ee.mainor.level2;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 => 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers) {

        integers = new ArrayList<Integer>(integers);
        for (int i = 0; i < integers.size(); i++) {
            integers.set(i, integers.get(i) * integers.get(i));
        }

        return integers;
    }
}
