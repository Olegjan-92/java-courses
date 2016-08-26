package Saper;

/**
 * Created by oleg on 29.07.16.
 */
public interface Board {

    void drowBoard (Cell[][] cells);

    void drowCell (int x, int y);

    void drowBang();

    void drowCongratulate();
}
