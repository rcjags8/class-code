import javax.swing.*;

public class printOddNums
{

    public static void main(String[] args)
    {

      int firstNum;
      int secondNum;
      String outputStr;
      String firstStr;
      String secondStr;

      firstStr = JOptionPane.showInputDialog("Enter an integer");
      firstNum = Integer.parseInt(firstStr);

      secondStr = JOptionPane.showInputDialog("Enter a higher integer");
      secondNum = Integer.parseInt(secondStr);
    
      while(firstNum <= secondNum) {
        if(firstNum % 2 != 0) {
            System.out.println("$firstNum is odd");
        }
        firstNum++    
      }
    }
}
        
