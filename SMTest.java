import java.util.Scanner;

public class SMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager sm=new StudentManager();    //创建StudentManager对象
		while(true) {         //为防止跳出循环 使用这种结构
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
		    int op=scan.nextInt();      //读取控制台输入
            if(op==1) {   //输入1为插入操作
            	Insert ins=new Insert();
            	if(sm.insert(ins.getStu()))     //执行insert成功 返回成功提示
            		System.out.println("Insert success!");
            	else     //否则返回失败
            		System.out.println("Insert failed!");
            	
            }else if(op==2) {   //2为删除操作
            	 Delete del=new Delete();
            	 if(sm.delete(del.getName()))   //执行delete方法成功 返回成功提示
            		 System.out.println("Delete success!");
            	 else      //否则返回失败
            		 System.out.println("Delete failed !");
          	
            }else if(op==3) {        //3为查找操作 
            	 System.out.println("Please Input his/her name:");
            	  Scanner seca=new Scanner(System.in);  //读取控制台输入的字符
            	  String nam=seca.nextLine();
            	  Student conq=sm.find(nam);    //执行find操作
            	  if(conq!=null)    //判断conq是否为空 若为空 返回错误提示
            		  new FindConq(conq);
            	  else
            		  System.out.println("Not find!");
            	
            }else if(op==4) {     //4为执行输出操作
            	    new Outlist(sm.output()); // 调用output方法执行输出操作
            }else if(op==5) {      //5为执行修改操作
            	System.out.println("Please input his/her name");
            	Scanner sesc=new Scanner(System.in);   //控制台读取
            	String oriname=sesc.nextLine();
                Student oristu=sm.find(oriname);     // 查找对应名字的学生
                Editstu edit=new Editstu(oristu);         //修改
                
                if(sm.edit(edit.getNewinf(), oriname))   //传输参数 执行edit方法
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
