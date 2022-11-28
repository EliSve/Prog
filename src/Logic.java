import org.junit.Test;

import java.util.Scanner;


public class Logic {

    public static void  main(String[] args) {
        String myInput = "";
        Counter counter = new Counter();

        // gör nedan tills man skriver stop
        while (!myInput.equals("Stop")) {
            //sparar resultat
            counter.increasemyRows();

            Scanner scan = new Scanner(System.in);
            System.out.print("Write whatever you want");
            myInput = scan.nextLine();

            if (!myInput.equals("Stop")) {
                counter.increasemyRows();

            }

            myInput = scan.nextLine();
        }
        System.out.println("Result is");
        System.out.println(counter.getMyCounter());
        System.out.println(counter.getMyRows());
    }

    // test räkna
    @Test
    public void shouldReturnCorrectmyCounter() {

    }
    @Test // test ord
    public void shouldReturnCorrectmyRows() {

    }

}
