package com.rzit.hacker.math;

/**
 * Created by Ranjith on 8/20/2017.
 */
public class QueenBoard {
    public static void main(String[] args) {

    }
}

class Position {
    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
