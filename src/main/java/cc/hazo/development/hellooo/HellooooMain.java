package cc.hazo.development.hellooo;

import cc.hazo.development.hellooo.gui.HelloooGraphicalUserInterface;

import javax.sound.sampled.LineUnavailableException;
import java.awt.*;
import java.io.IOException;

public class HellooooMain {

    /**
     * Made by Chace: 2/02/2021
     * Project: Hellooo - josh says NO!
     * Time: 11:14 am
     * Class: HellooooMain
     */

    public static HellooooMain thisClazz;

    public static void main(String[] args) {

        thisClazz = new HellooooMain();


        EventQueue.invokeLater(() -> {
                new HelloooGraphicalUserInterface();
        });
    }

}
