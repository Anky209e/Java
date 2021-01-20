import java.util.Scanner;

public class LearnForLoop {
    public static void main(String[] args) {
/*

        for(initialize,checkbool,update condition){
         //code  
        }
    
*/
/*

        for (int i =1; i<=10; i++){
            System.out.println(i);
        }
*/
    
        // que:- write a programme to print first n odd numbers using for loops
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of odd numbers you want to generate:");
        int n = sc.nextInt();
        
        for(int i=0;i<=n;i++){
            System.out.println(2*i+1);
        }
        sc.close();

    }
    
}
