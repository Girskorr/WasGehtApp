package Test;

import network.Client;
import network.Server;
import user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServerTest {
Server server = new Server(1);
User user1 = new User (123, "Girskorr", "Julius", "Boeder");
    User user2 = new User (124, "Holy", "Christian", "Hellmann");
    User user3 = new User (1234, "test", "test", "test");
Client client1 = new Client (user1);
Client client2 = new Client(user2);
Client client3 = new Client (user3);

    @Test
    public void receive() {
    }

    @Test
    public void send() {
    }

    @Test
    public void connect() {
        server.connect(client1);
        server.connect(client2);
        server.connect(client3);
        server.connect(client3);server.connect(client3);



    }

    @Test
    public void getId() {
    }

    @Test
    public void getUser() {
    }

    @Test
    public void testGetId() {
    }

    @Test
    public void testGetUser() {
    }
}