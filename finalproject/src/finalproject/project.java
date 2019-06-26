package finalproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;

abstract class project implements ActionListener {

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
    private ImageIcon image31;

    private ImageIcon imagep32;
    private ImageIcon image33;
    private ImageIcon image34;
    private ImageIcon image35;
    private ImageIcon image36;
    private ImageIcon image37;
    private ImageIcon imagep38;
    private ImageIcon imagep39;
    private ImageIcon image40;
    private ImageIcon image41;
    private ImageIcon image42;
    private ImageIcon image43;
    private ImageIcon image44;
    private ImageIcon image45;
    private ImageIcon image46;
    private ImageIcon imagep47;
    private ImageIcon image48;
    private ImageIcon image49;
    private ImageIcon image50;
    private ImageIcon image51;
    private ImageIcon image52;
    private ImageIcon image53;
    private ImageIcon image54;
    private ImageIcon image55;
    private ImageIcon image56;
    private ImageIcon image57;
    private ImageIcon image58;
    private ImageIcon image59;
    private ImageIcon image60;
    private ImageIcon image61;
    private ImageIcon imagep62;
    private ImageIcon image63;
    private ImageIcon imagep64;
    private ImageIcon image65;
    private ImageIcon image66;
    private ImageIcon image67;
    private ImageIcon image68;
    private ImageIcon image69;
    private ImageIcon image70;
    private ImageIcon image71;
    private ImageIcon image72;
    private ImageIcon image73;
    private ImageIcon image74;
    private ImageIcon image75;
    private ImageIcon image76;
    private ImageIcon image77;
    private ImageIcon image78;
    private ImageIcon image79;
    private ImageIcon image80;
    private ImageIcon image81;
    private ImageIcon image82;
    private ImageIcon image83;
    private ImageIcon image84;
    private ImageIcon image85;
    private ImageIcon image86;
    private ImageIcon image87;
    private ImageIcon image88;
    private ImageIcon image89;
    private ImageIcon image90;
    private ImageIcon image91;
    private ImageIcon image92;
    private ImageIcon image93;
    private ImageIcon image94;
    private ImageIcon image95;
    private ImageIcon image96;
    private ImageIcon image97;
    private ImageIcon image98;
    private ImageIcon image99;
    private ImageIcon image100;
    ;
    int i = 3;
    int scorep1, scorep2;

    JButton jButton1 = new JButton("Action");

    JTextField luck = new JTextField("");
    JTextField score = new JTextField("");
    JTextField sp1 = new JTextField("");
    JTextField sp2 = new JTextField("");
    JTextField turn = new JTextField("");
    Font f = new Font("arial", Font.BOLD, 20);
    Frame win = new Frame("Snake");
    JButton l1 = new JButton();
    JButton l2 = new JButton();
    JButton l3 = new JButton();
    JLabel l4 = new JLabel("");
    JLabel l5 = new JLabel("");
    JLabel l6 = new JLabel("7");
    JLabel l7 = new JLabel("7");
    JLabel l8 = new JLabel("8");
    JLabel l9 = new JLabel("9");
    JLabel l10 = new JLabel("10");
    JLabel l11 = new JLabel("11");
    JLabel l12 = new JLabel("12");
    JLabel l13 = new JLabel("13");
    JLabel l14 = new JLabel("14");
    JLabel l15 = new JLabel("15");
    JLabel l16 = new JLabel("16");
    JLabel l17 = new JLabel("17");
    JLabel l18 = new JLabel("18");
    JLabel l19 = new JLabel("19");
    JLabel l20 = new JLabel("20");
    JLabel l21 = new JLabel("1");
    JLabel l22 = new JLabel("1");
    JLabel l23 = new JLabel("1");
    JLabel l124 = new JLabel("1");
    JLabel l24 = new JLabel("1");
    JLabel l25 = new JLabel("1");
    JLabel l26 = new JLabel("1");
    JLabel l27 = new JLabel("1");
    JLabel l28 = new JLabel("1");
    JLabel l29 = new JLabel("1");
    JLabel l30 = new JLabel("1");
    JLabel l31 = new JLabel("1");
    JLabel l32 = new JLabel("1");
    JLabel l33 = new JLabel("1");
    JLabel l34 = new JLabel("1");
    JLabel l35 = new JLabel("1");
    JLabel l36 = new JLabel("1");
    JLabel l37 = new JLabel("1");
    JLabel l38 = new JLabel("1");
    JLabel l39 = new JLabel("1");
    JLabel l40 = new JLabel("1");
    JLabel l41 = new JLabel("1");
    JLabel l42 = new JLabel("1");
    JLabel l43 = new JLabel("1");
    JLabel l44 = new JLabel("1");
    JLabel l45 = new JLabel("1");
    JLabel l46 = new JLabel("1");
    JLabel l47 = new JLabel("1");
    JLabel l48 = new JLabel("1");
    JLabel l49 = new JLabel("1");
    JLabel l50 = new JLabel("1");
    JLabel l51 = new JLabel("1");
    JLabel l52 = new JLabel("1");
    JLabel l53 = new JLabel("1");
    JLabel l54 = new JLabel("1");
    JLabel l55 = new JLabel("1");
    JLabel l56 = new JLabel("1");
    JLabel l57 = new JLabel("1");
    JLabel l58 = new JLabel("1");
    JLabel l59 = new JLabel("1");
    JLabel l60 = new JLabel("1");
    JLabel l61 = new JLabel("1");
    JLabel l62 = new JLabel("1");
    JLabel l63 = new JLabel("1");
    JLabel l64 = new JLabel("1");
    JLabel l65 = new JLabel("1");
    Label l66 = new Label("1");
    JLabel l67 = new JLabel("1");
    JLabel l68 = new JLabel("1");
    JLabel l69 = new JLabel("1");
    JLabel l70 = new JLabel("1");
    JLabel l71 = new JLabel("1");
    JLabel l72 = new JLabel("1");
    JLabel l73 = new JLabel("1");
    JLabel l74 = new JLabel("1");
    JLabel l75 = new JLabel("1");
    JLabel l76 = new JLabel("1");
    JLabel l77 = new JLabel("1");
    JLabel l78 = new JLabel("1");
    JLabel l79 = new JLabel("1");
    JLabel l80 = new JLabel("1");
    JLabel l81 = new JLabel("1");
    JLabel l82 = new JLabel("1");
    JLabel l83 = new JLabel("1");
    JLabel l84 = new JLabel("1");
    JLabel l85 = new JLabel("1");
    JLabel l86 = new JLabel("1");
    JLabel l87 = new JLabel("1");
    JLabel l88 = new JLabel("1");
    JLabel l89 = new JLabel("1");
    JLabel l90 = new JLabel("1");
    JLabel l91 = new JLabel("1");
    JLabel l92 = new JLabel("1");
    JLabel l93 = new JLabel("1");
    JLabel l94 = new JLabel("1");
    JLabel l95 = new JLabel("1");
    JLabel l96 = new JLabel("1");
    JLabel l97 = new JLabel("1");
    JLabel l98 = new JLabel("1");
    JLabel l99 = new JLabel("99");
    JLabel l100 = new JLabel("100");
    //JLabel ld = new JLabel("DICE");
    //JLabel dpic = new JLabel("Dice pic");
    JButton p1 = new JButton("");
    JButton t1 = new JButton("P1");
    JButton p2 = new JButton("");
    JButton t2 = new JButton("P2");

//Label jLabelObject = new Label();
    GridLayout grid = new GridLayout(10, 10);

    project() {
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (i % 2 == 1) {
                    turn.setText("player Two your turn");
                    int random = (int) (Math.random() * 6 + 1);

                    scorep1 = random + scorep1;
//use seticondua
                

                    if (scorep1 > 100) {
                        scorep1 = scorep1 - random;
                        luck.setText("Unreachable");
                    }
                    sp1.setText(" " + scorep1);

                    score.setText("" + random);
                    if (scorep1 == 5) {
                        luck.setText("LADDER");
                        scorep1 = 21;
                        sp1.setText("" + scorep1);
                        l21 = new JLabel(image2);
                    }
                    if (scorep1 == 40) {
                        luck.setText("LADDER");
                        scorep1 = 61;
                        l61 = new JLabel(image2);
                        sp1.setText("" + scorep1);
                    }
                    if (scorep1 == 70) {
                        luck.setText("LADDER");
                        scorep1 = 90;
                        l90 = new JLabel(image2);
                        sp1.setText("" + scorep1);
                    }
                    if (scorep1 == 20) {
                        luck.setText("SNAKE");
                        scorep1 = 1;
                        sp1.setText("" + scorep1);
                        l20 = new JLabel(image2);
                    }
                    if (scorep1 == 60) {
                        luck.setText("SNAKE");
                        scorep1 = 45;
                        sp1.setText("" + scorep1);
                        l45 = new JLabel(image2);
                    }
                    if (scorep1 == 85) {
                        luck.setText("SNAKE");
                        scorep1 = 72;
                        sp1.setText("" + scorep1);
                        l72 = new JLabel(image2);
                    }

                    if (scorep1 == 100) {
                        turn.setText("Player One win the game");
                        //close();
                        //last l=new last();
                        //l.setVisible(true);
                    }
                    i++;
                    if (random == 6) {
                        turn.setText("Player1 You have got second chance");
                        score.setText("" + random);
                        i--;
                    }
                } else if (i % 2 == 0) {
                    turn.setText("player One your turn");
                    int random = (int) (Math.random() * 6 + 1);
                    scorep2 = random + scorep2;
                    if (scorep2 > 100) {
                        scorep2 = scorep2 - random;
                        luck.setText("Unreachable");
                    }
                    sp2.setText(" " + scorep2);
                    score.setText("" + random);
                    if (scorep2 == 5) {

                        scorep2 = 21;
                        sp2.setText("" + scorep1);
                    }
                    if (scorep2 == 40) {
                        scorep2 = 61;
                        sp2.setText("" + scorep1);
                        l61 = new JLabel(image2);
                    }
                    if (scorep2 == 70) {
                        scorep2 = 90;
                        sp2.setText("" + scorep1);
                        l90 = new JLabel(image2);
                    }
                    if (scorep2 == 20) {
                        scorep2 = 1;
                        sp2.setText("" + scorep1);
                        l1 = new JButton(image2);
                    }
                    if (scorep2 == 60) {
                        scorep2 = 45;
                        l45 = new JLabel(image2);
                        sp2.setText("" + scorep1);
                    }
                    if (scorep2 == 85) {
                        scorep2 = 72;
                        sp2.setText("" + scorep1);
                        l72 = new JLabel(image2);
                    }
                    if (scorep2 == 100) {
                        turn.setText("Player 2 win the game");
                        //  close();
                        // dwin d=new dwin();
                        // d.setVisible(true);
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
        win.setBounds(0, 0, 900, 1000);
        imagep1 = new ImageIcon(getClass().getResource("images.jpg"));
        p1 = new JButton(imagep1);
        imagep2 = new ImageIcon(getClass().getResource("doraemon-7.gif"));
        p2 = new JButton(imagep2);
        imageno1 = new ImageIcon(getClass().getResource("1.jpg"));
        l100 = new JLabel(imageno1);
        image2 = new ImageIcon(getClass().getResource("2.jpg"));
        l99 = new JLabel(image2);
        image3 = new ImageIcon(getClass().getResource("3.jpg"));
        l98 = new JLabel(image3);
        image4 = new ImageIcon(getClass().getResource("4.jpg"));
        l97 = new JLabel(image4);
        image5 = new ImageIcon(getClass().getResource("5.jpg"));
        l96 = new JLabel(image5);
        image6 = new ImageIcon(getClass().getResource("6.jpg"));
        l95 = new JLabel(image6);
        image7 = new ImageIcon(getClass().getResource("7.jpg"));
        l94 = new JLabel(image7);
        image8 = new ImageIcon(getClass().getResource("8.jpg"));
        l93 = new JLabel(image8);
        image9 = new ImageIcon(getClass().getResource("9.jpg"));
        l92 = new JLabel(image9);
        image10 = new ImageIcon(getClass().getResource("10.jpg"));
        l91 = new JLabel(image10);
        image11 = new ImageIcon(getClass().getResource("11.jpg"));
        l90 = new JLabel(image11);
        image12 = new ImageIcon(getClass().getResource("12.jpg"));
        l89 = new JLabel(image12);
        image13 = new ImageIcon(getClass().getResource("13.jpg"));
        l88 = new JLabel(image13);
        image14 = new ImageIcon(getClass().getResource("14.jpg"));
        l87 = new JLabel(image14);
        image15 = new ImageIcon(getClass().getResource("15.jpg"));
        l86 = new JLabel(image15);
        image16 = new ImageIcon(getClass().getResource("16.jpg"));
        l85 = new JLabel(image16);
        image17 = new ImageIcon(getClass().getResource("17.jpg"));
        l84 = new JLabel(image17);
        image18 = new ImageIcon(getClass().getResource("18.jpg"));
        l83 = new JLabel(image18);
        image19 = new ImageIcon(getClass().getResource("19.jpg"));
        l82 = new JLabel(image19);
        image20 = new ImageIcon(getClass().getResource("20.jpg"));
        l81 = new JLabel(image20);
        image21 = new ImageIcon(getClass().getResource("21.jpg"));
        l80 = new JLabel(image21);
        image22 = new ImageIcon(getClass().getResource("22.jpg"));
        l79 = new JLabel(image22);
        image23 = new ImageIcon(getClass().getResource("23.jpg"));
        l78 = new JLabel(image23);
        image24 = new ImageIcon(getClass().getResource("24.jpg"));
        l77 = new JLabel(image24);
        image25 = new ImageIcon(getClass().getResource("25.jpg"));
        l76 = new JLabel(image25);

        // im = new JButton(image2);
        //l1 = new JButton(image1);
        //l2 = new JButton(image1);
        win.add(t1);
        win.add(t2);
        win.add(p1);
        win.add(p2);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l4);
        win.add(l5);
        win.add(l16);
        win.add(l17);
        win.add(l18);
        win.add(l19);
        win.add(l20);
        win.add(l21);
        win.add(l22);
        win.add(l23);
        win.add(l24);
        win.add(l25);
        win.add(l26);
        win.add(l27);
        win.add(l28);
        win.add(l29);
        win.add(l30);
        win.add(l31);
        win.add(l32);
        win.add(l33);
        win.add(l34);
        win.add(l35);
        win.add(l36);
        win.add(l37);
        win.add(l38);
        win.add(l39);
        win.add(l40);
        win.add(l41);
        win.add(l42);
        win.add(l43);
        win.add(l44);
        win.add(l45);
        win.add(l46);
        win.add(l47);
        win.add(l48);
        win.add(l49);
        win.add(l50);
        win.add(l51);
        win.add(l52);
        win.add(l53);
        win.add(l54);
        win.add(l55);
        win.add(l56);
        win.add(l57);
        win.add(l58);
        win.add(l59);
        win.add(l60);
        win.add(l61);
        win.add(l62);
        win.add(l63);
        win.add(l64);
        win.add(l65);
        win.add(l66);
        win.add(l67);
        win.add(l68);
        win.add(l69);
        win.add(l70);
        win.add(l71);
        win.add(l72);
        win.add(l73);
        win.add(l74);
        win.add(l75);
        win.add(l76);
        win.add(l77);
        win.add(l78);
        win.add(l79);
        win.add(l80);
        win.add(l81);
        win.add(l82);
        win.add(l83);
        win.add(l84);
        win.add(l85);
        win.add(l86);
        win.add(l87);
        win.add(l88);
        win.add(l89);
        win.add(l90);
        win.add(l91);
        win.add(l92);
        win.add(l93);
        win.add(l94);
        win.add(l95);
        win.add(l96);
        win.add(l97);
        win.add(l98);
        win.add(l99);
        win.add(l100);
        //win.add(p1);
        //win.add(p2);
        //win.add(im);
        //win.add(im2);
        //win.add(ld);
        //win.add(dpic);
        win.add(score);
        win.add(jButton1);
        win.add(sp1);
        win.add(sp2);
        win.add(turn);
        win.add(luck);
        win.show();
    }

    public static void main(String args[]) {

        new project() {
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

    }

}

