import java.util.*;
class eighth_04{
	public static void main(String[] args) {
		double[][] Newarr={
			{1,3,2,23},
			{1,5,6,7},
			{8,9,0,6},
			{8,9,0,1}
		};
		
		
		// --------------create new array to store sum of row----------------
		
		double[] newSarr=new double[Newarr.length];

		// --------------Call sumRow method--------------------------
				sumRow(Newarr,newSarr);
		

		// --------------Print multidemention array--------------------------
		for (int i=0;i<Newarr.length;i++) {
			for (int j=0;j<Newarr[i].length;j++) {
				System.out.print(Newarr[i][j]+" ");
			}
			System.out.print("\n");
		}

		//---------------Call Sort SINGLE ARRAY----------------------
		SelectSort(newSarr,Newarr);

		System.out.print("After\n");
		// --------------Print multidemention array--------------------------
		for (int i=0;i<Newarr.length;i++) {
			for (int j=0;j<Newarr[i].length;j++) {
				System.out.print(Newarr[i][j]+" ");
			}
			System.out.print("\n");
		}


		// --------------Print sum newSumArray-----------------------
		
				for (int j=0;j<newSarr.length; j++) {
					System.out.print(newSarr[j]+" ");
			}		

	}
		//---------------- sumRow() method--------------------------- 

	public static void sumRow(double[][] Newarr,double[] newSarr){

				for (int i=0;i<Newarr.length;i++){
					double s=0;
						for (int j=0;j<Newarr[i].length;j++){
								s+=Newarr[i][j];
						}
						newSarr[i]=s;
				}
					
	}
	    //------------- Sorting elemts of single Array--------------

	public static void SelectSort(double[] a,double[][] m_arr){
		for (int i=0;i<a.length;i++) {
			double min=a[i];
			int minIndex=i;
			for (int j=i+1;j<a.length;j++) {
				if (min>a[j]) {
					min=a[j];
					minIndex=j;
				}
			}
			if (minIndex!=i) {
				double temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
					Swapping(m_arr,i,minIndex);
				}
		}
	}
	  //-----------Sorting Arrays of Multidemention Array-------------

	public static void Swapping(double[][] a,int i,int b){
					double[] temp=a[i];
					 a[i]=Arrays.copyOf(a[b],a[b].length);	
					 a[b]=temp;
	}

}