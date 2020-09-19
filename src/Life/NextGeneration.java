package Life;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NextGeneration extends JPanel {

    ArrayList<Cell> list = new ArrayList<>();

    public NextGeneration() {
        // set the grid layout
        setPreferredSize(new Dimension(690, 690));
        setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        setBackground(Color.darkGray);
        setLayout(new GridLayout(CellsFactory.universeSize, CellsFactory.universeSize, 1 , 1));

        // create the nextGen array
        int counter = 0;

        for (int i = 0; i < CellsFactory.universeSize; i++) {
            for (int j = 0; j < CellsFactory.universeSize; j++ ) {
                list.add(CellsFactory.currentGen[i - 1 < 0 ? CellsFactory.universeSize - 1 : i - 1][j - 1 < 0 ? CellsFactory.universeSize - 1 : j - 1]);
                list.add(CellsFactory.currentGen[i - 1 < 0 ? CellsFactory.universeSize - 1 : i - 1][j]);
                list.add(CellsFactory.currentGen[i - 1 < 0 ? CellsFactory.universeSize - 1 : i - 1][j + 1 > CellsFactory.universeSize -1 ? 0 : j + 1]);
                list.add(CellsFactory.currentGen[i][j - 1 < 0 ? CellsFactory.universeSize - 1 : j - 1]);
                list.add(CellsFactory.currentGen[i][j + 1 > CellsFactory.universeSize -1 ? 0 : j + 1]);
                list.add(CellsFactory.currentGen[i + 1 > CellsFactory.universeSize -1 ? 0 : i + 1][j - 1 < 0 ? CellsFactory.universeSize - 1 : j - 1]);
                list.add(CellsFactory.currentGen[i + 1 > CellsFactory.universeSize -1 ? 0 : i + 1][j]);
                list.add(CellsFactory.currentGen[i + 1 > CellsFactory.universeSize -1 ? 0 : i + 1][j + 1 > CellsFactory.universeSize -1 ? 0 : j + 1]);

                for (Cell cell : list) {
                    if (cell != null && cell.getBackground().equals(Color.gray)) {
                        counter++;
                    }
                }

                if (CellsFactory.currentGen[i][j] != null && CellsFactory.nextGen[i][j] != null) {
                    if (CellsFactory.currentGen[i][j].getBackground().equals(Color.white) && counter == 3) {
                        CellsFactory.nextGen[i][j].setBackground(Color.gray);
                    }
                    else if (CellsFactory.currentGen[i][j].getBackground().equals(Color.white) && counter != 3) {
                        CellsFactory.nextGen[i][j].setBackground(Color.gray);

                    }
                    else if (CellsFactory.currentGen[i][j].getBackground().equals(Color.gray) && counter == 2) {
                        CellsFactory.nextGen[i][j].setBackground(Color.gray);
                    }
                    else if (CellsFactory.currentGen[i][j].getBackground().equals(Color.gray) && counter == 3) {
                        CellsFactory.nextGen[i][j].setBackground(Color.gray);
                    }
                    else {
                        CellsFactory.nextGen[i][j].setBackground(Color.white);
                    }
                }
                counter = 0;
                list.clear();
            }
        }

        for (int i = 0; i < CellsFactory.universeSize; i++) {
            System.arraycopy(CellsFactory.nextGen[i], 0, CellsFactory.currentGen[i], 0, CellsFactory.universeSize);
        }

        // fill the jPanel with the JLabels stored in the currentGen array
        for (int i = 0; i < CellsFactory.universeSize; i++) {
            for (int j = 0; j < CellsFactory.universeSize; j++) {
                //add(CellsFactory.currentGen[i][j]);
                if (Life.CellsFactory.currentGen[i][j] != null) {
                    add(Life.CellsFactory.currentGen[i][j]);
                }
            }
        }

    }

}
