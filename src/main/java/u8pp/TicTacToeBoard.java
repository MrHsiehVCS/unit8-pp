package u8pp;

public class TicTacToeBoard {

    // spaces are filled with "X", "O", or " " (single space)
    // boards can come in any size, 
    // but you are guaranteed that each board has the same number of 
    // rows and columns (aka square boards only)

    // if you want some example boards, go to TicTacToeCheckerTests.java 
    String[][] data;

    public TicTacToeBoard(String[][] data) {
        this.data = data;
        System.out.println(this);
        System.out.println();
    }

    public String toString() {
        String output = "";
        for(int r = 0; r < data.length; r++) {
            if(r != 0) {
                output += "\n";
                output += "-+".repeat(data[r].length - 1);
                output += "-";
                output += "\n";
            }
            for(int c = 0; c < data[r].length; c++) {
                if(c != 0) {
                    output += "|";
                }
                output += data[r][c];
            }
        }
        return output;
    }

    public boolean hasHorizontalWin() {
        /* Your code here */
        return false;
    }

    public boolean hasVerticalWin() {
        /* Your code here */
        return false;
    }

    public boolean hasDiagonalWin() {
        /* Your code here */
        return false;
    }

    /* helper functions go here */
}
