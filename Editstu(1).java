
//ʵ���޸�ѧ����Ϣ

public class Editstu {
	
	private Student newstu;
	public Editstu(Student ori) {
		System.out.println("His/Her origin information:"); 
		new FindConq(ori);    //����FindConq���� ���ѧ����Ϣ
		System.out.println("Update his/her information:");
		Insert edit=new Insert();  //����edit���󣬵���Insert����ʵ���޸���Ϣ
		newstu=edit.getStu();
	}
	
	public Student getNewinf() {
		return newstu;
	}

}
