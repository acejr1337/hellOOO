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

    private URL mediaFileLocation;
    private Clip clip;
    private AudioInputStream inputStream;

    @SneakyThrows
    public SoundStream(URL mediaFileLocation) {
        this.mediaFileLocation = mediaFileLocation;
        this.clip = AudioSystem.getClip();
    }

    public synchronized void playSound() {
        new Thread(() -> {
                try {
                    inputStream = AudioSystem.getAudioInputStream(SoundStream.class.getResource("/" + mediaFileLocation));
                    clip.open(inputStream);
                    setVolume(Float.valueOf(getVolume()/20));
                    clip.start();
                } catch (Exception e) {
                    return;
                } finally {
                    this.clip.close();
                    try {
                        this.inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    this.clip.flush();
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
            return new SoundStream(thisClazz.getClass().getResource("/resources/sounds/hellooo.wav"));
    });

}
