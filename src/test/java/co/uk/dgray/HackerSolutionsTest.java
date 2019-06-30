package co.uk.dgray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerSolutionsTest {

    private ArrayList<List> matrix = new ArrayList<>();

    private HackerSolutions solutions;

    @Before
    public void setup(){
        matrix.add(Collections.singletonList(3));
        matrix.add(Arrays.asList(11, 2, 4));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(10, 8, -12));
        solutions = new HackerSolutions();
    }

    @Test
    public void testDiagonalDifference(){
        assertEquals(15, solutions.diagonalDifference(matrix));
    }

}