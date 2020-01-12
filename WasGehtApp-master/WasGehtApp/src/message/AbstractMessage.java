package message;

import user.User;

 abstract class AbstractMessage implements Message {
    final User empfänger;
    final User sender;
    protected AbstractMessage (User sender,  User empfänger) {
        this.empfänger = empfänger;
        this.sender = sender;
    }

    public AbstractMessage () {

        empfänger = new User(0, "fail", "fail", "fail");
        sender = new User(0, "fail", "fail", "fail");
    }



    public final User getSender () {
        return sender;
    }

    public final User getRecipient () {
        return empfänger;
    }


}
