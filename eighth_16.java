import java.util.Arrays;

class eighth_16 {
	public static void main(String[] args) {
	int[][] matrix={
		{4, 2},
		{1, 7},
		{4, 5},
		{1, 2},
		{1, 1},
		{4, 1},
		{5,2},
		{5,5},
		{10,8}
	};
		ToRowSort(matrix);
		ToSortColumns(matrix);
			for (int i=0;i<matrix.length;i++) {
				for (int j=0;j<matrix[i].length;j++) {
						System.out.print(matrix[i][j]+" ");
					}
				System.out.println();
			}

	}


//====================matrix rows sorting======================
	public static void ToRowSort(int[][] r){
		
		for (int i=0;i<r.length;i++) {
			int max=r[i][0];
			int maxIndex=i;
				for (int j=i+1;j<r.length;j++) {
					if (max<r[j][0]) {
						maxIndex=j;
						max=r[j][0];
					}
				
				}
					if (maxIndex!=i) {
						Swapping(r,i,maxIndex);
					}
				}
	}
	//====================matrix columns sorting===================
	public static void ToSortColumns(int[][] r){

		for (int i=0;i<r.length;i++) {
			int max=r[i][1];
			int equal=r[i][0];
			int maxIndex=i;
			for (int j=i+1;j<r.length;j++) {
				if (max<r[j][1]&&(equal==r[j][0])) {
					maxIndex=j;
					max=r[j][1];

				}
			}
			if (maxIndex!=i) {

					Swapping(r, i, maxIndex);
			}
		}
	}
 //-----------Sorting Arrays of Multidemention Array-------------

	public static void Swapping(int[][] a,int i,int b){
					int[] temp=a[i];
					 a[i]= Arrays.copyOf(a[b],a[b].length);
					 a[b]=temp;
	} 
}