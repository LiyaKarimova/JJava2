package Lesson6Chat;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    private DataOutputStream out;
    private Socket socket;
    private DataInputStream in;

public ChatServer () {
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                sendMessage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });
    thread1.start();
    serverOpenConnection();
}

public void serverOpenConnection () {
    Socket socket;
    try (ServerSocket serverSocket = new ServerSocket(8189)) {
        System.out.println("Сервер запущен, ожидаем подключения...");
        socket = serverSocket.accept();
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        System.out.println("Клиент подключился");
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        while (true) {
            String str = in.readUTF();
            System.out.println(str);
            if (str.equals("end")) {
                break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    closeConnection();
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

    public void sendMessage () throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String messageFromServer = sc.nextLine();
            System.out.println(messageFromServer);
            //System.out.println(messageFromClient);
            out.writeUTF(messageFromServer);
        }
    }

}


