package shangkelianxi;
public class Whilezhishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2, num=0;
		System.out.println("=======================");
		
		while(i<=99)
		{
			for(int j=2;j<=i-1;j++)
				{
				if(i%j==0)
					{break;}			
				else 
					System.out.println(i);
					num++;
					break;
				}
			
			i++;
		}
		
		System.out.println("num=" + num);
	}
}
