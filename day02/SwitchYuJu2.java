
       import java.util.Scanner;
		public class SwitchYuJu2 {

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scanner=new Scanner(System.in);
				String monthString=scanner.nextString();
				int day;
				switch(monthString)
				{
				case "monday":day=1;break;
				case "tuesday":day=1;break;
				case "wednesday":day=1;break;
				case "thursday":day=1;break;
				case "friday":day=1;break;
				case "saturday":day=1;break;
				case "sunday":day=1;break;
				
				}
				System.out.println(day);
			}
	}


