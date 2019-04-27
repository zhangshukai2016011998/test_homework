
import java.util.ArrayList;
import java.util.Iterator;

public class Outlist {
    public Outlist(ArrayList<Student> list) {
    	Iterator<Student> it=list.iterator();
    	Student cur=null;
    	System.out.println("*****************List***************");
    	while(it.hasNext()) {
    		cur=it.next();
    		if(cur.isIsman())
    		System.out.println(cur.getStudentId()+" "+cur.getName()+" "+cur.getBirthday()+" Male");
    		else
    		System.out.println(cur.getStudentId()+" "+cur.getName()+" "+cur.getBirthday()+" Female");	
    	}
    	System.out.println("*****************End****************");
    			
    }
}
