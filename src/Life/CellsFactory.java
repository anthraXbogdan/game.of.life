package Life;

import java.awt.*;

public class CellsFactory {
    static int universeSize = 19;
    static Cell[][] currentGen = new Cell[universeSize][universeSize];
    static Cell[][] nextGen = new Cell[universeSize][universeSize];
    static int generationNo = 0;

    public CellsFactory() {
        // create an array of random coloured JLabels for currentGen
        for (int i = 0; i < universeSize; i++) {
            for (int j = 0; j < universeSize; j++) {
                currentGen[i][j] = new Cell(new CellState().cellSt());
            }
        }

        // create an array of random coloured JLabels for nextGen
        for (int i = 0; i < universeSize; i++) {
            for (int j = 0; j < universeSize; j++) {
                nextGen[i][j] = new Cell(new CellState().cellSt());
            }
        }

    }

    static int aliveCellCounter(Cell[][] currentGen) {
        int aliveCells = 0;
        for (int i = 0; i < universeSize; i++) {
            for (int j = 0; j < universeSize; j++) {
                if (currentGen[i][j].getBackground().equals(Color.gray)) {
                    aliveCells++;
                }
            }
        }
        return aliveCells;
    }

}
