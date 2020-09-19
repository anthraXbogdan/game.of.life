package Life;

import javax.swing.*;
import java.awt.*;

public class InitialGeneration extends JPanel {

    public InitialGeneration() {
        // set the grid layout
        setPreferredSize(new Dimension(690, 690));
        setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        setBackground(Color.darkGray);
        setLayout(new GridLayout(CellsFactory.universeSize, CellsFactory.universeSize, 1 , 1));

        // fill the jPanel with the JLabels stored in the currentGen array
        for (int i = 0; i < CellsFactory.universeSize; i++) {
            for (int j = 0; j < CellsFactory.universeSize; j++) {
                if (Life.CellsFactory.currentGen[i][j] != null) {
                    add(Life.CellsFactory.currentGen[i][j]);
                }
                //add(CellsFactory.currentGen[i][j]);
            }
        }

    }

}
