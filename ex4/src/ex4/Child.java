/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author kichyr
 */
public class Child extends Member{

    public Child(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void sayAboutYou() {
        System.out.println("I`m a stupid child,"+"my name: "+name+", my sex: "+sex+", my age:"+age);
    }
}
