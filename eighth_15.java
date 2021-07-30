import java.util.*;
class eighth_15 {
	//====================MAIN method=========================
	public static void main(String[] args) {
		double[][] m_massive=new double[5][2];
				Scanner input=new Scanner(System.in);

	//=================to enter to decimal array==================
		 System.out.println("Enter five points LIKE: x1 y1 ");
			for (int i=0;i<m_massive.length;i++) {
				for (int j=0;j<m_massive[i].length;j++) {
					m_massive[i][j]=input.nextDouble();
				}
				
			}

	//==========================Print method===============================
				for (int io=0;io<m_massive.length;io++) {
			boolean thesame=DetectSamesRows(m_massive,m_massive[io][0],io);
				if (thesame) {
					System.out.println("The "+Convert(io)+" points are on the same line");
				}
				}
			

	}
	//===================detect SAME VALUE IN A ROW method=====================
		public static boolean DetectSamesRows(double[][] m,double son,int rows){
			
		boolean result=true;
			for (int i=0;i<m[0].length;i++) {
				if (son!=m[rows][i]) {
					result=false;
				 }
			}
			return result;
		}
	//=======================change to string from number method===============
		public static String Convert(int a){
			String result="";
				switch (a) {
					case 0:result="ONE";break;
					case 1:result="TWO";break;
					case 2:result="THREE";break;
					case 3:result="FOUR";break;
					case 4:result="FIFTH";break;
					}
			return result;
			}
}