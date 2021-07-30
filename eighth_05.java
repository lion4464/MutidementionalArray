public class eighth_05{
	public static void main(String[] args) {
		//----------------ennounse a matrix-----------
		double[][] a_matrix={
			{1,4,3},
			{2,3,5}
		};


		//-----------------ennounse b matrix-------
		double[][] b_matrix={
			{4,1,2},
			{3,2,0}
		};
		// ----------Call addMatrix method----------
		double[][] c=addMatrix(a_matrix,b_matrix);
		//-----------Print all "c" array's elements------
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	// addMatrix method
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c=new double[a.length][a[0].length];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
