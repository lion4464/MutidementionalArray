import java.util.*;
class eight_03{
	public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
	// ------------------------------------------------------
	//Enter amount of questions
	// ------------------------------------------------------
					System.out.print("Enter amount of Questions:");
				int amountQuestions=input.nextInt();  
	// ------------------------------------------------------
	//Enter amount of Students  
	// ------------------------------------------------------
				System.out.print("Enter amount of Students:");
				int amountStudents=input.nextInt();
		char[][] Newarr=new char[amountStudents][amountQuestions];

	// ------------------------------------------------------
	// Initializing element of multi Arr
	// ------------------------------------------------------

		for (int i=0;i<Newarr.length;i++) {
				System.out.print("Enter"+(i+1)+"-Student answer:");
			for (int j=0;j<amountQuestions;j++) {
				Newarr[i][j]=input.next().charAt(0);
				}
		}
	// ------------------------------------------------------
	// enter Right of Answers via console
	// ------------------------------------------------------
	System.out.print("Enter RIGHT answers via white space:");
		char[] AnswerArr=new char[amountQuestions];
		for (int k=0;k<AnswerArr.length;k++) {
			AnswerArr[k]=input.next().charAt(0);
		}

		// for (int i=Newarr.length-1;i>=0;i--) {
		// 	for (int e:Newarr[i]) {
		// 		System.out.print(e+" ");
		// 	}
		// }
	// ------------------------------------------------------
	// Call methed to find amount of right answer!!!!
	// ------------------------------------------------------
		
		CheckAnswer(Newarr,AnswerArr);
	}
	public static void CheckAnswer(char[][] Newarr,char[] AnswerArr){
		for (int i=((Newarr.length)-1);i>=0;i--) {
			int count=0;
				// System.out.print(i);
			for (int j=0;j<AnswerArr.length;j++) {
				if (Newarr[i][j]==AnswerArr[j])
					{count++;}
			}
			System.out.println("Student "+i+"'s correct answer: "+count);
		}
	}

}