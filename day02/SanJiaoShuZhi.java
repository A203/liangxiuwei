import java.util.Scanner;
public class SanJiaoShuZhi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=new Scanner(System.in).nextInt();
		for(int i=1;i<=num;i++){
			//����ո�
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			//��������
			for(int j=1;j<=2*i-1;j++){
				if(i<10){
					System.out.print(i);
				}
				else{
					System.out.print((char)('A'+i-10));
				}
			}
			System.out.println();
		}
		//System.out.println();
					
//			1
//		   222
//		  33333
//		 4444444
//		 ........
//		DDDDDDDDD 
//		�к� i  		�ո���			i������
//			1		num-i			2i-1
//			2		num-i		2i
//			13		num-i		2i-1
	}

}
