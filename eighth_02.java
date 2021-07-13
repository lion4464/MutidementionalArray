import java.util.*;
public class eighth_01{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		double[][] Newarr=new double[4][4];

		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				Newarr[i][j]=input.nextDouble();
			}
		}


				double sum=averageMajorDiagonal(Newarr);
				
				System.out.printf("%.2f",sum,";\n");
	}
	public static double averageMajorDiagonal(double[][] m){
		int count=0;
		double sum=0;
		for (int i=0,j=i;i<m.length;i++) {
			sum+=m[i][i];
			count++;
		}
	double result=sum/count;
	return result;
	}


}