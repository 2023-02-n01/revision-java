import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Scanner sc = new Scanner(System.in).useDelimiter("\\s");
        String name = sc.next();  // It will not leave until the user enters data.
        int number = sc.nextInt(); // We can read specific data.

        System.out.println("Name " + name + "\t number " + number);

    }
}
