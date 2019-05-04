
import java.util.ArrayList;
import java.util.Iterator;

public class Outlist {
    public Outlist(ArrayList<Student> list) {
    	Iterator<Student> it=list.iterator();
    	Student cur=null;
    	System.out.println("*****************List***************");
    	while(it.hasNext()) {   //判断是否下一个对象 有则执行while循环
    		cur=it.next();   //读取下一条记录
    		if(cur.isIsman())   //判断性别 输出不同信息
    		System.out.println(cur.getStudentId()+" "+cur.getName()+" "+cur.getBirthday()+" Male");
    		else
    		System.out.println(cur.getStudentId()+" "+cur.getName()+" "+cur.getBirthday()+" Female");	
    	}
    	System.out.println("*****************End****************");
    			
    }
}
