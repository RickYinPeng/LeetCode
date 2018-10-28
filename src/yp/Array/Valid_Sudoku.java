package yp.Array;

import java.util.HashSet;

/**
 * @author RickYinPeng
 * @ClassName Valid_Sudoku
 * @Description LeetCode中第36道题
 * @date 2018/10/9/19:10
 *
 * 题目名称：有效的数独
 */
public class Valid_Sudoku {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean b = not_to_repeat(board);
        System.out.println(b);
    }

    /**
     * 大佬做法，牛逼
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // 检查第i行，在横坐标位置
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                // 检查第i列，在纵坐标位置
                if (board[j][i] != '.' && !column.add(board[j][i]))
                    return false;
                // 行号+偏移量
                int RowIndex = 3 * (i / 3) + j / 3;
                // 列号+偏移量
                int ColIndex = 3 * (i % 3) + j % 3;
                //每个小九宫格，总共9个
                if (board[RowIndex][ColIndex] != '.' && !cube.add(board[RowIndex][ColIndex]))
                    return false;
            }
        }
        return true;

    }

    /**
     * 判断是否重复
     */
    public static boolean not_to_repeat(char[][] a) {
        /**
         * 判断行和列是否重复
         */
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet();
            HashSet<Character> col = new HashSet();
            for (int j = 0; j < 9; j++) {
                    //判断行是否重复
                if(a[i][j]!='.') {
                    if (row.contains(a[i][j])) {
                        return false;
                    } else {
                        row.add(a[i][j]);
                    }
                }
                if(a[j][i]!='.') {
                    //判断列是否重复
                    if (col.contains(a[j][i])) {
                        return false;
                    } else {
                        col.add(a[j][i]);
                    }
                }
            }
        }
        //行和列都无重复
        return true;
    }
}
