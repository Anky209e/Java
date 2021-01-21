import java.util.Scanner;

public class Method {
    static void myFunction(){
        System.out.println("Hello boy");
    }
    static void function(){
        System.out.println("hello girl");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if(a==1){
            myFunction();
        }
        else if(a==2){
            function();
        }
        else{
            System.out.println("Invalid input");
        }
    sc.close();
    }
}
