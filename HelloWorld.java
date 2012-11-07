import java.lang.*;

public class HelloWorld {
    public static void main( String[] args ) {
        //System.out.println("args = " + args[0]);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello("Hey " + args[0] + ", good to see you today.");

    }

    public void hello(String helloString) {
        //System.out.println(helloString);
        for(int i=0; i<=1000; i++) {
            System.out.println(i + ": " + helloString);
        }
    }
}
