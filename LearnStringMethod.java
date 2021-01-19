public class LearnStringMethod {
    public static void main(String[] args) {
        String name = "Anky";               //Strings are immutable and cant be changed you have to make a duplicate
        System.out.println(name);
        // name.lenght --> returns lenght of string
        int nameLenght = name.length();
        System.out.println(nameLenght);
        // name.toLowercase(); --> Return new string with all characters lower case
        // String lowerString = name.toLowerCase();
        // System.out.println(lString);
        // name.toUppercase(); --> all uppercase returns
        String uString = name.toUpperCase();
        System.out.println(uString);
        // name.trim(); --> remove leading or other spaces
        String nonTrimmedString = "    ankitstring ";
        // not trimmed
        System.out.println(nonTrimmedString);
        //trimmed
        String tString = nonTrimmedString.trim();
        System.out.println(tString);
        // name.substring();  indexing of string
        System.out.println(name.substring(1,3));
        // name.replace('a','b') --> replace a name in string
        System.out.println(name.replace('A', 'b'));
        // name.startsWith("xxx") --> checks true or false (boolean)
            //--->true
        System.out.println(name.startsWith("Ank"));
            //-->false
        System.out.println(name.startsWith("bnk"));
        // name.endsWith("xxx") --> checks true or false (boolean)
            // true
        System.out.println(name.endsWith("ky"));
            // false
        System.out.println(name.endsWith("we"));
        // name.charAt(x); --> checks charachter at index x(it is a number)
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        //name.indexof('character'); --> tells index number of character
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf('n'));
        System.out.println(name.indexOf('k'));
        // name.equalsIgnoreCase("striNg"); --> ignore case of letters
        System.out.println(name.equalsIgnoreCase("anky"));
        
    }
    
}
