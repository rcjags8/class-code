public class GetForLoopy
{
    public static void main(String[] args)
    {
        int firstNum;
        int secondNum;
        String outputStr;
        String firstStr = args[0];
        String secondStr = args[1];

        firstNum = Integer.parseInt(firstStr);
        secondNum = Integer.parseInt(secondStr);
        printOdds(firstNum, secondNum);
        
        sumEvens(firstNum, secondNum);
        sumSquares(firstNum, secondNum);
        printSquares();
    }

    public static void printOdds(int first, int second) {
        for(int i = first; i <= second; i++) {
            if(i % 2 != 0) {
                System.out.println(i + " is odd");
            }
        }
    }

    public static void sumEvens(int first, int second) {
        int sum = 0;
        for(int i = first; i <= second; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers between " + first + " and " + second + " = " + sum);
    }

    public static void printSquares() {

        for(int i = 1; i <= 10; i++) {
            System.out.println("Num: " + i + ": squared = " + i * i);    
        } 
    }

    public static void sumSquares(int first, int second) {
        int sumOfSquares = 0;
        int square = 0;

        for(int i = first; i <= second; i++) {
            if(i % 2 != 0) {
                square = i * i; 
                System.out.println("Num: " + i + ": squared = " + square);
                sumOfSquares += square; 
            }
        }
        System.out.println("Sum of squares of odd numbers between " + first + " and " + second + " equals " + sumOfSquares);
    }
}

