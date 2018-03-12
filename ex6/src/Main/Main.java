package Main;

/**
 *
 * @author kichyr
 * @task Написать программу, определяющую является ли фраза палиндромом или нет.
Входные данные содержат строку.
Ответ должен содержать: "полиндром" если это палиндром или "не полиндром" если нет.
 */
public class Main {
    public static void main(String[] args) {
        
        String s = "kekek";
        System.err.println(Reverser.reverseByStack(s));
        if(s.equals(Reverser.reverseByStack(s)))
            System.err.println("it`s polindrom");
        else
            System.err.println("No");
    }
    
}
