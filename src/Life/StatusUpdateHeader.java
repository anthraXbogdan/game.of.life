package Life;

import javax.swing.*;
import java.awt.*;

public class StatusUpdateHeader extends JLabel {

    public StatusUpdateHeader() {
        setText("     --- STATUS UPDATE ---");
        setFont(new Font("Serif", Font.BOLD, 18));
        setPreferredSize(new Dimension(250, 23));
    }
}
