package message;

import org.w3c.dom.Text;
import user.User;

public class TextMessage extends AbstractMessage {
    final String message;

    public TextMessage (String message) {
        this.message = message;
    }
    public TextMessage (String message, User sender, User empfänger) {
        super (empfänger, sender);
       this.message =message;
    }

    @Override
    public String getTransferRepresentation() {
        return message;
    }

    @Override
    public String prettyPrint() {
        String a = message + " " + "Sender: " + sender.getUserName() + " "+  "empfänger: " + empfänger.getUserName();
        return a;
    }


}
