class eighth_31 {
	public static void main(String[] args) {
		double[][] points={
	// 		 x, y	
			{2,2,5, -1.0},//x1,y1
			{4.0, 2.0,-1.0, -2},//x3,y3

		};
	double[]Intersec=getIntersectingPoint(points);
		for (int i = 0; i < Intersec.length; i++) {
			System.out.println("Intersec["+i+"] = " + Intersec[i]);
		}
	}
	
	public static double[] getIntersectingPoint(double[][] points){
		double[] arr=new double[2];
		double a=points[0][1]-points[0][3];
		double b=points[0][0]-points[0][2];
		double c=points[1][1]-points[1][3];
		double d=points[1][0]-points[1][2];
		double e=a*points[0][0]-b*points[0][1];
		double f=c*points[1][0]-d*points[1][1];
		arr[0]=((e*d-b*f)/(a*d-b*c));
		arr[1]=((a*f-e*c)/(a*d-b*c));
		return arr;
	}
}