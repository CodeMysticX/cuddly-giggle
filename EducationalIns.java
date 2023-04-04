import java.util.Scanner;
import java.lang.Math;
class Staff{
    protected int code;
    protected String name;
    Staff(int c,String n){
            code=c;
            name=n;
        }
        void display(){
            System.out.println("Employee Code: "+code+", Employee Name :"+name);
            System.out.println("\n");
        }
}
class Teacher extends Staff{
    protected String subject;
    protected String publications;
    Teacher(int c,String n,String sub,String pub){
        super(c,n);
        subject=sub;
        publications=pub;
    }
    public void disp(){
        System.out.println("Teacher Name: "+name+", Teacher Code: "+code+", Teacher's Subject: "+subject+", Publications: "+publications);
        System.out.println("\n");
    }
}
class Officer extends Staff{
    protected String grade;
    Officer(int c,String n,String g){
        super(c,n);
        grade=g;
    }
    public void disp1(){
        System.out.println("Officer Name: "+name+", Officer Code: "+code+", Officer Grade: "+grade);
        System.out.println("\n");
    }
}
class Typist extends Staff{
    protected int speed;
    Typist(int c,String n,int s){
        super(c,n);
        speed=s;
    }
    public void disp2(){
        System.out.println("Typist Code: "+code+", Typist Name: "+name+", Typist Speed: "+speed);
        System.out.println("\n");
    }
}
class Regular extends Typist{
    Regular(int c,String n,int s)
    {
        super(c,n,s);
    }
    public void disp3(){ 
        System.out.println("Regular Typist Code: "+code+", Regular Typist Name: "+name+", Typist Speed: "+speed);
        System.out.println("\n");
    }
}
class Casual extends Typist{
    protected int daily;
    protected int wages;
    Casual(int c,String n,int s,int d,int w)
    {
        super(c,n,s);
        daily=d;
        wages=w;
    }
    public void disp4(){
        System.out.println("Casual Typist Code: "+code+", Casual Typist Name: "+name+", Casual Typist Speed: "+speed+", Casual Typist Daily Words: "+daily+", Casual Typist Wages: "+wages);
        System.out.println("\n");
    }
}
public class EducationalIns{
    public static void main(String[] args){
       Staff s=new Staff(123,"william");
       s.display();
       Teacher t=new Teacher(131,"Manoj Singh","English","Oxford");
       t.disp();
       Officer o=new Officer(563,"John Wisk","Senior");
       o.disp1();
       Typist ty=new Typist(256,"Rovan",37);
       ty.disp2();
       Regular r=new Regular(164,"Francis",25);
       r.disp3();
       Casual c=new Casual(134,"Samira",45,5500,15000);
       c.disp4();
    }
}
