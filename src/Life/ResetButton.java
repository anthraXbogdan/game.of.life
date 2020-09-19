package Life;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.awt.*;

public class ResetButton extends JButton {

    public ResetButton() {
        setPreferredSize(new Dimension(260, 50));
        setText("RESET");
        setFont(new Font("Serif", Font.BOLD, 25));


        addActionListener(e -> {
                CellsFactory.generationNo = 0;

            // create an array of random coloured JLabels for currentGen
            for (int i = 0; i < CellsFactory.universeSize; i++) {
                for (int j = 0; j < CellsFactory.universeSize; j++) {
                    CellsFactory.currentGen[i][j] = new Cell(new CellState().cellSt());
                }
            }
        });

    }

}
