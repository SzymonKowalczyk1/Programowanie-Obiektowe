public class Main {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Test32");
        System.out.println(zad1.capitalizeEverySecond(sb));


    int[] tab = {1,2,3};
    int[] tab2 = {4,5,6};
        System.out.println(Zad8.mergeArrays(tab,tab2));

        }
    }
class zad1{
    public static String capitalizeEverySecond(StringBuilder sb){
        for (int i = 0; i < sb.length(); i+=2){
            sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
        }


        return sb.toString();
        }

        }