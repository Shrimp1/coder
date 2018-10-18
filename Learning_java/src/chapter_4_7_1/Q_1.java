package chapter_4_7_1;

public class Q_1 {
	public static void main(String args[])throws Exception{
	
		for(int j=1;j<=9;j++) {
			//System.out.print(j);
			for(int i = 1;i<=j;i++) {
				System.out.print(j+"*"+i+"="+i*j+",");
			}
			System.out.print("\n");
		}
		
	}

}
