public class OneMoveAway {

    public static void main(String [] args){

        System.out.println(oneMove("bake","bake"));
        System.out.println(oneMove("bake","cake"));
        System.out.println(oneMove("bake","cane"));
        System.out.println(oneMove("make","maker"));
        System.out.println(oneMove("make","meker"));
        System.out.println(oneMove("","somerandomstuff"));
        System.out.println(oneMove("make","makers"));
    }

    public static boolean oneMove(String s1, String s2){

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int numberOfOperations = 0;

        if(s1.length() == s2.length()){

            for(int i = 0; i < s1.length(); i ++){

                if(s1.charAt(i) != s2.charAt(i)){

                    numberOfOperations ++;

                    if(numberOfOperations > 1){

                        return false;
                    }
                }
            }
        }else{

            String longestString = longestString(s1,s2);
            String shortestString = shortestString(s1,s2);

            for(int i = 0;i < longestString.length();i++){

                if(i < shortestString.length() && (longestString.charAt(i) != shortestString.charAt(i))){

                    numberOfOperations++;

                    if(numberOfOperations > 1){

                        return false;
                    }
                }else if(i >= shortestString.length()){

                    numberOfOperations++;

                    if(numberOfOperations > 1){

                        return false;
                    }
                }
            }

        }

        return true;
    }

    public static String longestString(String s1, String s2){

        if(s1.length() > s2.length()){

            return s1;
        }

        return s2;
    }

    public static String shortestString(String s1,String s2){

        if(s1.length() < s2.length()){

            return s1;
        }

        return s2;
    }
}
