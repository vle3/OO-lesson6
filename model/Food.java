package model;

import java.awt.Graphics2D;

import view.GameBoard;

import java.awt.Color;

public class Food extends GameElement
{
    public Food(int x , int y, Color color)
    {
        super(x, y);
        this.color = color;
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(color);        
        g2.fillOval(x, y , GameBoard.CELL_SIZE , GameBoard.CELL_SIZE);
    }

    @Override
    public void move() {}
}
