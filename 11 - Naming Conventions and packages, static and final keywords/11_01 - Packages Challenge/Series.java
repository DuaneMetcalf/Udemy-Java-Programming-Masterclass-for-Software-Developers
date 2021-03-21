public class Series
{
    public static long nSum(int n)
    {
        return (n * (n + 1)) / 2;
    }
    
    public static long factorial(int n)
    {
        long factorial = 1;
        
        if (n == 0)
        {
            return 0;
        }
        
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static long fibonacci(int n)
    {
        long num1 = 1;
        long num2 = 0;
        long fib = 0;
        
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        
        for (int i = 1; i < n; i++)
        {
            fib = (num2 + num1);
            num2 = num1;
            num1 = fib;
        }
        
        return fib;
    }
    
}