package u8pp;


public class TicTacToeBoard {

    String[][] data;

    public TicTacToeBoard(String[][] data) {
        this.data = data;
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

    public boolean hasWin() {
        return hasDiagonalWin() || hasHorizontalWin() || hasVerticalWin();
    }

    public boolean hasHorizontalWin() {
        /* Your code here */
    }

    public boolean hasVerticalWin() {
        /* Your code here */
    }

    public boolean hasDiagonalWin() {
        /* Your code here */
    }

    /* helper functions go here */
   
}
