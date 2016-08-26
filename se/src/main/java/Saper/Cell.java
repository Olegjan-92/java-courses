package Saper;

/**
 * Created by oleg on 29.07.16.
 */
public interface Cell<I> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void drow(I paint, boolean real);


}
