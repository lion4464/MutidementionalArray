import java.util.*;
class eighth_01{
	public static void main(String[] args) {
		double[][] Newarr={
			{1,3,2,4},
			{1,5,6,7},
			{8,9,0,6}
		};

	for (int i=0;i<Newarr.length;i++) {
				double sum=sumRow(Newarr,i);
				for (int j=0;j<Newarr[i].length; j++) {
					System.out.print(Newarr[i][j]+" ");
				}
				System.out.print("="+sum+";\n");
			}		

	}

public static double sumRow(double[][] Newarr,int rowIndex){
				int i=rowIndex;
				double s=0;
					for (int j=0;j<Newarr[i].length;j++) {
							s+=Newarr[i][j];
					}
		return s;
	}
}