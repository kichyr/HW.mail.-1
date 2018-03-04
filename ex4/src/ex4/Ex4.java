package ex4;

import java.util.ArrayList;

public class Ex4 {
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
