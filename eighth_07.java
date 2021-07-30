class eighth_07 {
	public static void main(String[] args) {
		double[][] a_matrix={
			{-1, 0, 3},
			{-1,-1,-1},
			{4, 1, 1},
			{2, 0.5, 9},
			{3.5, 2,-1},
			{3, 1.5, 3},
			{-1.5, 4, 2},
			{5.5, 4,-0.5}
		};
		
		// min Distance
				int minIndex=0;
				int minIndex1=1;
			    double mindistance=Distance(a_matrix[0][0],a_matrix[0][1],a_matrix[0][2],a_matrix[1][0],a_matrix[1][1],a_matrix[1][2]); 

		//contras between i row and i+1 row's
		
		for (int i=0;i<a_matrix.length;i++) {
			for (int j=i+1;j<a_matrix.length;j++) {
				double distance=Distance(a_matrix[i][0],a_matrix[i][1],a_matrix[i][2],a_matrix[j][0],a_matrix[j][1],a_matrix[j][2]);
				if (mindistance>distance) {
					mindistance=distance;
					minIndex=i;
					minIndex1=j;
				}
			}
		}

		// print nearest a_matrix
		System.out.println("The closest two a_matrix are " +
		"(" + a_matrix[minIndex][0] + ", " + a_matrix[minIndex][1]+", " + a_matrix[minIndex][2] + ") and (" +
 			a_matrix[minIndex1][0] + ", " + a_matrix[minIndex1][1]+", " + a_matrix[minIndex1][2] + ")");
	}
	// detect DISTANCE
	public static double Distance(double x1,double y1,double z1, double x2, double y2,double z2){
		double dis=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)+Math.pow((z2-z1),2));
	 return dis;
	}
}