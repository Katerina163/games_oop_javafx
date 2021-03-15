package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KnightBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

public class LogicTest {
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new KnightBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }
    @Test (expected = FigureNotFoundException.class)
    public void testNoFigure()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C2, Cell.H6);
    }
    @Test (expected = OccupiedCellException.class)
    public void testExceptionFree() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new KnightBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.D4));
        logic.move(Cell.D4, Cell.A1);
    }
}