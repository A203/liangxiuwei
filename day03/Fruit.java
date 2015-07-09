
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
		System.out.println("水果"+name+"的价格是"+price+"它的产地是"+addr);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Fruit("苹果", 10,"泰国");
			apple.shuchu();	
	}

}
