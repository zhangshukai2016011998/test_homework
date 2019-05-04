
import java.util.Scanner;

//删除功能的实现

public class Delete {
	private String name;
	
	public Delete() {
		Scanner scan=new Scanner(System.in);	//获取控制台输入参数
		name=scan.nextLine();     //返回name
	}
	
	public String getName() {
		return name;
	}

}
