
import java.util.Scanner;

//ɾ�����ܵ�ʵ��

public class Delete {
	private String name;
	
	public Delete() {
		Scanner scan=new Scanner(System.in);	//��ȡ����̨�������
		name=scan.nextLine();     //����name
	}
	
	public String getName() {
		return name;
	}

}
