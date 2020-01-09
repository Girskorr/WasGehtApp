package message;

import org.w3c.dom.Text;
import user.User;

public class TextMessage extends AbstractMessage {
    final String message;
    User empfänger;
    User sender;
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
        StringBuilder sb = new StringBuilder();
        sb.append (message);
        sb.append( "Sender: " + sender.getUserName());
        sb.append ("Empfänger: " + empfänger.getUserName());
        return sb.toString();
    }


}
