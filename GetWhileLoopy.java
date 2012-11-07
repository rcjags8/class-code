public class GetWhileLoopy
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
        while(first <= second) {
            if(first % 2 != 0) {
                System.out.println(first + " is odd");
            }
            first++;
        }
    }

    public static void sumEvens(int first, int second) {
        int sum = 0;
        int incrementor = first;
        while(incrementor <= second) {
            if(incrementor % 2 == 0) {
                sum += incrementor;
            }
            incrementor++;
        }
        System.out.println("Sum of even numbers between " + first + " and " + second + " = " + sum);
    }

    public static void printSquares() {
        int first = 1;
        int second = 10;

        while(first <= second) {
            System.out.println("Num: " + first + ": squared = " + first * first);    
            first++;
        } 
    }

    public static void sumSquares(int first, int second) {
        int incrementor = first;
        int sumOfSquares = 0;
        int square = 0;

        while(incrementor <= second) {
            if(incrementor % 2 != 0) {
                square = incrementor * incrementor; 
                System.out.println("Num: " + incrementor + ": squared = " + square);
                sumOfSquares += square; 
            }
            incrementor++;
        }
        System.out.println("Sum of squares of odd numbers between " + first + " and " + second + " equals " + sumOfSquares);
    }
}

