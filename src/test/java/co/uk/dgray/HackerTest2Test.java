package co.uk.dgray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HackerTest2Test {

    private HackerTest2 hacker;

    @Before
    public void setup(){
        hacker = new HackerTest2();
    }

    @Test
    public void countingValleys1() {
        assertEquals(1, hacker.countingValleys(8,"DDUUUUDD"));
    }

    @Test
    public void countingValleys2() {
        assertEquals(1, hacker.countingValleys(8,"UDDDUDUU"));
    }

    @Test
    public void countingValleys3() {
        assertEquals(2, hacker.countingValleys(6,"UDDUDU"));
    }

    @Test
    public void countingValleys4() {
        assertEquals(3, hacker.countingValleys(8,"UDDUDUDU"));
    }
}