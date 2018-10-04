package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Foot extends JFrame{
    JPanel[] mWin = new JPanel[9];
    JPanel[] m = new JPanel[3];
    JButton left = new JButton("AC MILAN");
    JButton right = new JButton("REAL MADRID");
    int milan = 0;
    int madrid = 0;
    String result = "Result: " + milan + "x" + madrid;
    JLabel res = new JLabel(result);
    String scorer = "Last Scorer:" + "N/A";
    JLabel scor = new JLabel(scorer);
    String winner = "Winner:" +"DRAW";
    Label win = new Label(winner);
    public Foot(){
        setLayout (new GridLayout(3, 3));
        setBackground(new Color(175, 238, 238));
        for (int i = 0; i<mWin.length; i++){
            mWin[i] = new JPanel();
            add(mWin[i]);
        }
        mWin[1].add(win);
        mWin[4].add(res);
        mWin[3].add(left);
        mWin[5].add(right);
        mWin[7].add(scor);

        left.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent a) {
                milan++;
                scor.setText("Last Scorer:" + " AC MILAN");
                res.setText("Result: " + milan + "x" + madrid);
                if (milan > madrid) {
                    win.setText("Winner:" + "AC MILAN");
                } else if (milan < madrid) {
                    win.setText("Winner:" + "REAL MADRID");
                } else win.setText("Winner:" + "DRAW");
            }
        } );

        right.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent a){
                madrid++;
                scor.setText("Last Scorer:"+" REAL MADRID");
                res.setText("Result: " + milan + "x" + madrid);
                if (milan>madrid){
                    win.setText("Winner:" + "AC MILAN");
                }
                else if (milan<madrid){
                    win.setText("Winner:"+"REAL MADRID");
                }
                else win.setText("Winner:"+"DRAW");
            }
        });
        setSize(500,300);
        setVisible(true);
    }
}
