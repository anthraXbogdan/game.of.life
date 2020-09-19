package Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PlayPauseButton extends JToggleButton {

    public PlayPauseButton() {
        setPreferredSize(new Dimension(260, 50));
        setText("PAUSE");
        setFont(new Font("Serif", Font.BOLD, 25));
        //setBackground(Color.red);
        setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        //setLayout(new FlowLayout());

        // ItemListener is notified whenever you click on the Button
        // itemStateChanged() method is nvoked automatically
        // whenever you click or unlick on the Button.
        ItemListener itemListener = itemEvent -> {

            // event is generated in button
            int state = itemEvent.getStateChange();

            if (state == ItemEvent.SELECTED) {
                Threads.thread1.suspend();
                setText("RESUME");
            }
            else {
                Threads.thread1.resume();
                setText("PAUSE");
            }
        };

        // Attach Listeners
        addItemListener(itemListener);

    }

}
