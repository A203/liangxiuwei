
public class Fruit {
	String name;
	int price;
	String addr;
	Fruit(String name,int price,String addr){
		this.name=name;
		this.price=price;
		this.addr=addr;
	}
	void shuchu(){
		System.out.println("ˮ��"+name+"�ļ۸���"+price+"���Ĳ�����"+addr);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Fruit("ƻ��", 10,"̩��");
			apple.shuchu();	
	}

}
