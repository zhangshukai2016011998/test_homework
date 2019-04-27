import java.util.Scanner;

public class SMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager sm=new StudentManager();
		while(true) {
		    System.out.println("Please input your operation number:\n"
		    		+ "******************************** \n"
		    		+ "*         1. insert            * \n"
		    		+ "*         2. delete            * \n"
		    		+ "*         3. search            * \n"
		    		+ "*         4. output            * \n"
		    		+ "*         5.  edit             * \n"
		    		+ "*         6.  exit             * \n"
		    		+ "******************************** \n");
		    Scanner scan=new Scanner(System.in);
		    int op=scan.nextInt();
            if(op==1) {
            	Insert ins=new Insert();
            	if(sm.insert(ins.getStu()))
            		System.out.println("Insert success!");
            	else
            		System.out.println("Insert failed!");
            	
            }else if(op==2) {
            	 Delete del=new Delete();
            	 if(sm.delete(del.getName()))
            		 System.out.println("Delete success!");
            	 else 
            		 System.out.println("Delete failed !");
          	
            }else if(op==3) {
            	 System.out.println("Please Input his/her name:");
            	  Scanner seca=new Scanner(System.in);
            	  String nam=seca.nextLine();
            	  Student conq=sm.find(nam);
            	  if(conq!=null)
            		  new FindConq(conq);
            	  else
            		  System.out.println("Not find!");
            	
            }else if(op==4) {
            	    new Outlist(sm.output());
            }else if(op==5) {
            	System.out.println("Please input his/her name");
            	Scanner sesc=new Scanner(System.in);
            	String oriname=sesc.nextLine();
                Student oristu=sm.find(oriname);
                Editstu edit=new Editstu(oristu);
                
                if(sm.edit(edit.getNewinf(), oriname))
                	System.out.println("Update success!");
                else
                	System.out.println("Update failed");
            }else{
            	break;
            }    
		}
		System.exit(0);	
	}

}
