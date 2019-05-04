
//实现修改学生信息

public class Editstu {
	
	private Student newstu;
	public Editstu(Student ori) {
		System.out.println("His/Her origin information:"); 
		new FindConq(ori);    //调用FindConq方法 输出学生信息
		System.out.println("Update his/her information:");
		Insert edit=new Insert();  //创建edit对象，调用Insert方法实现修改信息
		newstu=edit.getStu();
	}
	
	public Student getNewinf() {
		return newstu;
	}

}
