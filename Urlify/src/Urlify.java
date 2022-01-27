public class Urlify {

    public static void main(String [] args){

        System.out.println(urlifyName("Mr Grey Hood",12));
    }

    public static String urlifyName(String name,int length){

        char [] nameCharArray = name.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < length; i++){

            if(nameCharArray[i] != ' '){

                result.append(nameCharArray[i]);
            }else{

                result.append("%20");
            }
        }

        return result.toString();
    }
}
