package message;

import data.Image;
import user.User;


public class ImageMessage extends AbstractDataMessage {
    Image image;
    public ImageMessage (User sender, User empfänger, Image image, String datenObjekt) {
        super (sender, empfänger);
        this.image = image;

    }

    public String getMediaInfo (String  a ) {
        return "test";
    }

}
