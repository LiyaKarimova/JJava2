package Lesson6Chat;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8189;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    //конструктор
    public ChatClient() throws IOException {
        openConnection();
    }

    public void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        //String strFromServer = null;
                        String strFromServer = in.readUTF();
                        System.out.println(strFromServer);
                        if (strFromServer.equalsIgnoreCase("/end")) {
                            closeConnection();
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Окончание работы");
                    e.printStackTrace();
                }
            }

        }

        );
        thread.start();
        sendMessage();
    }

    public void sendMessage() throws IOException {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String messageFromClient = sc.nextLine();
            //System.out.println(messageFromClient);
            out.writeUTF(messageFromClient);
        }
    }

    public void closeConnection () {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
