package Life;

public class ThreadOne  extends Thread{

    @Override
    public void run() {
        new CellsFactory();
        try {
            new GameOfLife();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
