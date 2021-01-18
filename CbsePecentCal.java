// write a program to calculate percent of a given student in cbse board exam.His marks from 5 subjects 
// must be taken as input from keyboard => subjects any you wish
// solution :-

import java.util.Scanner;

public class CbsePecentCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your english marks:");
        double eng = sc.nextDouble();
        System.out.println("Enter Your Hindi marks:");
        double hin = sc.nextDouble();
        System.out.println("Enter Your Maths marks:");
        double mth = sc.nextDouble();
        System.out.println("Enter Your CSE marks:");
        double cse = sc.nextDouble();
        System.out.println("Enter Your MEC marks:");
        double mec = sc.nextDouble();

        double sum = eng+hin+mth+cse+mec;
        System.out.println("Total obtained marks are:");
        System.out.println(sum);
        double div = sum/500;
        double per = div*100;
        System.out.println("Percentage is:");
        System.out.println(per);
        sc.close();
    }
    
}
