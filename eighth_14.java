class eighth_14 {
	//========================= main method=====================
	public static void main(String[] args) {
	
		int[][] matrix=new int[4][4];
		// ===Call generateMAtrix() method=======
		generateMatrix(matrix);
		// ===============PRINT all elements of matrix=============
		for (int i=0;i<matrix.length;i++) {
				for (int j=0;j<matrix[i].length;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.print("\n");
			}

		// ===Call ComputeDiaganal() method=======
		ComputeDiaganal(matrix);
		
		// ===Call ComputeSubDiaganal() method=======
		ComputeSubDiaganal(matrix);
		
		// ===Call DetectSamesRows() method=======
		for (int i=0;i<matrix.length;i++) {
		boolean bor=DetectSamesRows(matrix,1,i);
		if (bor)
			System.out.print("1's in "+i+"\n");
		boolean bori=DetectSamesRows(matrix,0,i);
			if (bori)
			System.out.print("0's in "+i+"\n");
		}

	}
	// ===============GENERATE randomly number and entere to matrix METHOD===========
	
	public static void generateMatrix(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = (int)(Math.random() * 2);
            }
        }
    }
    //====================== method of count of diaganal=====================
    public static void ComputeDiaganal(int[][] m){
			boolean isEQUAL=true;
			for (int i=0;i<m.length;i++) {
				for (int j=0;j<m.length;j++) {
					if (m[i][i]==m[j][j]) {
						isEQUAL&=true;
					}
					else{
					isEQUAL&=false;	
					}
				}
			}
			if (isEQUAL) {
				System.out.println("The same VALUES in on the major diagonal");
			}else{
				System.out.println("NO SAME VALUES in on the major diagonal");
			}

		}

    //====================== method of count of diaganal=====================
    public static void ComputeSubDiaganal(int[][] m){
			boolean isEQUAL=true;
			for (int i=1,t=0;i<m.length-1;i++) {
					if (m[i][t]==m[i+1][t+1]) {
						isEQUAL&=true;
					}
					else{
					isEQUAL&=false;	
					}
			t++;	
			}
			if (isEQUAL) {
				System.out.println("The same VALUES in on the sub-diagonal");
			}else{
				System.out.println("NO SAME VALUES in on the sub-diagonal");
			}

		}
	//===================detect SAME VALUE IN A ROW method=====================
		public static boolean DetectSamesRows(int[][] m,int son,int rows){
			
		boolean result=true;
			for (int i=0;i<m.length;i++) {
				if (son!=m[rows][i]) {
					result=false;
				 }
			}
			return result;
		}
}