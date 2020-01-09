package message;

import WasGehtApp.data.Audio;
import WasGehtApp.data.Image;
import user.User;

public class AudioMessage extends  AbstractDataMessage {
    Audio audio;
    public AudioMessage (User sender, User empfänger, Audio audio, String datenObjekt) {
        super (sender, empfänger);
        this.audio = audio;

    }

    public void playAudioMessage (Audio audio) {
        audio.play();

    }

}
