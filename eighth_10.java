class eighth_10 {
//--------------------------- MAIN method----------------------
	public static void main(String[] args) {
		int[][] matrix={
			{0,1,1,0,1},
			{0,1,0,1,1},
			{1,0,0,1,0},
			{1,1,1,1,1},
			{0,0,1,0,1}
		};
		System.out.print("The Largest amount in "+sumRow(matrix)+" column\n");
		System.out.print("The Largest amount in "+sumColumns(matrix)+" row");
	}
//--------------------detect max index via Row---------------------------
	public static int sumRow(int[][] arr){
		int sum=0;
		int maxIndex=0;
		int max=0;
		// Find minimum value
		for (int j=0;j<arr[0].length;j++) {
			max+=arr[j][0];
			}

		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
			sum+=arr[j][i];
			if (max<sum) {
				maxIndex=i;
			}
			}
		}

		return maxIndex;
	}
// ---------------------detect max index via Columns------------------------
	public static int sumColumns(int[][] arr){
		int maxIndex=0;
		int max=0;
		// Find minimum value
		for (int j=0;j<arr[0].length;j++) {
			max+=arr[0][j];
			}

		for (int i=0;i<arr.length;i++) {
			int sum=0;
			for (int j=0;j<arr[i].length;j++) {
			sum+=arr[i][j];
			if (max<sum) {
				maxIndex=i;
			}
			}
		}

		return maxIndex;
	}

}