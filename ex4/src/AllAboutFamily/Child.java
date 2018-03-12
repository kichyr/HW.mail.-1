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
public class Child extends Member{

    public Child(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void sayAboutYou() {
        System.out.println(String.format("I`m a stupid child, my name: %s, my sex: %s, my age: %s", name, sex, age));
    }
}
