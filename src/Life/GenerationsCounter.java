package Life;

import javax.swing.*;
import java.awt.*;

public class GenerationsCounter extends JLabel {

    public GenerationsCounter() {
        setName("GenerationLabel");
        setText("Generation #" + CellsFactory.generationNo);
        setFont(new Font("Serif", Font.BOLD, 18));
        setPreferredSize(new Dimension(250, 23));
    }

}
