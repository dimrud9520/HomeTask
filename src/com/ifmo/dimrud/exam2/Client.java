package com.ifmo.dimrud.exam2;

import java.io.*;
import java.net.Socket;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class Client {
    private final String nickName;
    private static String host = "127.0.0.1";
    private static int port = 5000;
    private static String exit = "stop";
    private Connection connection;

    public Client(String nickName) {
        this.nickName = nickName;

        try {
            connection = new Connection(new Socket(host, port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void startClient() {
        Thread writerThread, readerThread;
        try {
            writerThread = new Thread(new Writer());
            writerThread.start();

            readerThread = new Thread(new Reader());
            readerThread.start();

            System.out.println("Client " + nickName + " started...");
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class Reader implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    Message message = (Message) connection.getInput().readObject();
                    System.out.println(message.getSender() + " ("
                            + message.getDateTime().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss")) + "): "
                            + message.getText());
                }
            } catch (IOException | ClassNotFoundException ioException) {
                System.out.println("Connection is broken.");
            }
        }
    }

    private class Writer implements Runnable {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                while (true) {
                    String inputLine = reader.readLine();
                    connection.getOutput().writeObject(new Message(Client.this.nickName, inputLine));
                    connection.getOutput().flush();

                    if (inputLine.equalsIgnoreCase(exit)) {
                        connection.close();
                        reader.close();
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
