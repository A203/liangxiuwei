
public class shoujigongneng {
	String name;
	String brand;
	int price;
	void boda(){
		System.out.println("����绰");
	}
	void faduxin(){
		System.out.println("������");
	}
	shoujigongneng(String name,String brand,int price){
		this.name=name;
		this.brand=brand;
		this.price=price;
		
	}
	void shuchu(){
		System.out.println(name+"��Ʒ����"+brand+"���ļ۸���"+price);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoujigongneng sj=new shoujigongneng("���׻�","huawei",999);
		sj.boda();
		sj.faduxin();
		sj.shuchu();
		
	}

}
