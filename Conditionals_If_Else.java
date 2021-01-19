import java.util.Scanner;

public class Conditionals_If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hello,Enter age:");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("You can drive.");
        }
        else{
            System.out.println("You cant drive");
        }





        sc.close();
    }
}
