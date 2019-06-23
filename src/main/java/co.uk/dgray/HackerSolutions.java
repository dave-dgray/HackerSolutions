package co.uk.dgray;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;

class HackerSolutions {

    int diagonalDifference(ArrayList<List> matrix){
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int index = 0;
        matrix.remove(0);
        for (List row: matrix){
            leftDiagonal += (Integer) row.get(index++);
            rightDiagonal += (Integer) row.get(matrix.size()-index);
        }
        return abs(leftDiagonal-rightDiagonal);
    }

}
