package Life;

import javax.swing.*;
import java.awt.*;

public class MenuArea extends JPanel {

    public MenuArea() {
        setPreferredSize(new Dimension(284, 699));
        setBackground(Color.pink);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setLayout(new FlowLayout());

        add(new Menu());

    }

}
