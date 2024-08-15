package Methods;

public class method_syntax {

    static int sum (int x, int y) {

        int z = x + y;

        return z;
        
    }

    public static void main(String[] args) {

        // if not static method, then create object like below
        // int a = 5;
        // int b = 10;
        // Method invocation using object creation
        // aim obj = new aim();
        // int c = obj.sum(a,b);

        int a = 5;
        int b = 10;
        int c = sum(a,b);

    
        System.out.println(c);
    }
    
}
