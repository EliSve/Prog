import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest { // test räkna
    @Test
    public void shouldReturnCorrectmyCounter() {
        Counter counter = new Counter();
        //sparar resultat
        counter.increasemyRows();
        counter.increasemyRows();
        int actual = counter.getMyRows();
        int expected = 2;


        assertEquals(expected, actual);
    }

    @Test // test ord
    public void shouldReturnCorrectmyRows() {
        Counter counter = new Counter();
        counter.increasemyCounter("Ska skriva ut");
        counter.increasemyCounter("15");
        int expected = 15;
        int actual = counter.getMyCounter();
        assertEquals(expected, actual);




    }
}









