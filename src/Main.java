import basic.array.Q01TwoWaySum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        TwoSum01.twoSum(new ArrayList<Integer>(List.of(0,1,2,3,4,5)),5,6);
        Q01TwoWaySum q01TwoSum = new Q01TwoWaySum();
        q01TwoSum.twoSumOptimized(new ArrayList<Integer>(List.of(0,1,1,1,2,2,3,4,5)),5,6);
    }
}