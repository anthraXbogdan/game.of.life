package Life;

import java.awt.*;
import java.util.Random;

public class CellState {

    public Color cellSt() {
        Random random = new Random();
        random.setSeed(random.nextLong());
        return random.nextBoolean() ? Color.gray : Color.white;
    }

}
