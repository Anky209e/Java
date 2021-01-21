public class MultiDimensionArray {
    public static void main(String[] args) {
        // it means array inside array
        int [][] marks = {{1,2,3,4},{9,8,7,6}};
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);
        System.out.println(marks[0][0]);
        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[1][2]);

        // displaying 2d array using loop
        for(int i = 0; i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
        System.out.println(" ");
        }
    }
    
}
