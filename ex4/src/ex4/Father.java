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
public class Father extends Member{

    public Father(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void sayAboutYou() {
        System.err.println("I`m a big DADY,"+"my name: "+name+", my sex: "+sex+", my age:"+age);
    }
}