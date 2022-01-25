public class IsUnique {

    public static void main(String [] args){

        //Test the method
        System.out.println(isUnique("break"));
        System.out.println(isUnique("member"));
        System.out.println(isUnique("Area"));
        System.out.println(isUnique(" "));
        System.out.println(isUnique("Arrangement"));
    }

    public static boolean isUnique(String word){

        boolean theStringIsUnique = true;
        word = word.toLowerCase();

        for(int i = 0; i < word.length();i++){
            for(int j = i + 1;j < word.length();j++){

                if(word.charAt(i) == word.charAt(j)){

                    return false;
                }
            }
        }

        return theStringIsUnique;
    }
}
