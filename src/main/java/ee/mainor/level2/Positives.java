package ee.mainor.level2;

import java.util.ArrayList;
import java.util.List;

public class Positives {

    //todo fix tests

    /**
     * returns only positives. zero is not positive
     * For example:
     * 1, -2, -3 => 1
     */
    public static List<Integer> analyze(List<Integer> integers){

        integers = new ArrayList<Integer>(integers);
        integers.removeIf(integer -> integer <= 0);

        return integers;
    }
}
