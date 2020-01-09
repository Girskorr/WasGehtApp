import WasGehtApp.data.Audio;
import data.Image;
import message.AudioMessage;
import message.ImageMessage;
import message.TextMessage;
import network.Client;
import network.Server;
import user.User;

public class maintest {

    public static void main (String [] args) {
        Server server = new Server(2);
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

        server.connect(client1);
        server.connect(client2);

        client1.send(imagemessage);
        server.send(message1,123, 122);
    }
}
