package cc.hazo.development.hellooo.util;

import lombok.NonNull;

public enum Sounds {

    /**
     * Made by Chace: 2/02/2021
     * Project: JosH SaYS No - hELLOOOO
     * Time: 11:38 am
     * Class: Sounds
     */

    HELLOOO(SoundStream.SOUND_HELLOOO);

    private @NonNull ThreadLocal<SoundStream> soundStream;

    Sounds(@NonNull ThreadLocal<SoundStream> soundStream) {
        this.soundStream = soundStream;
    }

    public @NonNull ThreadLocal<SoundStream> getSoundStream() {
        return soundStream;
    }
}
