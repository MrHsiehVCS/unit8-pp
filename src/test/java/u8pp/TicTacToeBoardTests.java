package u8pp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeBoardTests {

    String[][] smallEmptyData =
    {
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}
    };
    TicTacToeBoard smallEmpty = new TicTacToeBoard(smallEmptyData);


    String[][] smallNoWinData =
    {
        {"O", "X", "O"},
        {"X", " ", "X"},
        {"O", "X", "O"}
    };
    TicTacToeBoard smallNoWin = new TicTacToeBoard(smallNoWinData);
    
    // row 1 win
    String[][] smallR1WinData = {
        {"O", "O", "O"},
        {"X", " ", "X"},
        {"X", " ", "X"}
    };
    TicTacToeBoard smallR1Win = new TicTacToeBoard(smallR1WinData);
    
    // row 2 win
    public String[][] boardR2WinSmall = {
        {"X", " ", "O"},
        {"X", "X", "X"},
        {"O", " ", "O"}
    };
    public TicTacToeBoard smallR2Win = new TicTacToeBoard(boardR2WinSmall);
    
    // row 3 win
    public String[][] boardR3WinSmall = {
        {"X", " ", "O"},
        {"O", " ", "X"},
        {"X", "X", "X"},
    };
    public TicTacToeBoard smallR3Win = new TicTacToeBoard(boardR3WinSmall);
    
    // col 1 win
    public String[][] boardC1WinSmall = {
        {"X", " ", "O"},
        {"X", " ", "X"},
        {"X", " ", "X"},
    };
    public TicTacToeBoard smallC1Win = new TicTacToeBoard(boardC1WinSmall);
    
    // col 2 win
    public String[][] boardC2WinSmall = {
        {"O", "X", " "},
        {"O", "X", " "},
        {"X", "X", " "},
    };
    public TicTacToeBoard smallC2Win = new TicTacToeBoard(boardC2WinSmall);
    
    // col 3 win
    public String[][] boardC3WinSmall = {
        {"X", "O", "O"},
        {" ", "X", "O"},
        {"X", "X", "O"},
    };
    public TicTacToeBoard smallC3Win = new TicTacToeBoard(boardC3WinSmall);
    
    // diagonal 1 win
    public String[][] boardD1WinSmall = {
        {"X", "O", "O"},
        {" ", "X", "O"},
        {"X", "O", "X"},
    };
    public TicTacToeBoard smallD1Win = new TicTacToeBoard(boardD1WinSmall);
    
    // diagonal 2 win
    public String[][] boardD2WinSmall = {
        {"X", "O", "X"},
        {" ", "X", "O"},
        {"X", "X", "O"},
    };
    public TicTacToeBoard smallD2Win = new TicTacToeBoard(boardD2WinSmall);
    
    // multi win 1
    public String[][] boardMultiWin1Small = {
        {"X", "O", "X"},
        {"X", "X", "O"},
        {"X", "X", "O"},
    };
    public TicTacToeBoard smallMultiWin1 = new TicTacToeBoard(boardMultiWin1Small);
    
    // multi win 2
    public String[][] boardMultiWin2Small = {
        {"O", "X", "X"},
        {"X", "X", "O"},
        {"X", "X", "X"},
    };
    public TicTacToeBoard smallMultiWin2 = new TicTacToeBoard(boardMultiWin2Small);
    

    public String[][] boardBigEmpty = {
        {" ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " "},
    };
    public TicTacToeBoard bigEmpty = new TicTacToeBoard(boardBigEmpty);


    public String[][] boardBig1 = {
        {"X", "X", "O", "X", "O"},
        {"X", "X", "O", "O", "X"},
        {"X", "X", "O", "X", "X"},
        {"X", "O", "O", "X", "X"},
        {"O", "X", "O", "X", "X"},
    };
    public TicTacToeBoard big1 = new TicTacToeBoard(boardBig1);
    

    public String[][] boardBig2 = {
        {"X", "X", "X", "O", "X"},
        {"X", "X", "O", "X", "X"},
        {"X", "X", "X", "X", "O"},
        {"X", "O", "X", "X", "X"},
        {"O", "X", "X", "X", "X"},
    };
    public TicTacToeBoard big2 = new TicTacToeBoard(boardBig2);
    

    public String[][] boardBig3 = {
        {"X", "X", "X", "O", "X"},
        {"X", "X", "X", "X", "X"},
        {"X", "X", "X", "X", "O"},
        {"X", "O", "X", "X", "X"},
        {"O", "X", "X", "X", "X"},
    };
    public TicTacToeBoard big3 = new TicTacToeBoard(boardBig3);
    

    public String[][] boardBig4 = {
        {"X", "X", "X", "O", "X"},
        {"X", "X", "X", "X", "X"},
        {"X", "X", "X", "X", "O"},
        {"X", "O", "O", "X", "X"},
        {"O", "X", "X", "X", "X"},
    };
    public TicTacToeBoard big4 = new TicTacToeBoard(boardBig4);
    

    public String[][] boardBig5 = {
        {"O", "X", "X", "O", "X"},
        {"X", "X", "X", "X", "O"},
        {"X", "X", "O", "O", "X"},
        {"X", "X", "X", "X", "X"},
        {"O", "X", "X", "X", "X"},
    };
    public TicTacToeBoard big5 = new TicTacToeBoard(boardBig5);
    
    @Test
    public void smallBoards_hasHorziontalWin_isCorrect() {
        assertEquals(false, smallEmpty.hasHorizontalWin());
        assertEquals(false, smallNoWin.hasHorizontalWin());
        assertEquals(true, smallR1Win.hasHorizontalWin());
        assertEquals(true, smallR2Win.hasHorizontalWin());
        assertEquals(true, smallR3Win.hasHorizontalWin());
        assertEquals(false, smallC1Win.hasHorizontalWin());
        assertEquals(false, smallC2Win.hasHorizontalWin());
        assertEquals(false, smallC3Win.hasHorizontalWin());
        assertEquals(false, smallD1Win.hasHorizontalWin());
        assertEquals(false, smallD2Win.hasHorizontalWin());
        assertEquals(false, smallMultiWin1.hasHorizontalWin());
        assertEquals(true, smallMultiWin2.hasHorizontalWin());
    }

    @Test
    public void bigBoards_hasHorizontalWin_isCorrect() {
        assertEquals(false, bigEmpty.hasHorizontalWin());
        assertEquals(false, big1.hasHorizontalWin());
        assertEquals(false, big2.hasHorizontalWin());
        assertEquals(true, big3.hasHorizontalWin());
        assertEquals(true, big4.hasHorizontalWin());
        assertEquals(true, big5.hasHorizontalWin());
    }

    @Test
    public void smallBoards_hasVerticalWin_isCorrect() {
        assertEquals(false, smallEmpty.hasVerticalWin());
        assertEquals(false, smallNoWin.hasVerticalWin());
        assertEquals(false, smallR1Win.hasVerticalWin());
        assertEquals(false, smallR2Win.hasVerticalWin());
        assertEquals(false, smallR3Win.hasVerticalWin());
        assertEquals(true, smallC1Win.hasVerticalWin());
        assertEquals(true, smallC2Win.hasVerticalWin());
        assertEquals(true, smallC3Win.hasVerticalWin());
        assertEquals(false, smallD1Win.hasVerticalWin());
        assertEquals(false, smallD2Win.hasVerticalWin());
        assertEquals(true, smallMultiWin1.hasVerticalWin());
        assertEquals(true, smallMultiWin2.hasVerticalWin());
    }

    @Test
    public void bigBoards_hasVerticalWin_isCorrect() {
        assertEquals(false, bigEmpty.hasVerticalWin());
        assertEquals(true, big1.hasVerticalWin());
        assertEquals(false, big2.hasVerticalWin());
        assertEquals(true, big3.hasVerticalWin());
        assertEquals(false, big4.hasVerticalWin());
        assertEquals(true, big5.hasVerticalWin());
    }

    @Test
    public void smallBoards_hasDiagonalWin_isCorrect() {
        assertEquals(false, smallEmpty.hasDiagonalWin());
        assertEquals(false, smallR1Win.hasDiagonalWin());
        assertEquals(false, smallR2Win.hasDiagonalWin());
        assertEquals(false, smallR3Win.hasDiagonalWin());
        assertEquals(false, smallC1Win.hasDiagonalWin());
        assertEquals(false, smallC2Win.hasDiagonalWin());
        assertEquals(false, smallC3Win.hasDiagonalWin());
        assertEquals(true, smallD1Win.hasDiagonalWin());
        assertEquals(true, smallD2Win.hasDiagonalWin());
        assertEquals(true, smallMultiWin1.hasDiagonalWin());
        assertEquals(true, smallMultiWin2.hasDiagonalWin());
    }
    
    @Test
    public void bigBoards_hasDiagonalWin_isCorrect() {
        assertEquals(false, bigEmpty.hasDiagonalWin());
        assertEquals(true, big1.hasDiagonalWin());
        assertEquals(true, big2.hasDiagonalWin());
        assertEquals(true, big3.hasDiagonalWin());
        assertEquals(true, big4.hasDiagonalWin());
        assertEquals(false, big5.hasDiagonalWin());
    }

}




