package Main;

import AllAboutFamily.Child;
import AllAboutFamily.Family;
import AllAboutFamily.Father;
import AllAboutFamily.Mother;
import java.util.ArrayList;
/**
 *
 * @author kichyr
 * @task Написать программу, симулирующую семью. В семье должно быть от 2 до 5 детей. Мама и папа. В выводе члены семьи должны называть свое имя, пол и 
 возраст
 */
public class Main {
    public static void main(String[] args) {
        //создадим членов семьи
        Mother mom = new Mother("Robert", "муж.", 25);
        Father dad = new Father("Carl", "муж.", 26);
        Child tomy = new  Child("Tomy", "муж.", 9);
        Child anna = new  Child("Anna", "жен.", 6);
        Child kek = new  Child("Kek", "муж.", 1);
        //Создадим лист детей
        ArrayList<Child> childrens = new ArrayList<Child>();
        //добавим детей в лист
        childrens.add(kek);
        childrens.add(anna);
        childrens.add(tomy);
        //Создадим семью
        Family Robinsons = new Family(mom, dad, childrens);
        //Робинсоны, предсавьтесь
        Robinsons.introduce_yourself();
    }
    
}
