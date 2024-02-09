// Java program for calculating the grade of student marks
import java.util.*;
class StudentMarkList{
    static String Grading(int[] marks,int n){
        int sum = 0;
        for(int i = 0;i < n;i++){   //loop for for calculating the total marks
            sum += marks[i];
        }
        int avg = sum/n;      // average calculation
        if(avg >= 90){
            return "A+";
        }
        else if(avg >= 80 && avg < 90){
            return "A";
        }
        else if(avg >= 70 && avg < 80){
            return "B";
        }
        else if(avg >= 60 && avg < 70){
            return "C";
        }
        else if(avg >= 50 && avg < 60){
            return "D";
        }
        else{
            return "PASS";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subjects:"); 
        int n = sc.nextInt();
        int[] a = new int[10];
        for(int i = 0;i < n;i++){ //Collecting marks from user
          a[i] = sc.nextInt();
        }
        StudentMarkList s = new StudentMarkList();
        System.out.println(s.Grading(a,n));
    }
}