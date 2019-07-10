package co.uk.dgray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HackerTest3Test {

    private HackerTest3 hacker;

    @Before
    public void setup(){
        hacker = new HackerTest3();
    }

    @Test
    public void makingAnagrams1() {
        assertEquals(2, hacker.makingAnagrams("ab", "bc"));
    }

    @Test
    public void makingAnagrams2() {
        assertEquals(6, hacker.makingAnagrams("abcdefg", "bcfgxyz"));
    }

    @Test
    public void makingAnagrams3() {
        assertEquals(2, hacker.makingAnagrams("acde", "bcea"));
    }

    @Test
    public void makingAnagrams4() {
        assertEquals(19, hacker.makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
    }
}