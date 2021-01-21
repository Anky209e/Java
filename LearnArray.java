public class LearnArray {
    public static void main(String[] args) {
        //--------------------------------------
        // first way to create array
        
        int [] marks1 = new int[5]; //--> declaration plus memory allocation then initialization
        marks1[0] = 10;
        marks1[1] = 15;
        marks1[2] = 78;
        marks1[3] = 11;
        marks1[4] = 13;
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[4]);
        
        //-----------------------------------------
        // Second way to create array
        
        int [] marks = {1,2,3,4,5,6};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
        

        //------------------------------------------
        // String array
        String [] names = {"Anky","Capti","Silver","Dingo"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        //-------------------------------------------
        //Float array
        float [] point = {23.5f,12.5f,34.9f};
        System.out.println(point.length);
        System.out.println(point[0]);
        System.out.println(point[1]);
        System.out.println(point[2]);

    }
    
}
