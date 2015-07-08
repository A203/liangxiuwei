
public class ZhiShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=50;i++){
			boolean type=true;
			for(int j=2;j<i/2;j++){
				if(i%j==0){
					type=false;
					break;
				}
			}
			if (type) {
				System.out.println(i+"\t");
			}
		}
	}

}
