class eighth_11 {
	public static void main(String[] args) {

		//================call toBinar method====================
		char[] son=toBinar(7);

		//-----------------Enter to multidemention ARRAY from Single array------------- 
		char[][] mniner=new char[3][3];
						int k=0;
					for(int i=0;i<mniner.length;i++){
						for(int j=0;j<mniner[i].length;j++){
						mniner[i][j]=son[k++];
						}

					}
	//------------------Print elements 2 dementional ARRAY----------------------
		for (int r=0;r<mniner.length;r++) {
			for (int l=0;l<mniner[r].length;l++) {
			System.out.print(mniner[r][l]);
			}
			System.out.print("\n");
		}

	}
	//---------------Konvert to binar number from decimal number-------------------
	public static char[] toBinar(int a){
		int[] son=new int[9];
		int ind=0;
		while (a>0) {
			int b=a%2;
			son[ind++]=b;
			a=a/2;
		}
		//---------------fill to char 9 length array with T OR H-----------------  
			char[] niners=new char[9];
				for(int j=son.length-1,i=0;i<son.length;i++,j--){
				if (son[j]==1) {
					niners[i]='T';
				}else{
					niners[i]='H';
					}
				}

		return niners;
	}
}