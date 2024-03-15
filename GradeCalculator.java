/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of subjects:");
        int numberOfSubject=sc.nextInt();
        int[] marks=new int[numberOfSubject];
        int sumSubject=0;
        double percentage;
        for(int i=0;i<numberOfSubject;i++){
            System.out.print("Enter marks for subject "+(i+1)+": ");
            sumSubject=sumSubject+sc.nextInt();
        }
        percentage=(double)sumSubject/(numberOfSubject*100)*100;
        System.out.println("--------------------------------------");
        System.out.println("Your Results are:");
        System.out.print("Total Marks obtained by "+numberOfSubject+" subjects:"+sumSubject);
        System.out.print("\nPercentage:"+percentage+"%");
        sc.close();
        if (percentage<40.0)
            System.out.println("\nGrade:Fail");
        else if(percentage>=40.0 && percentage<=49.99)
            System.out.println("\nGrade:C");
        else if(percentage>=50.0 && percentage<=59.99)
            System.out.println("\nGrade:B");
        else if(percentage>=60.0 && percentage<=69.99)
            System.out.println("\nGrade:B+");
        else if(percentage>=70.0 && percentage<=79.99)
            System.out.println("\nGrade:A");
        else if(percentage>=80.0 && percentage<=89.99)
            System.out.println("\nGrade:A+");
        else if(percentage>=90.0)
            System.out.println("\nGrade:O");
        else
           System.out.println("Invalid Marks.Please enter valid marks"); 
    }
}

