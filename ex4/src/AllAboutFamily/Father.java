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
public class Father extends Member{

    public Father(String name, String sex, int age) {
        super(name, sex, age);
    }
    public void sayAboutYou() {
        System.out.println(String.format("I`m a big DADY,my name: %s, my sex: %s, my age: %s", name, sex, age));
    }
}
