import java.util.Scanner;

public class PracticeSet_five {
    public static void main(String[] args) {
        // create and array of 5 numbers and sum them.
        Scanner sc = new Scanner(System.in);
        // float [] userNum = new float[5];

        // System.out.println("Enter numbers and press enter:");
        // userNum[0] = sc.nextFloat();
        // userNum[1] = sc.nextFloat();
        // userNum[2] = sc.nextFloat();
        // userNum[3] = sc.nextFloat();
        // userNum[4] = sc.nextFloat();

        
        // float sum = userNum[0]+userNum[1]+userNum[2]+userNum[3]+userNum[4];
        // System.out.println("Answer is:\n");
        // System.out.printf("%f+%f+%f+%f+%f=%f",userNum[0],userNum[1],userNum[2],userNum[3],userNum[4],sum);
        
        
        // float sum = 0;
        // for (float f : userNum) {
        //     sum = sum+f;
            
        // }
        // System.out.println("The answer is "+sum);
    
        //------------------------------------------------------>
        // que 2 to check wheather a number is in array or not
        /*
        float [] check = {1,2,3,4,5};
        System.out.println("Enter number you want to check:");
        float num = sc.nextFloat();
        boolean inArray = false;
        for (float f : check) {
            if(num==f){
                inArray = true;
                break;
            }
        }
        if(inArray){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
        */
        // que 4 add two 2x3 matrices java programme
        int [][] mat1 = { {1,2,3},
                        {4,5,6}};

        int [][] mat2 = {{2,6,8},
                        {7,9,6}};
        int [][] result = {{0,0,0},
                        {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++){
                
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.println(result[i][j]+"\t");
            } 
        System.out.println("");

        }








        sc.close();


    }
    
}
