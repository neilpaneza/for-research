import java.util.Scanner;

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Student's Name:");
String student = scanner.nextLine();

System.out.print("Enter 1st Quarter Grade:");
int firstQuarter = scanner.nextInt();

System.out.print("Enter 2nd Quarter Grade:");
int secondQuarter = scanner.nextInt();

System.out.print("Enter 3rd Quarter Grade:");
int thirdQuarter = scanner.nextInt();

System.out.print("Enter 4th Quarter Grade:");
int fourthQuarter = scanner.nextInt();

String studentName = student;

System.out.println("Student's Name: " + studentName);


double average = (firstQuarter + secondQuarter + thirdQuarter + fourthQuarter)/4;

if (average == 90){
    System.out.println("You PASSED with Honor with an average of" + average);
}
else if (average >=75){
    System.out.println("You Passed with an average of " + average);
}
else{
    System.out.println("You FAILED with an average of " + average);
}


scanner.close();



}

