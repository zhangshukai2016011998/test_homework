import java.util.Scanner;

public class SMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManager sm=new StudentManager();    //����StudentManager����
		while(true) {         //Ϊ��ֹ����ѭ�� ʹ�����ֽṹ
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
		    int op=scan.nextInt();      //��ȡ����̨����
            if(op==1) {   //����1Ϊ�������
            	Insert ins=new Insert();
            	if(sm.insert(ins.getStu()))     //ִ��insert�ɹ� ���سɹ���ʾ
            		System.out.println("Insert success!");
            	else     //���򷵻�ʧ��
            		System.out.println("Insert failed!");
            	
            }else if(op==2) {   //2Ϊɾ������
            	 Delete del=new Delete();
            	 if(sm.delete(del.getName()))   //ִ��delete�����ɹ� ���سɹ���ʾ
            		 System.out.println("Delete success!");
            	 else      //���򷵻�ʧ��
            		 System.out.println("Delete failed !");
          	
            }else if(op==3) {        //3Ϊ���Ҳ��� 
            	 System.out.println("Please Input his/her name:");
            	  Scanner seca=new Scanner(System.in);  //��ȡ����̨������ַ�
            	  String nam=seca.nextLine();
            	  Student conq=sm.find(nam);    //ִ��find����
            	  if(conq!=null)    //�ж�conq�Ƿ�Ϊ�� ��Ϊ�� ���ش�����ʾ
            		  new FindConq(conq);
            	  else
            		  System.out.println("Not find!");
            	
            }else if(op==4) {     //4Ϊִ���������
            	    new Outlist(sm.output()); // ����output����ִ���������
            }else if(op==5) {      //5Ϊִ���޸Ĳ���
            	System.out.println("Please input his/her name");
            	Scanner sesc=new Scanner(System.in);   //����̨��ȡ
            	String oriname=sesc.nextLine();
                Student oristu=sm.find(oriname);     // ���Ҷ�Ӧ���ֵ�ѧ��
                Editstu edit=new Editstu(oristu);         //�޸�
                
                if(sm.edit(edit.getNewinf(), oriname))   //������� ִ��edit����
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
