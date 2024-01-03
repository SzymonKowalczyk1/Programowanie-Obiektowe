public class Main{

    public static void main(String[] args) {
        int wynik = 0;
        try{
            wynik = dzielenie(15,0);
            return;
        } catch(ArithmeticException e){
            System.out.println("dzielenie przez 0");
            wynik = 0;
            return;
        }finally {
            System.out.println(wynik);
        }
    }

    public static int dzielenie(int a, int b){
        return a/b;
    }


}