public class CWH_ch3_StringMethods {
    public static void main(String[] args) {
        String name = "Bhavesh";
        // System.out.println(name.length());
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString = "   John   ";
        String TrimmedString = nonTrimmedString.trim(); //since string is mutable we create an instance of the original string and trim it
        System.out.println(TrimmedString);

        //substring 
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        String name2 = "Harry";
        System.out.println(name2.replace('r', 'p')); //replaces all occurence of r with p
        // System.out.println(name);
        String ReplacedName = name2.replace('r', 'p'); //can also create an instance
        System.out.println(ReplacedName);// and then print the changed string

        System.out.println(name2.replace("rry", "ier")); //replaces a substring of rry with ier

        System.out.println(name2.replace("r", "ier")); //replacing r with the substring ier (replaces all occurrence of r with ier )

        System.out.println(name2.startsWith("Har")); //result is boolean
        System.out.println(name2.endsWith("Har")); //result is boolean
        System.out.println(name.charAt(2)); //returns character at given index
        System.out.println(name.indexOf("ve")); // returns index of a given string

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4)); //returns index of give string from given index 
        System.out.println(modifiedName.indexOf("rrry")); //returns -1 since it is not found
        System.out.println(modifiedName.lastIndexOf("r")); // starts searching from the last (from -1)
        System.out.println(modifiedName.lastIndexOf("rry", 4));

        System.out.println(name.equals("Harry")); //always used .equals if you want to check if the string is equal of something and not = operator
        System.out.println(name2.equals("Harry"));
        System.out.println(name2.equalsIgnoreCase("haRry")); //returns true if 2 strings are equal ignoring case of characters

        System.out.println("I am escaping sequence \" double quote");
        System.out.println("I am escaping sequence \\ backslash");


        



    }
}
