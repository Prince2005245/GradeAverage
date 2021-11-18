package GitHub_Work.GradeAverage;
import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        double avg;
                
        System.out.println("Hello, This program calculate the average of 5 grades!");
        
        Scanner input = new Scanner(System.in);
              
        System.out.print("Enter Grade 1: ");
        avg = input.nextInt();
        System.out.print("Enter Grade 2: ");
        avg += input.nextInt();
        System.out.print("Enter Grade 3: ");
        avg += input.nextInt();
        System.out.print("Enter Grade 4: ");
        avg += input.nextInt();
        System.out.print("Enter Grade 5: ");
        avg += input.nextInt();
        input.close();
        
        avg /=5;
        System.out.println("The Average is: " + avg);
        
    }
    
}