public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

     
        //if args[0] contains a large number we can change a b and next to long, but it wasnt specified in the assignment so i left it as int
        int numOdd = 0;
        int a = 1;
        int b = 1;
        for (int i = 0; i < x; i++) {
            if (a % 2 == 1) {
                numOdd++;
            }
            System.out.print(a);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
             int next = a + b;
             a = b;
             b = next;
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
