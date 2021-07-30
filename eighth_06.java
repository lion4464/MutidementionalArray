public class eighth_06{
	public static void main(String[] args) {
		//----------------ennounse a matrix-----------
		double[][] a_matrix={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		//-----------------ennounse b matrix-------
		double[][] b_matrix={
			{0,2,4},
			{1,4.5,2.2},
			{1.1,4.3,5.2}
		};
		// ----------Call addMatrix method----------
		double[][] c=addMatrix(a_matrix,b_matrix);
		//-----------Print all "c" array's elements------
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
				System.out.printf("%.1f\t",c[i][j]);
			}
			System.out.print("\n");
		}
	}
	// addMatrix method
	public static double[][] addMatrix(double[][] a, double[][] b){
		// create new MULTIDEMENTION ARRAY
		double[][] c=new double[a.length][a[0].length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				for (int k=0;k<a.length;k++) {
				c[i][j]+=a[i][k]*b[k][j];
					}
				}
		}
		return c;
	}
}