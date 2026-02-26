public class SwapNumber {
    public static void main(String[] args) {
        int a=2;
        int b=6;

        System.out.println("Before swapping the number:\n");
        System.out.println("a="+a+ "b="+b);
         
        a=a+b;

        b=a-b;

        a=a-b;

        System.out.println("After swapping the number:\n");
        System.out.println("a="+a+ "b="+b);
         

    }
    
}
