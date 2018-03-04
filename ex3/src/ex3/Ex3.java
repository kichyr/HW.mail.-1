package ex3;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(1000);
        System.err.println(N);
        System.err.println(SumNumbers.countSum(N));
        System.err.println(SumNumbers.countSum(10));
    }
    
    
}
