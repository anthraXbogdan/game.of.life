package Life;

import javax.swing.*;
import java.awt.*;

public class StatusUpdate extends JPanel {

    public StatusUpdate() {
        setPreferredSize(new Dimension(260, 100));
        setBackground(Color.lightGray);
        setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        setLayout(new FlowLayout());

        add(new StatusUpdateHeader());
        add(new GenerationsCounter());
        add(new AliveCellCounter());
    }

}
