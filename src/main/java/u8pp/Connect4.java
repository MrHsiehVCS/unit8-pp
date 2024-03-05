package u8pp;

import java.util.Scanner;

public class Connect4 {

    public static final int RED_WIN = 0;
    public static final int YELLOW_WIN = 1;
    public static final int NO_WINNER = 2;
    public static final int BOTH_WIN = 3;

    public static final int RED = 1;
    public static final int YELLOW = -1;
    public static final int EMPTY = 0;

    // implementation here

    // It is recommended to use private helper methods

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            String rowOutput = "";
            for (int space : row) {
                if (space == RED) {
                    rowOutput += "🔴";
                } else if (space == Connect4.YELLOW) {
                    rowOutput += "🟡";
                } else {
                    rowOutput += "⬛";
                }
            }
            System.out.println(rowOutput);
        }
    }

    // TODO: remove these dummy implementations

    // - `public static boolean isFull(int[][] board)` - returns true if all the
    // board spaces have a piece in them. Red pieces are indicated by the static
    // final variable `Connect4.RED` and yellow pieces are indicated by
    // `Connect4.YELLOW`. Empty spaces are indicated by `Connect4.EMPTY`.
    public static boolean isFull(int[][] board) {
        for(int[] row : board) {
            for(int space : row) {
                if(space == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // - `public static boolean isBoardValid(int[][] board)` - returns true if the
    // board is a valid configuration. A board is valid if there are no floating
    // pieces, and there are either an equal number of yellow/red pieces, or there
    // is 1 more red piece than yellow pieces.
    public static boolean isBoardValid(int[][] board) {
        // floating pieces
        for(int c = 0; c < 7; c++) {
            if(isColumnValid(board, c) == false) {
                return false;
            }
        }

        // piece count
        int numRed = 0;
        int numYellow = 0;
        for(int[] row : board ) {
            for(int space : row) {
                if (space == RED) {
                    numRed ++;
                } else if (space == YELLOW) {
                    numYellow ++;
                }
            }
        }

        if(numRed > numYellow + 1) {
            return false;
        }
        if(numYellow > numRed) {
            return false;
        }


        return true;

    }

    private static boolean isColumnValid(int[][] board, int col) {
        boolean firstEmptyFound = false;
        for(int i = 5; i >= 0; i--) {
            if(board[i][col] != EMPTY) {
                firstEmptyFound = true;
            } else {
                if(firstEmptyFound) {
                    return false;
                }
            }
        }
        return true;
    }

    // - `public static int getWinner(int[][] board)` - returns `RED_WIN` if only
    // red wins, and `YELLOW_WIN` if only yellow wins. Returns `NO_WINNER` if
    // neither have won. Returns `BOTH_WIN` if both red and yellow have won. Each of
    // these return variables are found at the top of the class.
    public static int getWinner(int[][] board) {
        return Connect4.YELLOW_WIN;
    }

    private int[][] board = new int[6][7];
    private int nextPiece = RED;

    // - `public Connect4()` - constructor that starts the game with an empty board.
    // Initializes anything you might need.
    public Connect4() {
    }

    // - `public int[][] getBoard()` - returns the current board state.
    public int[][] getBoard() {
        return board;
    }

    // - `public bool dropPiece(int col)` - drops a piece in the appropriate column
    // (0 for leftmost, 6 for rightmost). Returns true if a piece was dropped.
    // Returns false if the piece cannot be dropped there (out of bounds, or in a
    // full column). Returns false if the game is already over (there is a winner).
    // The color of the piece dropped alternates, based on how many pieces there
    // are. Red always goes first, then yellow.
    public boolean dropPiece(int col) {
        if (col < 0 || col >= 7) {
            return false;
        }
        if (isColFull(col)) {
            return false;
        }

        for (int i = 5; i >= 0; i--) {
            if (board[i][col] != Connect4.EMPTY) {
                board[i][col] = nextPiece;
                if (nextPiece == RED) {
                    nextPiece = YELLOW;
                } else {
                    nextPiece = RED;
                }
                break;
            }
        }

        return true;
    }

    private boolean isColFull(int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == Connect4.EMPTY) {
                return false;
            }
        }
        return true;
    }

    // - `public void play(Scanner sc)` - plays the whole game. Please output the
    // whole board every time someone takes a turn. For this method, it should only
    // expect numbers (0-7) to indicate the row. Numbers that do not work for
    // `dropPiece` should not alter the board state. The overall user experience
    // should be easy to follow. This means, show the state of the board before each
    // time you ask for input, and give confirmation when things work, and if an
    // input is bad, tell the user why its bad.
    public void play(Scanner sc) {
        while (true) {

            printBoard(board);
            boolean success = false;
            String input = sc.nextLine();
            input = input.strip();
            input = input.substring(0, 1);
            if (input.equals("0")) {
                success = dropPiece(0);
            } else if (input.equals("1")) {
                success = dropPiece(1);
            } else if (input.equals("2")) {
                success = dropPiece(2);
            } else if (input.equals("3")) {
                success = dropPiece(3);
            } else if (input.equals("4")) {
                success = dropPiece(4);
            } else if (input.equals("5")) {
                success = dropPiece(5);
            } else if (input.equals("6")) {
                success = dropPiece(6);
            } else {
                success = false;
            }

            if (getWinner(board) != NO_WINNER) {
                break;
            }

            if (isFull(board)) {
                break;
            }

            if (success == false) {
                System.out.println("Didn't work, try again!");
            } else {
                System.out.println("next player!");
            }
        }

        int winner = getWinner(board);
        String winnerString;
        if (winner == RED_WIN) {
            winnerString = "RED";
        } else if (winner == YELLOW_WIN) {
            winnerString = "YELLOW";
        } else if (winner == BOTH_WIN) {
            winnerString = "BOTH?!?!";
        } else {
            winnerString = "NOBODY :(";
        }

        System.out.println("Game over. Winner is " + winnerString);

    }
}
