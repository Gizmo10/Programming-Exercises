import java.util.HashMap;

public class TwoElementsSum {

    public static int[] twoElements(int[] elements, int sum){

        int [] result = new int[2];
        HashMap<Integer,Integer> pairsAddingToSum = new HashMap<>();

        for(int i = 0;i < elements.length;i++){

            if(!pairsAddingToSum.containsKey(elements[i])){

                pairsAddingToSum.put(elements[i], sum - elements[i]);
            }
        }

        for(int j = 0;j < elements.length;j++){

            if(pairsAddingToSum.containsKey(pairsAddingToSum.get(elements[j]))){

                result[0] = elements[j];
                result[1] = pairsAddingToSum.get(elements[j]);
                j = elements.length;
            }
        }

        return result;
    }

}
