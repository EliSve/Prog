import java.util.Scanner;


public class Logic {

    public static void main(String[] args) {
        String myInput = "";
        Counter counter = new Counter();

        // gör nedan tills man skriver stop
        while (!myInput.equals("Stop")) {
            //sparar resultat



            Scanner scan = new Scanner(System.in);
            System.out.println("Write whatever you want");
            myInput = scan.nextLine();
            if (!myInput.equals("Stop")) {
                counter.increasemyRows();

                counter.increasemyCounter(myInput);
            }

        }
        System.out.println("Result is");
        System.out.println(counter.getMyCounter());
        System.out.println(counter.getMyRows());
    }


}


