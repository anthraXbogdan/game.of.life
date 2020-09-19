package Life;

import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame {
    static boolean playPause = true;

    public GameOfLife() throws InterruptedException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Game of Life");
        setSize(1000,750);
        setBackground(Color.white);
        GameArea gameArea = new GameArea();
        add(gameArea, BorderLayout.EAST);

        gameArea.add(new InitialGeneration());
        add(new MenuArea(), BorderLayout.WEST);
        CellsFactory.generationNo++;
        //pack();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        while (playPause) {
            Thread.sleep(300);
            gameArea.removeAll();
            gameArea.repaint();
            gameArea.add( new NextGeneration(), BorderLayout.SOUTH);
            add(new MenuArea(), BorderLayout.WEST);
            CellsFactory.generationNo++;
            setVisible(true);

        }

    }

    public static void main(String[] args) {
        Threads.thread1.start();
    }

}
