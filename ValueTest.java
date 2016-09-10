public class ValueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        int b = a;
        System.out.println("Value of b is "+b);
        b = 30;
        System.out.println("a = " + a + " after change to b");
    }
    
}




OUTPUT :
run:
a = 10
Value of b is 10
a = 10 after change to b
BUILD SUCCESSFUL (total time: 0 seconds)
