package AllAboutFamily;
/**
 *
 * @author kichyr
 * Член семьи, обладающий именем, полом и возрастом
 * sayAboutYou - реплика/представления конкретного члена семьи
 * get[%Somethig%] - возвращает соответствующее поле
 */
public abstract class Member{
    protected String name;
    protected String sex;
    protected int age;
    public Member(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    public void sayAboutYou(){ 
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
}
