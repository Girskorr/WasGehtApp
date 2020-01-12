package message;

import data.Image;
import user.User;


public class ImageMessage extends AbstractDataMessage {
    Image image;
    String a;
    public ImageMessage (User sender, User empfänger, Image image, String datenObjekt) {
        super (sender, empfänger);
        this.image = image;
        a = datenObjekt;

    }

    public String getMediaInfo () {
        return a;
    }

}
