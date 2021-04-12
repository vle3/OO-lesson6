package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameBoard 
{
    public static final int WIDTH = 600 ;
    public static final int HEIGHT = 400;

    private JFrame window;
    private MyCanvas canvas;

    private JButton startButton = new JButton("Start");
    private JButton stopButton = new JButton("Stop");
    private JButton exiButton = new JButton("Exit");
    private JLabel scoreDisplay = new JLabel();
    
    public GameBoard(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();
        
        canvas = new MyCanvas(this, WIDTH , HEIGHT);
        cp.add(BorderLayout.CENTER, canvas);

        JPanel northPanel = new JPanel();
        JLabel label = new JLabel("Score: ");
        northPanel.add(label);
        northPanel.add(scoreDisplay);
        cp.add(BorderLayout.NORTH, northPanel);

        JPanel southPanel = new JPanel();
        southPanel.add(startButton);
        southPanel.add(stopButton);
        southPanel.add(exiButton);
        cp.add(BorderLayout.SOUTH, southPanel);
    }
}
