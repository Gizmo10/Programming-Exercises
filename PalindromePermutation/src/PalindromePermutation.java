import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String [] args){

    }

    public static boolean isWordAPermutationOfPalindrome(String word){

        HashMap<Integer,Integer> evensAndOddsCount = new HashMap<>(numberOfEvenAndOddCharacters(word));
        int oddKey = 1;
        int evenKey = 0;


    }

    public static HashMap<Integer, Integer> numberOfEvenAndOddCharacters(String word){

        HashMap<Character,Integer> letterCount = new HashMap<>(tallyCharacterOccurrences(word));
        HashMap<Integer,Integer> evensAndOddsCount = new HashMap<>();
        int evenKey = 0;
        int oddKey = 1;

        if(letterCount.isEmpty()){

            return evensAndOddsCount;
        }else{

            for(Character c: letterCount.keySet()){

                if(letterCount.get(c) % 2 == 0){

                    if(evensAndOddsCount.containsKey(evenKey)){

                        evensAndOddsCount.put(evenKey,letterCount.get(evenKey) + 1);
                    }else{

                        evensAndOddsCount.put(evenKey,1);
                    }
                }else{

                    if(evensAndOddsCount.containsKey(oddKey)){

                        evensAndOddsCount.put(oddKey,evensAndOddsCount.get(oddKey) + 1);
                    }else{

                        evensAndOddsCount.put(oddKey,1);
                    }
                }
            }
        }

        return evensAndOddsCount;
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
