/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.ArrayList;

/**
 *
 * @author kichyr
 */
public class Family {
    Mother mom;
    Father dad;
    ArrayList<Child> childrens;
    public Family(Mother mom, Father dad, ArrayList<Child> childrens) {
        this.mom = mom;
        this.dad = dad;
        this.childrens = childrens;
    }
    public void introduce_yourself(){
        mom.sayAboutYou();
        dad.sayAboutYou();
        for(int i = 0; i < childrens.size(); i++)
            childrens.get(i).sayAboutYou();
    }
    
    //возможный метод добавления члена в семью
    public void addNewMember(){
        //something
    }
}
