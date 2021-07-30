import java.util.*;
class eighth_26 {
	public static void main(String[] args) {
//===================announse new multiarray===============
		double[][] matrix=new double[4][4];
			Scanner input=new Scanner(System.in);
		System.out.println("Enter a 4−by−4 matrix row by row:");
			for (int i=0;i<matrix.length;i++) {
					for (int j=0;j<matrix[i].length;j++) {
						matrix[i][j]=input.nextDouble();
					}
				}
//===================Call to sorted method==========================
				double[][] sortedArray=sortRows(matrix);
// ====================Call print method===================
				ToPrint(sortedArray);
			}
//=======================Sorted method===============================
	public static double[][] sortRows(double[][] m){
		double[][] marakko=new double[m.length][m[0].length];
		for (int i=0;i<m.length;i++) {
			marakko[i]=Tosort(m[i]);
		}
		return marakko;
	}
//=======================Sorted elemets==============================
	public static double[] Tosort(double[] l){
		double[] list=new double[l.length];
			for (int an=0;an<list.length;an++) {
				list[an]=l[an];
			}
		for (int i=0;i<list.length;i++) {
			int minIndex=i;
			double min=list[minIndex];
				for (int j=i+1;j<list.length;j++) {
					if (min>list[j]) {
						min=list[j];
						minIndex=j;
					}
				}
				if (minIndex!=i) {
					list[minIndex]=list[i];
					list[i]=min;
				}
		}
		return list;
	}
//========================Print method================================
			public static void ToPrint(double[][] r){
				System.out.println("=========Result:)====================");
				for (int i=0;i<r.length;i++) {
					for (int j=0;j<r[i].length;j++) {
						System.out.print(r[i][j]+" ");
					}
					System.out.println();
				}
			}

}