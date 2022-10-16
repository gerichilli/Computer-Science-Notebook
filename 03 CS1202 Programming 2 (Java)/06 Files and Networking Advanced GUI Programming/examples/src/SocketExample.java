import java.io.IOException;
import java.net.ServerSocket;

public class SocketExample {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
