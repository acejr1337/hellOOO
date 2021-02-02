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
        super("hellOOO");

        final JFrame jframe = this;

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setResizable(false);

        jframe.setTitle("heLLoOO.exe - 3 0 s");

        jframe.setSize(900,600);

        jframe.setVisible(true);

        Sounds.HELLOOO.getSoundStream().get().playSound();
    }
}
