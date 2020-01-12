package message;

import data.Data;
import user.User;

 abstract class AbstractDataMessage  extends AbstractMessage implements DataMessage {
    Data data;

    protected AbstractDataMessage(User sender, User empfänger) {
        super(sender, empfänger);
    }

    @Override
    public String getTransferRepresentation() {
         String s = this.getClass().getName() ;
        return s;
    }

    @Override
    public String prettyPrint() {
        return null;
    }

    @Override
    public String getMediaInfo() {
        return null;
    }

    @Override
    public Data getDataObject() {
        return data;
    }
}
