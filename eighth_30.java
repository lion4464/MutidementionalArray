import java.util.*;
class eighth_30 {
	public static void main(String[] args) {
		double[][] a=new double[2][2];
		double[]  b=new double[2];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 2−by−2 matrix row by row:");
			for (int i=0;i<a.length;i++) {
					for (int j=0;j<a[i].length;j++) {
						a[i][j]=input.nextDouble();
					}
				}
		System.out.println("Enter b array's elemets:");
			for (int k=0;k<b.length;k++) {
				b[k]=input.nextDouble();
			}

		double[] result=linearEquation(a,b);
		if (result==null) {
			System.out.println("Result is null");
		}else{
			for (int l=0;l<result.length;l++) {
				if (l==0)
					System.out.println("x="+result[l]);
				else
					System.out.println("y="+result[l]);
			}	
		}
		
	}
//========================linearEquation method============================
	public static double[] linearEquation(double[][] a, double[] b){
		double[]  XandY=new double[2];
		if ((a[0][0]*a[1][1]-a[0][1]*a[1][0])==0) {
			return null;
		}
		else{
			double	x=(b[0]*a[1][1]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
			double  y=(b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
		XandY[0]=x;
		XandY[1]=y;
		}
		return XandY;
	}
}