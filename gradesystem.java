import java.util.ArrayList;
import java.util.Scanner;
public class gradesystem{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double>marks=new ArrayList<>();
        System.out.printf("Enter the number of students");
        int num=sc.nextInt();
        for (int i=0;i<num ;i++ ){
            System.out.println("Enter grades for student " + (i + 1) + ": ");
            double grade=sc.nextInt();
            if(grade<0||grade>100){
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                System.out.print("Re-enter grade for student " + (i + 1) + ": ");
                grade = sc.nextDouble();
            }
            marks.add(grade);
        } 
        double sum = 0;
        double max = marks.get(0);
        double min = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            double grade = marks.get(i);
            sum += grade;

            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        double average = sum / marks.size();

        System.out.println("\nGrade Summary:");
        System.out.println("Total Students: " + marks.size());
        System.out.println("Average Grade:" + String.format("%.2f", average));
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
        
    }
}