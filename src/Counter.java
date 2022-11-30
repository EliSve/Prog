public class Counter {
    // mina värden
    private int myRows;
    private int myCounter;

    // räknar
    public Counter() {

    }

    public int getMyCounter() {
        return myCounter;
    }

    public int getMyRows() {
        return myRows++;
    }

    public void increasemyCounter(String myInput) {
        if (!myInput.equals("Stop")) {
            myCounter += myInput.length();

        }
    }

    public void increasemyRows() {
        this.myRows++;
    }

}



