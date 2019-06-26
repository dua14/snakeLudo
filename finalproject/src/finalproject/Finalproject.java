package finalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;

abstract class finalproject implements ActionListener {

    JButton close = new JButton("Close");
    private ImageIcon dice1;
    private ImageIcon dice2;
    private ImageIcon dice3;
    private ImageIcon dice4;
    private ImageIcon dice5;
    private ImageIcon dice6;
    private ImageIcon imagep1;
    private ImageIcon imagep2;
    private ImageIcon imageno1;
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    private ImageIcon image5;
    private ImageIcon image6;
    private ImageIcon image7;
    private ImageIcon image8;
    private ImageIcon image9;
    private ImageIcon image10;
    private ImageIcon image11;
    private ImageIcon image12;
    private ImageIcon image13;
    private ImageIcon image14;
    private ImageIcon image15;
    private ImageIcon image16;
    private ImageIcon image17;
    private ImageIcon image18;
    private ImageIcon image19;
    private ImageIcon image20;
    private ImageIcon image21;
    private ImageIcon image22;
    private ImageIcon image23;
    private ImageIcon image24;
    private ImageIcon image25;
    private ImageIcon image26;
    private ImageIcon image27;
    private ImageIcon image28;
    private ImageIcon image29;
    private ImageIcon image30;
    int i = 3;
    int scorep1, scorep2;

    JButton jButton1 = new JButton("Action");
    JButton sp2 = new JButton("");
    JTextField luck = new JTextField("");
    JTextField score = new JTextField("");
    JButton sp1 = new JButton("Dice");
    JTextField turn = new JTextField("");
 //   Font f = new Font("arial", Font.BOLD, 20);
    Frame win = new Frame("Snake");
    JButton l1 = new JButton("1");
    JButton l2 = new JButton("2");
    JButton l3 = new JButton("3");
    JButton l4 = new JButton("4");
    JButton l5 = new JButton("5");
    JButton l6 = new JButton("6");
    JButton l7 = new JButton("7");
    JButton l8 = new JButton("8");
    JButton l9 = new JButton("9");
    JButton l10 = new JButton("10");
    JButton l11 = new JButton("11");
    JButton l12 = new JButton("12");
    JButton l13 = new JButton("13");
    JButton l14 = new JButton("14");
    JButton l15 = new JButton("15");
    JButton l16 = new JButton("16");
    JButton l17 = new JButton("17");
    JButton l18 = new JButton("18");
    JButton l19 = new JButton("19");
    JButton l20 = new JButton("20");
    JButton l21 = new JButton("21");
    JButton l22 = new JButton("22");
    JButton l23 = new JButton("23");
    JButton l24 = new JButton("24");
    JButton l25 = new JButton("25");
    JButton l26 = new JButton("26");
    JButton l27 = new JButton("27");
    JButton l28 = new JButton("28");
    JButton l29 = new JButton("29");
    JButton l30 = new JButton("30");

    JButton p1 = new JButton("");
    JButton t1 = new JButton("P1");
    JButton p2 = new JButton("");
    JButton t2 = new JButton("P2");
    GridLayout grid = new GridLayout(7, 5);

    finalproject() {
        dice1 = new ImageIcon(getClass().getResource("dice1.jpg"));
        dice2 = new ImageIcon(getClass().getResource("dice2.jpg"));
        dice3 = new ImageIcon(getClass().getResource("dice3.jpg"));
        dice4 = new ImageIcon(getClass().getResource("dice4.jpg"));
        dice5 = new ImageIcon(getClass().getResource("dice5.jpg"));
        dice6 = new ImageIcon(getClass().getResource("dice6.jpg"));
        //l1 = new JButton(image1);
        image1 = new ImageIcon(getClass().getResource("1.jpg"));
        l1 = new JButton(image1);
        image2 = new ImageIcon(getClass().getResource("2.jpg"));
        l2 = new JButton(image2);
        image3 = new ImageIcon(getClass().getResource("3.jpg"));
        l3 = new JButton(image3);
        image4 = new ImageIcon(getClass().getResource("4.jpg"));
        l4 = new JButton(image4);
        image5 = new ImageIcon(getClass().getResource("5.jpg"));
        l5 = new JButton(image5);
        image6 = new ImageIcon(getClass().getResource("6.jpg"));
        l6 = new JButton(image6);
        image7 = new ImageIcon(getClass().getResource("7.jpg"));
        l7 = new JButton(image7);
        image8 = new ImageIcon(getClass().getResource("8.jpg"));
        l8 = new JButton(image8);
        image9 = new ImageIcon(getClass().getResource("9.jpg"));
        l9 = new JButton(image9);
        image10 = new ImageIcon(getClass().getResource("10.jpg"));
        l10 = new JButton(image10);
        image11 = new ImageIcon(getClass().getResource("11.jpg"));
        l11 = new JButton(image11);
        image12 = new ImageIcon(getClass().getResource("12.jpg"));
        l12 = new JButton(image12);
        image13 = new ImageIcon(getClass().getResource("13.jpg"));
        l13 = new JButton(image13);
        image14 = new ImageIcon(getClass().getResource("14.jpg"));
        l14 = new JButton(image14);
        image15 = new ImageIcon(getClass().getResource("15.jpg"));
        l15 = new JButton(image15);
        image16 = new ImageIcon(getClass().getResource("16.jpg"));
        l16 = new JButton(image16);
        image17 = new ImageIcon(getClass().getResource("17.jpg"));
        l17 = new JButton(image17);
        image18 = new ImageIcon(getClass().getResource("18.jpg"));
        l18 = new JButton(image18);
        image19 = new ImageIcon(getClass().getResource("19.jpg"));
        l19 = new JButton(image19);
        image20 = new ImageIcon(getClass().getResource("20.jpg"));
        l20 = new JButton(image20);
        image21 = new ImageIcon(getClass().getResource("21.jpg"));
        l21 = new JButton(image21);
        image22 = new ImageIcon(getClass().getResource("22.jpg"));
        l22 = new JButton(image22);
        image23 = new ImageIcon(getClass().getResource("23.jpg"));
        l23 = new JButton(image23);
        image24 = new ImageIcon(getClass().getResource("24.jpg"));
        l24 = new JButton(image24);
        image25 = new ImageIcon(getClass().getResource("25.jpg"));
        imagep1 = new ImageIcon(getClass().getResource("images.jpg"));
        l25 = new JButton(image25);
        p1 = new JButton(imagep1);
        imagep2 = new ImageIcon(getClass().getResource("doraemon-7.gif"));
        p2 = new JButton(imagep2);
        image26 = new ImageIcon(getClass().getResource("26.jpg"));
        l26 = new JButton(image26);
        image27 = new ImageIcon(getClass().getResource("27.jpg"));
        l27 = new JButton(image27);
        image28 = new ImageIcon(getClass().getResource("28.jpg"));
        l28 = new JButton(image28);
        image29 = new ImageIcon(getClass().getResource("29.jpg"));
        l29 = new JButton(image29);
        image30 = new ImageIcon(getClass().getResource("30.jpg"));
        l30 = new JButton(image30);
close.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
          win.dispose();
      }});
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                     luck.setText("");
                if (i % 2 == 1) {
                   // turn.setText("player Two your turn");
                    int random = (int) (Math.random() * 6 + 1);
                    dice(random);
                    scorep1 = random + scorep1;
                    //swp1(scorep1);
                    l1(scorep1, scorep2);
                    if (scorep1 > 30) {
                        scorep1 = scorep1 - random;
                        luck.setText("Unreachable");
                        //  swp1(scorep2);
                        l1(scorep1, scorep2);
                    }
                    sp1.setText(" " + scorep1);
//                    swp1(scorep1);
                    l1(scorep1, scorep2);
                    score.setText("" + random);
                    dice(random);
                    if (scorep1 == 5) {
                        luck.setText("LADDER");
                        scorep1 = 8;
                        //                      sp1.setIcon(dice5);
                        //    swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 20) {
                        luck.setText("LADDER");
                        scorep1 = 29;

                        //swp1(scorep1);
                        l1(scorep1, scorep2);
                        sp1.setText("" + scorep1);
                    }
                    if (scorep1 == 3) {
                        luck.setText("LADDER");
                        scorep1 = 22;
                        //   swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 11) {
                        luck.setText("LADDER");
                        scorep1 = 26;
                        // swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 19) {
                        luck.setText("SNAKE");
                        scorep1 = 7;
                        sp1.setText("" + scorep1);
                        //swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 27) {
                        luck.setText("SNAKE");
                        scorep1 = 1;
                        sp1.setText("" + scorep1);
                        //   swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 17) {
                        luck.setText("SNAKE");
                        scorep1 = 4;
                        sp1.setText("" + scorep1);
                        //swp1(scorep1);
                        l1(scorep1, scorep2);
                    }
                    if (scorep1 == 21) {
                        luck.setText("SNAKE");
                        scorep1 = 9;
                        sp1.setText("" + scorep1);
                        //swp1(scorep1);
                        l1(scorep1, scorep2);
                    }

                    if (scorep1 == 30) {
                        //                swp1(scorep1);
                        l1(scorep1, scorep2);
                        turn.setText("Player One win the game");
                        //close();
                        last l = new last();
                        l.setVisible(true);
                        win.dispose();

                    }
                    i++;
                    if (random == 6) {
                        turn.setText("Player1 You have got second chance");
                        score.setText("" + random);
                        //                    dice(random);
                        i--;
                    }
                } else if (i % 2 == 0) {
                    turn.setText("player One your turn");
                    int random = (int) (Math.random() * 6 + 1);
                    dice(random);
                    scorep2 = random + scorep2;
                    //swp2(scorep2);
                    l2(scorep1, scorep2);
                    if (scorep2 > 30) {
                        scorep2 = scorep2 - random;
                        luck.setText("Unreachable");
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                    }
                    sp2.setText(" " + scorep2);
                    score.setText("" + random);
                    if (scorep2 == 19) {
                        luck.setText("SNAKE");
                        scorep2 = 7;
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);
                    }
                    if (scorep2 == 27) {
                        luck.setText("SNAKE");
                        scorep2 = 1;

                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 17) {
                        luck.setText("SNAKE");
                        scorep2 = 4;
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 21) {
                        luck.setText("SNAKE");
                        scorep2 = 9;
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);
                        //    l1 = new JButton(image2);
                    }
                    if (scorep2 == 20) {
                        scorep2 = 29;
                        // swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 5) {
                        luck.setText("LADDER");
                        scorep2 = 8;
                        // swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 3) {
                        luck.setText("LADDER");
                        scorep2 = 22;
                        // swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 11) {
                        luck.setText("LADDER");
                        scorep2 = 26;
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        sp2.setText("" + scorep1);

                    }
                    if (scorep2 == 30) {
                        //                  swp2(scorep2);
                        turn.setText("Player 2 win the game");
                        // close();
                        //swp2(scorep2);
                        l2(scorep1, scorep2);
                        dwin d = new dwin();
                        d.setVisible(true);
                        win.dispose();

                    }
                    i++;
                    if (random == 6) {
                        turn.setText("Player 2 You have got second chance");
                        i--;
                        score.setText("" + random);
                    }
                }

            }

        });

        win.setLayout(grid);
        win.setBounds(0, 0, 800, 800);
        //close.addActionListener(this);

        win.add(l25);
        win.add(l26);
        win.add(l27);
        win.add(l28);
        win.add(l29);
        win.add(l30);
        win.add(l24);
        win.add(l23);
        win.add(l22);
        win.add(l21);
        win.add(l20);
        win.add(l19);
        win.add(l13);
        win.add(l14);
        win.add(l15);
        win.add(l16);
        win.add(l17);
        win.add(l18);
        win.add(l12);
        win.add(l11);
        win.add(l10);
        win.add(l9);
        win.add(l8);
        win.add(l7);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l4);
        win.add(l5);
        win.add(l6);
        // win.add(score);
        win.add(jButton1);
        // win.add(turn);
        win.add(sp1);
        win.add(p1);
        win.add(t1);
        win.add(p2);
        win.add(t2);
        win.add(luck);
  win.add(close);
        win.show();
    }

    public void dice(int random) {
        switch (random) {
            case 1:
                sp1.setIcon(dice1);
                break;
            case 2:
                sp1.setIcon(dice2);
                break;
            case 3:
                sp1.setIcon(dice3);
                break;
            case 4:
                sp1.setIcon(dice4);
                break;
            case 5:
                sp1.setIcon(dice5);
                break;
            case 6:
                sp1.setIcon(dice6);
                break;
        }

    }

    public void l2(int scorep1, int scorep2) {

        switch (scorep2) {
            case 1:
                l1.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 2:
                l2.setIcon(imagep2);
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 3:
                l3.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 4:
                l4.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 5:
                l5.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 6:
                l6.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 7:
                l7.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 8:
                l8.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 9:
                l9.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 10:
                l10.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 11:
                l11.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 12:
                l12.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 13:
                l13.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 14:
                l14.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 15:
                l15.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 16:
                l16.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 17:
                l17.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 18:
                l18.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 19:
                l19.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 20:
                l20.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 21:
                l21.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 22:
                l22.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 23:
                l23.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 24:
                l24.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 25:
                l25.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 26:
                l26.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 27:
                l27.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 28:
                l28.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 29:
                l29.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 30:
                l30.setIcon(imagep2);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                break;

        }
    }

    public void l1(int scorep2, int scorep1) {
        switch (scorep2) {
            case 1:
                l1.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 2:
                l2.setIcon(imagep1);
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 3:
                l3.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 4:
                l4.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 5:
                l5.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 6:
                l6.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 7:
                l7.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 8:
                l8.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 9:
                l9.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 10:
                l10.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 11:
                l11.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 12:
                l12.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 13:
                l13.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 14:
                l14.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 15:
                l15.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 16:
                l16.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 17:
                l17.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 18:
                l18.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 19:
                l19.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 20:
                l20.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 21:
                l21.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 22:
                l22.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 23:
                l23.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 24:
                l24.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 25:
                l25.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 26:
                l26.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 27:
                l27.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 28:
                l28.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;
            case 29:
                l29.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                if (scorep1 != 30) {
                    l30.setIcon(image30);
                }
                break;

            case 30:
                l30.setIcon(imagep1);
                if (scorep1 != 2) {
                    l2.setIcon(image2);
                }
                if (scorep1 != 3) {
                    l3.setIcon(image3);
                }
                if (scorep1 != 1) {
                    l1.setIcon(image1);
                }
                if (scorep1 != 5) {
                    l5.setIcon(image5);
                }
                if (scorep1 != 6) {
                    l6.setIcon(image6);
                }
                if (scorep1 != 7) {
                    l7.setIcon(image7);
                }
                if (scorep1 != 8) {
                    l8.setIcon(image8);
                }
                if (scorep1 != 9) {
                    l9.setIcon(image9);
                }
                if (scorep1 != 10) {
                    l10.setIcon(image10);
                }
                if (scorep1 != 11) {
                    l11.setIcon(image11);
                }
                if (scorep1 != 12) {
                    l12.setIcon(image12);
                }
                if (scorep1 != 13) {
                    l13.setIcon(image13);
                }
                if (scorep1 != 14) {
                    l14.setIcon(image14);
                }
                if (scorep1 != 15) {
                    l15.setIcon(image15);
                }
                if (scorep1 != 16) {
                    l16.setIcon(image16);
                }
                if (scorep1 != 17) {
                    l17.setIcon(image17);
                }
                if (scorep1 != 18) {
                    l18.setIcon(image18);
                }
                if (scorep1 != 19) {
                    l19.setIcon(image19);
                }
                if (scorep1 != 20) {
                    l20.setIcon(image20);
                }
                if (scorep1 != 21) {
                    l21.setIcon(image21);
                }
                if (scorep1 != 22) {
                    l22.setIcon(image22);
                }
                if (scorep1 != 23) {
                    l23.setIcon(image23);
                }
                if (scorep1 != 24) {
                    l24.setIcon(image24);
                }
                if (scorep1 != 25) {
                    l25.setIcon(image25);
                }
                if (scorep1 != 26) {
                    l26.setIcon(image26);
                }
                if (scorep1 != 27) {
                    l27.setIcon(image27);
                }
                if (scorep1 != 28) {
                    l28.setIcon(image28);
                }
                if (scorep1 != 29) {
                    l29.setIcon(image29);
                }
                if (scorep1 != 4) {
                    l4.setIcon(image4);
                }
                break;

        }

    }

    public void actionPerformed(ActionEvent closing) {
// getSource() checks for the source of clicked Button , compares with the name of button in which here is close .     
        if (closing.getSource() == close) {
            System.exit(0);
        }

    }

    public static void main(String args[]) {

        new finalproject() {
        };
    }

    public void windowClosing(WindowEvent e) {
        dispose();
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
