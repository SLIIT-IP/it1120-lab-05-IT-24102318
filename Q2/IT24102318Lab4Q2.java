import java.util.Scanner;
public class IT24102318Lab4Q2 {
       public static void main(String[] args) {
	          Scanner scanner = new Scanner(System.in);
			  double examMarks = getValidMark(scanner, "Enter exam marks (0-100): ");
              double labMarks = getValidMark(scanner, "Enter lab submission marks (0-100): ");
              double examPercentage = getValidPercentage(scanner, "Enter percentage for exam marks: ");
              double labPercentage = getValidPercentage(scanner, "Enter percentage for lab submission marks: ");
              while (examPercentage + labPercentage != 100) {
					System.out.println("The total percentage must add up to 100.Please re-enter the percentages.");
				    examPercentage = getValidPercentage(scanner, "Enter percentage for exam marks: ");
					labPercentage = getValidPercentage(scanner, "Enter percentage for lab submission marks: ");
			  }
			  double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
			  System.out.printf("The final mark is: %.2f%n", finalMark);
			  scanner.close();
			}
			private static double getValidMark(Scanner scanner, String prompt) {
			  double mark;
			  while (true) {
			      System.out.print(prompt);
				  mark = scanner.nextDouble();
				  if (mark >= 0 && mark <=100) {
				      break;
				  } else {
				      System.out.println("Invalid input. Marks should be between 0 and 100.");
				  }
			  }
			  return mark;
			}
			private static double getValidPercentage(Scanner scanner, String prompt) {
			  double percentage;
			  while (true) {
			     System.out.print(prompt);
				 percentage = scanner.nextDouble();
				 if (percentage >= 0 && percentage <= 100) {
				     break;
				 } else {
				     System.out.println("Invalid input. Percentage should be between 0 and 100.");
				 }
			  }
			  return percentage;
			}
}
