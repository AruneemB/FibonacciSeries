import java.util.Scanner;

public class FibonacciSeries
{
    public void fibonacciSeries(int numberOfTerms)
    {
        int num1 = 0, num2 = 1, sum;
        for(int i = 1; i <= numberOfTerms; i++)
        {
            if(i != numberOfTerms) System.out.print(num1 + ", ");
            else System.out.print(num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms of the Fibonacci series needed: ");
        int numberOfTerms = scanner.nextInt();
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.fibonacciSeries(numberOfTerms);
    }
}
