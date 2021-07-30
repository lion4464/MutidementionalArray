import java.util.*;
class eighth_28 {
	public static void main(String[] args) {
		int[][] m1=new int[3][3];
		int[][] m2=new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 3−by−3 matrix row by row:");
			for (int i=0;i<m1.length;i++) {
					for (int j=0;j<m1[i].length;j++) {
						m1[i][j]=input.nextInt();
					}
				}
		System.out.println("Enter a 3−by−3 matrix row by row:");
			for (int k=0;k<m2.length;k++) {
					for (int m=0;m<m2[k].length;m++) {
						m2[k][m]=input.nextInt();
					}
				}
		boolean result=equals(m1,m2);
		if (result)
		     System.out.print("The two arrays are strictly identical");
		else
		     System.out.print("The two arrays are not strictly identical");
	}
//=======================Equal method=======================
	
	public static boolean equals(int[][] m1, int[][] m2){
		boolean result=true;
		for (int i=0;i<m1[0].length;i++) {
			for (int j=0;j<m1.length;j++) {
				if (m1[j][i]!=m2[j][i])
					result&=false;
			}
		}
		return result;
	}
}