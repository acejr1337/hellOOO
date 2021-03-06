package cc.hazo.development.hellooo.util;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;
import lombok.SneakyThrows;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

import static cc.hazo.development.hellooo.HellooooMain.thisClazz;

public class SoundStream {

    /**
     * Made by Chace: 2/02/2021
     * Project: HELLOOO - josh says NO!
     * Time: 11:15 am
     * Class: SoundStream
     */

    private String mediaFileLocation;
    private Clip clip;
    private AudioInputStream inputStream;

    @SneakyThrows
    public SoundStream(String mediaFileLocation) {
        this.mediaFileLocation = mediaFileLocation;
        this.clip = AudioSystem.getClip();
    }

    public synchronized void playSound() {
        new Thread(() -> {
                try {
                    inputStream = AudioSystem.getAudioInputStream(SoundStream.class.getResource("/sounds/" + mediaFileLocation));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    return;
                }
        }).start();
    }
    public float getVolume() {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        return (float) Math.pow(10f, gainControl.getValue() / 20f);
    }

    public void setVolume(float volume) {
        if (volume < 0f || volume > 1f)
            throw new IllegalArgumentException("Volume not valid: " + volume);
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(20f * (float) Math.log10(volume));
    }
    public synchronized void stopAudioClip() {
        clip.stop();
    }

    /**
     * Sound constants
     */

    @NonNull
    protected static final ThreadLocal<SoundStream> SOUND_HELLOOO = ThreadLocal.withInitial(() -> {
            return new SoundStream("hellooo.wav");
    });

    public static synchronized void playSound(final String url) {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                Clip clip;
                AudioInputStream inputStream;
                try {
                    clip = AudioSystem.getClip();
                    inputStream = AudioSystem.getAudioInputStream(SoundStream.class.getResource("/sounds/" + url));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    return;
                }
            }
        }).start();
    }

}
