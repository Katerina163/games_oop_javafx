package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        assertThat(bb.position(), is(Cell.C1));
    }
    @Test
    public void testRightWay() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] array = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bb.way(Cell.G5), is(array));
    }
    @Test (expected = ImpossibleMoveException.class)
    public void testWrongWay() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        bb.way(Cell.A1);
    }
    @Test
    public void testCopy() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Figure figure = bb.copy(Cell.C1);
        assertThat(figure.position(), is(Cell.C1));
    }
}