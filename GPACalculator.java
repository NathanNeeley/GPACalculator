import java.util.Scanner;

public class GPACalculator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Ask for number of classes to initiate length of "for" loop
        System.out.print("Number of Classes: ");
        int i = input.nextInt();
        double sum = 0;
        int sumHours = 0;
        double[] grades = new double[i];
        int[] totalHours = new int[i];
        double[] product = new double[i];
        
        for (int min = 1; i >= min; min++){
            String numberConversion = new String();

            //Conversion of integers to strings
            switch (min){
                case 1:
                    numberConversion = "1st";
                    break;
                case 2:
                    numberConversion = "2nd";
                    break;
                case 3:
                    numberConversion = "3rd";
                    break;
                case 4:
                    numberConversion = "4th";
                    break;
                case 5:
                    numberConversion = "5th";
                    break;
                case 6:
                    numberConversion = "6th";
                    break;
                case 7:
                    numberConversion = "7th";
                    break;
                case 8:
                    numberConversion = "8th";
                    break;
                default:
                    break;
            }
            //Ask for class grade from user
            System.out.print(numberConversion + " Class Grade: ");
            String grade = input.next();
            //Ask for class hours from user
            System.out.print(numberConversion + " Class Hours: ");
            int hours = input.nextInt();
            double totalGradePoints = 0;
            
            //Conversion of letter grade to numerical value
            switch (grade.toUpperCase()){
                case "A":
                    totalGradePoints = 4.000;
                    break;
                case "A-":
                    totalGradePoints = 3.667;
                    break;
                case "B+":
                    totalGradePoints = 3.333;
                    break;
                case "B":
                    totalGradePoints = 3.000;
                    break;
                case "B-":
                    totalGradePoints = 2.667;
                    break;
                case "C+":
                    totalGradePoints = 2.333;
                    break;
                case "C":
                    totalGradePoints = 2.000;
                    break;
                case "C-":
                    totalGradePoints = 1.667;
                    break;
                default:
                    totalGradePoints = 0;
                    break;
            }
            //totalGradePoints and totalHours are compiled into two respective arrays
            grades[min-1] = totalGradePoints;
            totalHours[min-1] = hours;
            //Product is calculated by multiplying each respective index number to produce another array
            product[min-1] = grades[min-1] * totalHours[min-1];
            
            //All the indexes of product array are added together to produce a sum variable
            for (double num1 : product){
                sum = sum+num1;
            }
            //All the indexes of totalHours array are added together to produce a sumHours variable
            for (int num2 : totalHours){
                sumHours = sumHours+num2;
            }
            //Tells the user what the GPA is of the courses they have entered in so far
            if (i > min){
                System.out.printf("GPA So Far: " + "%.3f\n", sum/sumHours);
            }
        }
        //The final GPA is calculuated and printed out for the user
        System.out.printf("Final GPA: " + "%.3f\n", sum/sumHours);
    }
    
}
