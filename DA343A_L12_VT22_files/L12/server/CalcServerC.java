package L12.server;

import java.io.*;
import java.net.Socket;

public class CalcServerC {
    private Calculator calculator;

    public CalcServerC(Calculator calculator, int port) {
        this.calculator = calculator;

        //TODO: samma som CalcServerB
    }

    private class Connection extends Thread {
        private int port;

        public Connection(int port) {
            this.port = port;
        }

        //TODO: samma som CalcServerB
        public void run() {
        }
    }

    private class ClientHandler extends Thread {
        public ClientHandler(Socket socket) throws IOException {
            //TODO: samma som CalcServerB
        }

        public void run() {
            //TODO: samma som CalcServerB men inläsning av tal och räknesätt ska ske med readDouble() och readChar()
        }
    }

    public static void main(String[] args) {
        new CalcServerC(new Calculator(), 723);
    }
}