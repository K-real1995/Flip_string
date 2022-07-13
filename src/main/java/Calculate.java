import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {


    protected static void CalculatingMethod() throws IOException {

        System.out.print("Enter your string: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();


        System.out.println("Original string: " + str );

        long time1 = Timer.timer(() -> {
            for (int i = 0; i < 1000; i++) {
                Reverse.reverse(str);
            }
        });


        long time2 = Timer.timer(() -> {

            for (int i = 0; i < 10000; i++) {
                Reverse.reverse(str);
            }
        });


        long time3 = Timer.timer(() -> {
            String result = "";
            for (int i = 0; i < 100000; i++) {
                result = Reverse.reverse(str);
            }
            System.out.println("Reverse string: " + result);
        });

        reader.close();

        System.out.println("Time to work 1000, 10000, 100000 cycles: " + time1 + "/" + time2 + "/" + time3 + " ns.");

    }
}
