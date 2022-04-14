/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class

class Teacher
{
    static String collegeName;
    String designation;
    public void work()
    {
        
    }
}
class MathTeacher
{
    static String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println(designation+"\t"+collegeName);
    }
}
class EnglishTeacher
{
    static String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println(designation +"\t"+collegeName);
    }
}
class MusicTeacher
{
    String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println(designation +"\t"+collegeName);
    }
}

public class CollegePrincipal {
    static String collegeName;

     public static void main(String[] args)
    {
        MathTeacher m =new MathTeacher();
        m.designation="MathTeacher";
        m.collegeName="IIT";
        m.work();
        EnglishTeacher e=new EnglishTeacher();
        e.designation="EnglishTeacher";
        e.collegeName="IIT";
        e.work();
        MusicTeacher m1=new MusicTeacher();
        m1.designation="MusicTeacher";
        m1.collegeName="IIT";
        m1.work();
        
        
    }


}
