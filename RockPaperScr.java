import java.util.Random;
import java.util.Scanner;

public class RockPaperScr {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i<=5){
            int ran1 = rn.nextInt(3);
            System.out.println(i);
            System.out.println("Enter one of this:-\n1)Rock\n2)Paper\n3)Secisor\n");
            int user = sc.nextInt();

            if(ran1 == 0 && user== 1){
                System.out.println("You tied computer chose Rock and you also chose Rock.");
            }
            else if(ran1 == 0 && user==2){
                System.out.println("Computer won as he chose Rock and you chosed Paper");
            }
            else if(ran1 == 0&& user == 3){
                System.out.println("Computer won as he chose Rock and you chosed sesior");
            }
            else if(ran1 ==1&& user == 1){
                System.out.println("You won as computer chosed Paper and you chosed Rock");
            }
            else if(ran1==1 && user ==2){
                System.out.println("You both chosed paper and tied");
            }
            else if(ran1 == 1 && user == 3){
                System.out.println("You won as computer chosed paper and you chosed sesior");
            }
            else if(ran1 == 2 && user == 1){
                System.out.println("You won as computer chosed sesior and you chosed Rock");
            }
            else if(ran1 ==2 && user ==2){
                System.out.println("You lost as computer chosed sesior and you chosed paper");
            }
            else if(ran1 == 2 && user ==3){
                System.out.println("You both chosed sesior and tied");
            }
            else{
                System.out.println("Invalid Input(Error 69)");
            }
        i=i+1;
        }
    sc.close();
    }
}
