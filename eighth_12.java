
class eigth_12 {
	// MAIN method
	public static void main(String[] args) {
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

		int[][] brackets = {
			{8350, 33950, 82250, 171550, 372950}, // Single filer
			{16700, 67900, 137050, 20885, 372950}, // Married jointly
			// −or qualifying widow(er)
			{8350, 33950, 68525, 104425, 186475}, // Married separately
			{11950, 45500, 117450, 190200, 372950} // Head of household
			};
				for (int i=0;i<brackets.length;i++) {
						double sum=ComputeTax(rates,brackets[i]);
						System.out.print(sum+"\n");
				}

		}
		
		// ComputeTAX method
		public static double ComputeTax(double[] rates,int[] brackets){
			double tax=0;
			 tax+=brackets[0] * rates[0];
				for (int j=0;j<brackets.length-1;j++) {
							tax +=(brackets[j+1]-brackets[j])*rates[j+1];
				}
				tax+=(400000-brackets[brackets.length-1])*rates[brackets.length];
				return tax;
		}
		
}