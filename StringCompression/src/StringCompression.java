public class StringCompression {

    public static void main(String [] args){

        System.out.println(compressString("aabbaaccc"));
        System.out.println(compressString("aaababbbcccFa"));
    }

    public static String compressString(String s){

        StringBuilder compressedString = new StringBuilder();
        int numberOfAppearances = 0;
        char c = ' ';

        if(!s.isEmpty()){

            c = s.charAt(0);
        }else{

            return compressedString.toString();
        }

        for(int i = 0; i < s.length();i++){

            if(c == s.charAt(i)){

                numberOfAppearances++;
            }else{

                compressedString.append(c);
                compressedString.append(numberOfAppearances);
                c = s.charAt(i);
                numberOfAppearances = 1;
            }
        }

        compressedString.append(c);
        compressedString.append(numberOfAppearances);

        return compressedString.toString();
    }
}
