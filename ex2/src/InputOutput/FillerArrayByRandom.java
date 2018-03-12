package InputOutput;

import java.util.Random;

public class FillerArrayByRandom {
    Random rand = new Random();
    //рандомное заполнение + вывод исходного
    
    public int[] fillArrayWithMod(int[] a, int mod){
        for (int i = 0; i < a.length; i++) {
        a[i] = rand.nextInt(100)*mod;
        }
        return a;
    }
}
