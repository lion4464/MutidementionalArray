import java.util.*;
class eighth_25 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[][] three=new double[3][3];
		System.out.println("Enter a 3−by−3 matrix row by row:");
			for (int i=0;i<three.length;i++) {
					for (int j=0;j<three[i].length;j++) {
						three[i][j]=input.nextDouble();
					}
				}
	boolean isMarkov=isMarkovMatrix(three);
			if (isMarkov)
					System.out.println("It is a Markov matrix");
			else
					System.out.println("It is not a Markov matrix");

		
		}
//==================IS=MARKOV=MATRIX==================
public static boolean isMarkovMatrix(double[][] m){
		final double EPSILON = 1E-14;
		boolean isMarkov=false;
			for (int i=0;i<m[0].length;i++) {
				double sum=0;
				for (int j=0;j<m.length;j++) {
						if (m[j][i]>=0) {
							sum+=m[j][i];
						}
					}
				if (Math.abs(sum-1)<EPSILON) {
					isMarkov=true;
				}
			}
			return isMarkov;
		}
}