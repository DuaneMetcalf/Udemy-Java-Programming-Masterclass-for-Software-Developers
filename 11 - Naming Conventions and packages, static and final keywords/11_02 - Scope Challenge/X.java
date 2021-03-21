import java.util.Scanner;

public class X
{
    private int x = 0;
    
    public X()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Please input a number: ");
        this.x = x.nextInt();
        x();
    }
    
    private void x()
    {
        System.out.println(this.x + " Times Table");
        for (int x = 1; x <= 12; x++)
        {
            System.out.println(x + " times " + this.x + " equals " + (x * this.x));
        }
    }
    
    public static void main(String[] args)
    {
        X x = new X();
    }
    
}