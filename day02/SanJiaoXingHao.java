
public class SanJiaoXingHao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		for(int i=1;i<=num;i++){
			//����ո�
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			//�����Ǻ�
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
