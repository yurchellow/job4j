package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != board[row][0]) {
                result = false;
                break;
            }
            }
            return result;
        }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[column][i] != board[0][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
    }