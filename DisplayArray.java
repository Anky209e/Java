public class DisplayArray {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};
        // display array (naive way)  it  is not a good way to display
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]); 
        // using loop
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]);  //--> array travarsal
        }
        // using For-each loop
        for (int element : marks) {
            System.out.println(element);

            
        }
    }
}
