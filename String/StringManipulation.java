package String;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        firstName = "Yash";
        middleName = "Manoj";
        lastName = "Izate";

        // By simple addition
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        // to make all letters upper case
        System.out.println(fullName.toUpperCase());
        
        System.out.println();  //to add next line
        
        firstName = "Manoj";
        middleName = "Hanuman";
        lastName = "Izate";
        
        // By using concatinate function in java . It means to add strings.        
        fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        System.out.println(fullName);

        // to make all letters lower case
        System.out.println(fullName.toLowerCase());

    }

}
