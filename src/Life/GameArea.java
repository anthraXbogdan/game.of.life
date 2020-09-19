package Life;

import javax.swing.*;
import java.awt.*;

public class GameArea extends JPanel {

    public GameArea() {
        setPreferredSize(new Dimension(701, 700));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setBackground(Color.pink);
        //setBackground(Color.black);
        //setBorder(BorderFactory.createLineBorder(Color.lightGray, 1, true));
    }
}
