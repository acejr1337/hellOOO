package cc.hazo.development.hellooo.gui;

import cc.hazo.development.hellooo.util.SoundStream;
import cc.hazo.development.hellooo.util.Sounds;

import javax.swing.*;

public class HelloooGraphicalUserInterface extends JFrame {

    /**
     * Made by Chace: 2/02/2021
     * Project: Hellooo - JOSH SAYS no!
     * Time: 11:25 am
     * Class: HelloooGraphicalUserInterface
     */

    // i love talkking to myself in code its fun whjen i am bored, hi josh.

    public HelloooGraphicalUserInterface() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        setTitle("hEllOOo - by Chace (OldMate#1742)");
        setResizable(false);
        setBounds(100, 100, 344, 288);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Sounds.HELLOOO.getSoundStream().get().playSound();

        JButton buttonHellooo = new JButton("Hellooo");
        buttonHellooo.setBounds(10, 110, 89, 23);
        getContentPane().add(buttonHellooo);

        JButton buttonNo = new JButton("No");
        buttonNo.setBounds(127, 110, 89, 23);
        getContentPane().add(buttonNo);

        JButton buttonYes = new JButton("Yes");
        buttonYes.setBounds(242, 110, 89, 23);
        getContentPane().add(buttonYes);


        JButton buttonIdiot = new JButton("Idiot");
        buttonIdiot.setBounds(10, 162, 89, 23);
        getContentPane().add(buttonIdiot);

        JButton buttonInsult2 = new JButton("Insult2");
        buttonInsult2.setBounds(127, 162, 89, 23);
        getContentPane().add(buttonInsult2);

        JButton buttonOwned = new JButton("Owned");
        buttonOwned.setBounds(242, 162, 89, 23);
        getContentPane().add(buttonOwned);

        JButton buttonTerrible = new JButton("Terrible");
        buttonTerrible.setBounds(10, 61, 89, 23);
        getContentPane().add(buttonTerrible);

        JButton buttonInsult = new JButton("Insult");
        buttonInsult.setBounds(127, 61, 89, 23);
        getContentPane().add(buttonInsult);

        JButton buttonThatsABullshit = new JButton("Bullshit");
        buttonThatsABullshit.setBounds(242, 61, 89, 23);
        getContentPane().add(buttonThatsABullshit);

        JLabel backgroundPicture = new JLabel("");
        backgroundPicture.setBounds(0, 0, 341, 261);
        backgroundPicture.setIcon(new ImageIcon(HelloooGraphicalUserInterface.class.getResource("/pictures/j0sh.png")));
        getContentPane().add(backgroundPicture);

        buttonHellooo.addActionListener(listener -> {
            SoundStream.playSound("hellooo.wav");
        });

        repaint();
        setVisible(true);

    }
}
