import java.util.HashMap;
import java.util.Map;

public class Permutation {

    public static void main(String [] args){

    }

    public static boolean isPermutation(String s1, String s2){

        //Permutations have an equal number of characters
        if(s1.length() == s2.length()){

            Map<Character,Integer> wordOneCharacterCount = new HashMap<>();
            Map<Character,Integer> wordTwoCharacterCount = new HashMap<>();

            for(int i = 0;i < s1.length();i++){

                char fromWord1 = s1.charAt(i);
                char fromWord2 = s2.charAt(i);

                if(wordOneCharacterCount.containsKey(fromWord1)){

                    wordOneCharacterCount.put(fromWord1,1);
                }else{

                    wordOneCharacterCount.put(fromWord1,wordOneCharacterCount.get(fromWord1) + 1);
                }
            }
        }
    }
}

