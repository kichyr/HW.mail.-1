/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllAboutFamily;

/**
 *
 * @author kichyr
 */
public class Mother extends Member{

    public Mother(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void sayAboutYou() {
        System.out.println(String.format("I`m mom, my name: %s, my sex: %s, my age: %s", name, sex, age));
    }

}
