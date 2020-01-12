package network;

import message.AudioMessage;
import message.ImageMessage;
import message.Message;
import message.TextMessage;
import user.User;

public class Client implements Node {

        public  Client (User user) {
            clientuser = user;
        }
        private final User clientuser;
        Node node;

    @Override
    public void receive(Message message) {
        System.out.print("Nachricht: ");
        System.out.println (message.getSender().getId() + message.prettyPrint());
    }

    @Override
    public void send(Message message) {
        node.receive(message);
    }

    @Override
    public void connect(Node receiver) throws Exception {

    }


    public void connect(Client receiver) throws Exception {
        node = receiver;
    }

    public void send (TextMessage message) {
        node.receive(message);
    }

    public void send (ImageMessage image) {
        node.receive(image);
    }

    public void send (AudioMessage audio) {
            node.receive(audio);
    }



    @Override
    public int getId() {
        return clientuser.getId();
    }

    @Override
    public User getUser() {
        return clientuser;
    }
}
