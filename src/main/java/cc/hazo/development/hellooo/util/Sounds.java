package cc.hazo.development.hellooo.util;

public enum Sounds {

    /**
     * Made by Chace: 2/02/2021
     * Project: JosH SaYS No - hELLOOOO
     * Time: 11:38 am
     * Class: Sounds
     */

    HELLOOO(SoundStream.SOUND_HELLOOO);

    private SoundStream soundStream;

    Sounds(SoundStream soundStream) {
        this.soundStream = soundStream;
    }

    public SoundStream getSoundStream() {
        return soundStream;
    }
}
