package String;

public class StringSyntax {
    public static void main(String[] args) {

        String name = "Kaushal";

        // returns length of string name

        int value = name.length();
        System.out.println(value);

        // returns with all upper case characters form the string name

        String u_name = name.toUpperCase();
        System.out.println(u_name);

        // returns with all lower case characters form the string name

        String l_name = name.toLowerCase();
        System.out.println(l_name);

        // returns new string after removing all leading and trailing spaces from original string

        String trim_name = name.trim();
        System.out.println(trim_name);

        // returns a substring from given start index to end. start is included

        String sub_name = name.substring(2);
        System.out.println(sub_name);
    
        // returns a substring from given start to given end. start is included but end is excluded

        String sub_1_name = name.substring(1,3);
        System.out.println(sub_1_name);

        // returns a new string after replacing characters

        String replace_char_name = name.replace('a','o');
        System.out.println(replace_char_name);

        // returns a new string after replacing  given string

        String replace_string_name = name.replace("shal","wari");
        System.out.println(replace_string_name);

        // return true if name starts with string "Kau"

        boolean check_start = name.startsWith("Kau");
        System.out.println(check_start);

        // return true if name ends with "hal"

        boolean check_end = name.endsWith("hal");
        System.out.println(check_end);

        // returns character at a given index position 

        char position_name = name.charAt(3);
        System.out.println(position_name);

        // returns the index of the given string

        int index_name = name.indexOf("sh");
        System.out.println(index_name);

        // returns the index of given string starting from 3

        int index_starting = name.indexOf("h",3);
        System.out.println(index_starting);

        // returns true if the given string is equal, otherwise false

        boolean equal_name = name.equals("Kaushal");
        System.out.println(equal_name);

        // returns true if strings are equal ignoring the case of characters

        boolean equal_string = name.equalsIgnoreCase("KausHal");
        System.out.println(equal_string);

    }
}
