package cc.hazo.development.hellooo.gui;

import cc.hazo.development.hellooo.HellooooMain;
import cc.hazo.development.hellooo.util.SoundStream;
import cc.hazo.development.hellooo.util.Sounds;

import javax.swing.*;
import java.awt.*;

public class HelloooGraphicalUserInterface extends JFrame {

    /**
     * Made by Chace: 2/02/2021
     * Project: Hellooo - JOSH SAYS no!
     * Time: 11:25 am
     * Class: HelloooGraphicalUserInterface
     */

    // i love talkking to myself in code its fun whjen i am bored, hi josh.
    private HellooooMain hellooooMain;
    private SoundStream soundStream;
    public HelloooGraphicalUserInterface() {
        super("hellOOO");

        final JFrame jframe = this;

        Sounds.HELLOOO.getSoundStream().playSound();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setResizable(false);

        jframe.setTitle("heLLoOO.exe - 3 0 s");

        jframe.setVisible(true);

        jframe.setSize(50,50);

        jframe.repaint();
    }

    public void frameInit() {
        super.frameInit();
    }

    public static void initializeClass() {
        new HelloooGraphicalUserInterface();
    }
}
