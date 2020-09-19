package Life;

import javax.swing.*;
import java.awt.*;

public class AliveCellCounter extends JLabel {

    public AliveCellCounter() {
        setName("AliveLabel");
        setText("Alive: " + CellsFactory.aliveCellCounter(CellsFactory.currentGen));
        setFont(new Font("Serif", Font.BOLD, 18));
        setPreferredSize(new Dimension(250, 23));
    }

}
