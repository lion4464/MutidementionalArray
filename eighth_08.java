class eighth_08 {
	public static void main(String[] args) {
		double[][] a_matrix={
			{2,0},
			{0,2},
			{2,1},
			{2,2},
			{4,2},
			{2,3},
		};
		
		// min Distance
				int minIndex=0;
				int minIndex1=1;
			    double mindistance=Distance(a_matrix[0][0],a_matrix[0][1],a_matrix[1][0],a_matrix[1][1]); 

		//contras between i row and i+1 row's
		
		for (int i=0;i<a_matrix.length;i++) {
			for (int j=i+1;j<a_matrix.length;j++) {
				double distance=Distance(a_matrix[i][0],a_matrix[i][1],a_matrix[j][0],a_matrix[j][1]);
				if (mindistance>distance) {
					mindistance=distance;
					minIndex=i;
					minIndex1=j;
				}
			}
		}

		// print nearest a_matrix
		for (int i=0;i<a_matrix.length;i++) {
			for (int j=i+1;j<a_matrix.length;j++) {
				double d=Distance(a_matrix[i][0],a_matrix[i][1],a_matrix[j][0],a_matrix[j][1]);
								if (mindistance==d) {
								System.out.println("The closest two a_matrix are " +
									"(" + a_matrix[i][0] + ", " + a_matrix[i][1]+", " + ") and (" +
 									a_matrix[j][0] + ", " + a_matrix[j][1]+", " + ")");			
								}
		
							}
				}
				System.out.println("Ther distance is " + mindistance);

	}
	// detect DISTANCE
	public static double Distance(double x1,double y1, double x2, double y2){
		double dis=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	 return dis;
	}
}