
public class shoujigongneng {
	String name;
	String brand;
	int price;
	void boda(){
		System.out.println("拨打电话");
	}
	void faduxin(){
		System.out.println("发短信");
	}
	shoujigongneng(String name,String brand,int price){
		this.name=name;
		this.brand=brand;
		this.price=price;
		
	}
	void shuchu(){
		System.out.println(name+"的品牌是"+brand+"他的价格是"+price);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoujigongneng sj=new shoujigongneng("爆米花","huawei",999);
		sj.boda();
		sj.faduxin();
		sj.shuchu();
		
	}

}
