
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
	System.out.println("我今年"+age+"我叫"+name+"我的学号是"+num+"我的地址是"+addr+"我的性别是"+sex);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student(20,"liangxiuwei",2012214265,"hfut",'B');
		stu1.ShuChu();
	}

}
