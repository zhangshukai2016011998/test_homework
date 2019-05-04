import java.util.Scanner;

public class Insert
{

    private Student stu;

    public Insert()
    {
        System.out.println("Please input his/her studentId:");
        Scanner scan=new Scanner(System.in);
        int id=scan.nextInt();
        System.out.println("Please input his/her name:");
        String name=scan.next();
        System.out.println("Please input his/her Birthday(yyyy-mm-dd)");
        String birthday=scan.next();
        System.out.println("Please input his/her gender(1 for male and 0 for female):");
        int isman=scan.nextInt();
        if(isman==1)
            stu=new Student(id,name,birthday,true);
        else if(isman==0)
            stu=new Student(id,name,birthday,false);
    }

    Student getStu()
    {
        return stu;
    }
}
