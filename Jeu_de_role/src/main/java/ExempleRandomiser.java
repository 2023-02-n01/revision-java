import java.util.Random;

public class ExempleRandomiser {

    public static void main(String[] args) {

        Random ran = new Random();
        int result = ran.nextInt((18-12)+1) +12 ;


        System.out.println(result);
    }
}
