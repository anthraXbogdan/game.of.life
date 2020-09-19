package Life;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    public Menu() {
        setPreferredSize(new Dimension(270, 690));
        setBackground(Color.gray);
        setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));
        setLayout(new FlowLayout());

        add(new StatusUpdate());
        add(new PlayPauseButton());
        add(new ResetButton());

    }

}
