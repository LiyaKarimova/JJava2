package Lesson6Chat;

import java.io.IOException;

public class ClientStarter {
    public static void main(String[] args) {
        try {
            ChatClient client = new ChatClient();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
