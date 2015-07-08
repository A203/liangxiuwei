
public class YiWeiArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int []a1={1,2,3,4,5};
		a=new int[3];
		int size=5;
		a1=new int[size];
		int b[]={1,2,3,4,5};
		//如果设置了初始值，不能再指定长度
		int b1[]=new int[]{1,2,3,4,5};
		//访问数组元素，索引超出数组边界，会抛出数组越界异常。访问数组长度public final length
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int c[]={8,5,7,4};
		int temp=0;
		for(int i=c.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
				temp=c[i];
				c[i]=c[j];
				c[j]=c[i];
	
		}
	}
}
