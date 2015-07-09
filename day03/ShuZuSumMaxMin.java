
public class ShuZuSumMaxMin {
  public static void main(String[] args) {
	int []arr={44,77,22,45,12,78};
	int sum=0;
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		if(arr[i]>max){
			max=arr[i];
			continue;
		}
		if(arr[i]<min){
			min=arr[i];
		}
	}
	System.out.println("sum="+sum);
	System.out.println("max="+max);
	System.out.println("min="+min);
	System.out.println("数组的长度为："+arr.length);
}
}
