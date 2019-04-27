
public class Editstu {
	private Student newstu;
	public Editstu(Student ori) {
		System.out.println("His/Her origin information:");
		new FindConq(ori);
		System.out.println("Update his/her information:");
		Insert edit=new Insert();
		newstu=edit.getStu();
	}
	
	public Student getNewinf() {
		return newstu;
	}

}
