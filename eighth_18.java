import java.util.*;
class eighth_18 {
	public static void main(String[] args) {
		int[][] m = {
			{1, 2}, 
			{3, 4}, 
			{5, 6}, 
			{7, 8}, 
			{9, 10}
		};
	//=========== to call shuffle method==============
		shuffle(m);
		ToPrint(m);
	}
//================SHUFFLE METHOD===========
	public static void shuffle(int[][] m){
		for (int i=0;i<m.length;i++) {
			int begin_index=i;
			int change_index=(int)(Math.random()*m.length);
			int[] temp=m[change_index];
					 m[change_index]=Arrays.copyOf(m[begin_index],m[begin_index].length);	
					 m[begin_index]=temp;
		}
	}
//==============Print method====================
			public static void ToPrint(int[][] r){
				for (int i=0;i<r.length;i++) {
					for (int j=0;j<r[i].length;j++) {
						System.out.print(r[i][j]+" ");
					}
					System.out.println();
				}
			}
}