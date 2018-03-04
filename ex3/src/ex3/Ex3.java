package ex3;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(1000);
        //вывод N
        System.err.println(N);
        //вывод суммы цифр
        System.err.println(SumNumbers.countSum(N));
    }
    
    
}
