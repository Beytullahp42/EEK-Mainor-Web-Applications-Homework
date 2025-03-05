package ee.mainor.level2;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers1 {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            return null;
        }

        integerList = new ArrayList<Integer>(integerList);
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        integerList.set(0, sum);

        return integerList.get(0);
    }

}
