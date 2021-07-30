import java.util.*;
class eighth_29 {
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
		     System.out.print("The two arrays are identical");
		else
		     System.out.print("The two arrays are not identical");	  
	}
//=======================Equal method=============================

	public static boolean equals(int[][] m1, int[][] m2){
		boolean res=true;
			for (int i=0;i<m1.length;i++) {
					for (int j=0;j<m1[i].length;j++) {
						if (isEQUAL(m1[i][j],m2)){
							res&=true;
						}
						else{
							res&=false;
						}
					}
				}
				return res;
	}

//======================== check isEqual===========================

	public static boolean isEQUAL(int son,int[][] m2){
					boolean result=false;
				for (int i=0;i<m2.length;i++) {
					for (int j=0;j<m2[i].length;j++) {
						 if (m2[i][j]==son){
						 	result=true;
						 }
					}
				}
				return result;
			}
}