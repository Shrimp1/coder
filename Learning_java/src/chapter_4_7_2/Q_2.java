package chapter_4_7_2;

public class Q_2 {
	public static void main(String args[]) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=4+i;j++) {
				if(j>3-i){
					System.out.print("*");
				}
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
