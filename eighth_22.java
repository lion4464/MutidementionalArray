import java.util.*;
class eighth_22 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] sixtosix=new int[6][2];
		System.out.println("Enter a 6−by−2 matrix row by row:");
			for (int i=0;i<sixtosix.length;i++) {
					for (int j=0;j<sixtosix[i].length;j++) {
						sixtosix[i][j]=input.nextInt();
					}
				}
		Tocheck(sixtosix);
		}
//=============check method================
	public static void Tocheck(int[][] m){
			for (int i=0; i<m[0].length;i++) {
				int sum=1;
				for (int j=0;j<m.length-1;j++) {
					if (m[j][i]==m[j+1][i]) {
						sum++;
					}
				}
				if (sum==5) {
					System.out.println("True");
				}
			}
		}
}