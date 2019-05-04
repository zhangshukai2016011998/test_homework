public class FindConq
{
    public FindConq(Student stu)
    {
        //System.out.println(":");
        System.out.println("Id: "+stu.getStudentId());
        System.out.println("Name:"+stu.getName());
        System.out.println("Birthday:"+stu.getBirthday());
        //System.out.println("");
        if(stu.isIsman())
            System.out.println("Gender:male");
        else
            System.out.println("Gender:female");

    }
}
