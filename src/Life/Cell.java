package Life;

import javax.swing.*;
import java.awt.*;

public class Cell extends JLabel {

    Cell(Color color) {
        //setPreferredSize(new Dimension(10,10));
        setOpaque(true);
        setBackground(color);
    }

}
