
public class Student {
int age;
String name;
int num;
String  addr;
char sex;
Student(int age,String name,int num,String addr,char sex){
	this.age=age;
	this.name=name;
	this.num=num;
	this.addr=addr;
	this.sex=sex;

}
void ShuChu(){
	System.out.println("�ҽ���"+age+"�ҽ�"+name+"�ҵ�ѧ����"+num+"�ҵĵ�ַ��"+addr+"�ҵ��Ա���"+sex);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student(20,"liangxiuwei",2012214265,"hfut",'B');
		stu1.ShuChu();
	}

}
