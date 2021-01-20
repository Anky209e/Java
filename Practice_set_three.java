import java.util.Scanner;


public class Practice_set_three {
    public static void main(String[] args) {
        

        /*question:- write a programme to find out a student is pass or fail pass percentage 
        is 33% in each subject and total 40% overall assume three subjects.
        */
        // answer:-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English marks:");
        float engMarks = sc.nextFloat();
        System.out.println("Enter Maths marks:");
        float mthMarks = sc.nextFloat();
        System.out.println("Enter Science marks:");
        float scMarks = sc.nextFloat();
        float totalMarks = engMarks+mthMarks+scMarks;
        float markMulti = totalMarks/300;
        float percentMark = markMulti*100;
        System.out.printf("You got %f marks.",percentMark);
        if (engMarks>=33 && percentMark>=40) {
            System.out.println("Congratulation,You passed all subject.");
        }
        // else if(engMarks<33){
        //     System.out.println("You failed in english");
        // }
        else if(mthMarks>=33 && percentMark>=40){
            System.out.println("Congratulations!,You passes.");
        }
        // else if(mthMarks<33){
        //     System.out.println("You failed in math.");
        // }
        else if(scMarks>=33 && percentMark>=40){
            System.out.println("Congrats you passed.");
        }
        // else if(scMarks<33){
        //     System.out.println("You failed in science");
        // }
        else{
            System.out.println("You failed in 1 subject");
        }





        


        sc.close();
    }
}

