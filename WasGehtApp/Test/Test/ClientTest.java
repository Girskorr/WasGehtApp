package Test;



import WasGehtApp.data.Audio;

import data.Image;
import message.AudioMessage;
import message.ImageMessage;
import message.TextMessage;
import network.Client;
import org.junit.Assert;
import org.junit.Test;
import user.User;

import static org.junit.Assert.*;

public class ClientTest {

    User user = new User(123, "Girskorr", "Julius", "Boeder");
    User user1 = new User (122, "Holy" , "Christian", "Hellmann");
    TextMessage message1 = new TextMessage("noob");
    TextMessage message2 = new TextMessage("selber");
    Audio audio = new Audio ();
    Image image = new Image();
    AudioMessage audiomessage = new AudioMessage(user, user1, audio, "test");
    ImageMessage imagemessage = new ImageMessage (user, user1,image, "test");
    Client client1 = new Client(user);
    Client client2 = new Client (user1);






    @Test
    public void receive() {
    }

    @Test
    public void send() {
        client1.send(message1);
    }

    @Test
    public void testSend() {

    }

    @Test
    public void testSend1() {


    }

    @Test
    public void testSend2() {
    }

    @Test
    public void connect() throws Exception {
        client1.connect(client2);

    }

    @Test
    public void getId() {
        Assert.assertEquals(123, client1.getId());
        Assert.assertEquals(122, client2.getId());
    }

    @Test
    public void getUser() {
    }
}