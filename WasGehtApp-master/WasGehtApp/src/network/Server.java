package network;

import message.Message;
import user.User;

public class Server implements Node {

    public Server (int i) {
        nodeArray = new Client [i];
    }

Node [] nodeArray;

int counter = 0;

    public void receive(Message message, int id) {

    }

    @Override
    public void receive(Message message) {

    }

    @Override
    public void send(Message message) {

    }

    public void send(Message message, int idsender, int idempfänger) {
        for (int i = 0; i < nodeArray.length; i++) {
            if (idsender == nodeArray[i].getId()) {
                for (int a = 0; a < nodeArray.length; a++) {
                if (idempfänger == nodeArray[a].getId()) {
                    nodeArray[a].receive( message);
                }
                }
            }
        }
    }

  //  public void send(Message message, int id)  {
       // nodeArray [id].send (message);

   // }

    @Override
    public void connect(Node receiver) throws ArrayIndexOutOfBoundsException {
        int counter1 = 0;
        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[i] != null) {
                counter1++;
            }
        }
        if (counter < nodeArray.length) {
                nodeArray [counter] = receiver;
            }
            else {
            throw new ArrayIndexOutOfBoundsException("Server voll");
        }
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public User getUser() {
        return nodeArray [0].getUser();
    }

    public int getId(int index) {
        return nodeArray [index].getId() ;
    }

    public User getUser(int id) {
        return nodeArray[id].getUser();
    }

}
