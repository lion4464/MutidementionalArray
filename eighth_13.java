import java.util.*;
class eigth_13 {
	// MAIN method
	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
		double[][] brackets=new double[4][4];
	//=================to enter to decimal array==================
		System.out.println(" ENTER ELEMENTS OF 4X4 MASSIVE");
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				brackets[i][j]=input.nextDouble();
			}
		}
			// ==============CALL  locateSmallest METHOD=====================
			 int[] sum=locateSmallest(brackets);
			// ================TO PRINT LARGE ELEMENTS OF MASSIVE =================
			  System.out.print("( ");
		 		 for (int i=0;i<sum.length;i++) {
		 	  		System.out.print(sum[i]+" ");
		 	 	  }
		 	  System.out.print(" )");
		}
		//---------------Compare numbers via locateSmallest method------------------
		public static int[] locateSmallest(double[][] a){
			int[] result=new int[2];
			double min=a[0][0];
			int minRowIndex=0;
			int minColumnIndex=0;
				for (int i=0;i<a.length;i++) {
					for (int j=0;j<a[i].length;j++) {
						if (min>a[i][j]) {
							minRowIndex=i;
							minColumnIndex=j;
							min=a[minRowIndex][minColumnIndex];
						}
					}
				}
					result[0]=minRowIndex;
				            result[1]=minColumnIndex;
					return result;
		}
}