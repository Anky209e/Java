public class PracticeSetTwo {
    public static void main(String[] args) {
        // Que1 : convert a string to lowercase
        //Answer:-
        String name = "Ankit Kumar";
        name = name.toLowerCase();
        System.out.println(name);


        // Que2: write a programm to replace spaces with underscore
        // Answer:- we will use same string name

        System.out.println(name.replace(' ','_'));

        // Que3 write a programme to make a letter template which looks like this
        //   "Dear <|name|>, thanks a lot"
        System.out.printf("\"Dear %s thanks a lot\"\n ",name);


        // Que4 write a programme to detect  double and triple string
        // Answer:-

        String myString = " my name  is ankit";
        System.out.println("single space is at(if -1 its not present):");
        System.out.println(myString.indexOf(" "));
        System.out.println("Double space is at(if -1 its not present):");
        System.out.println(myString.indexOf("  "));
        System.out.println("Triple space is at(if -1 its not present):");
        System.out.println(myString.indexOf("   "));


        // que 5 write a programme format letter using escape sequence
        // answer:- 

        String letter = "Hello,\n\t\"Ankit kumar you are a good man\"";
        System.out.println(letter);






    }
    
}
