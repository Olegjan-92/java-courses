package Saper;

/**
 * Created by oleg on 29.07.16.
 */
public interface SuperLogic {

    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest (int x, int y, boolean bomb);
}
