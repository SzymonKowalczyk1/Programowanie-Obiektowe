import java.util.ArrayList;

public class Zad8 {
    public static ArrayList<Integer> mergeArrays(int[] tab, int[] tab2)
    {
        ArrayList<Integer> suma = new ArrayList<>();
        for (int i=0; i <tab.length;i++)
        {
            suma.add(tab[i]);
        }
        for (int j =0; j <tab.length;j++){
            suma.add(tab2[j]);
        }
        return suma;
    }
}
