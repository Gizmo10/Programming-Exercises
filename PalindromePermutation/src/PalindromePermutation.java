import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String [] args){

    }


    public static HashMap<Character,Integer> tallyCharacterOccurrences(String word){

        HashMap<Character,Integer> letterCount = new HashMap<>();

        for(int i = 0;i < word.length();i++){

            char key = word.charAt(i);

            if(key != ' '){

                if(letterCount.containsKey(key)){

                    letterCount.put(key, letterCount.get(key) + 1);
                }else{

                    letterCount.put(key, 1);
                }
            }
        }

        return letterCount;
    }
}
