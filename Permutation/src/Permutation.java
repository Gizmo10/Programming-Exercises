import java.util.HashMap;

public class Permutation {

    public static void main(String [] args){

        //Test the methods
        System.out.println(isPermutation("Trophy","pyhrta"));
    }

    public static boolean isPermutation(String s1, String s2){
        //The characters must be of the same case for comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //Permutations have an equal number of characters
        if(s1.length() == s2.length()){

            HashMap<Character,Integer> wordOneCharacterCount = new HashMap<>();
            HashMap<Character,Integer> wordTwoCharacterCount = new HashMap<>();

            for(int i = 0;i < s1.length();i++){

                char fromWord1 = s1.charAt(i);
                char fromWord2 = s2.charAt(i);

                if(wordOneCharacterCount.containsKey(fromWord1)){

                    wordOneCharacterCount.put(fromWord1,wordOneCharacterCount.get(fromWord1) + 1);
                }else{

                    wordOneCharacterCount.put(fromWord1,1);
                }

                if(wordTwoCharacterCount.containsKey(fromWord2)){

                    wordTwoCharacterCount.put(fromWord2,wordTwoCharacterCount.get(fromWord2) + 1);
                }else{

                    wordTwoCharacterCount.put(fromWord2,1);
                }
            }

            return(areCharactersEqual(s1,wordOneCharacterCount,wordTwoCharacterCount));
        }

        return false;
    }

    public static boolean areCharactersEqual(String word,HashMap<Character,Integer> mapOne, HashMap<
            Character,Integer> mapTwo){

        for(int i = 0;i < word.length();i++){

            if(mapOne.get(word.charAt(i)) == mapTwo.get(word.charAt(i))){

                continue;
            }else{

                return false;
            }
        }

        return true;
    }
}

