package L12.server;

import java.io.IOException;
import java.net.Socket;

public class CalcServerD {
    private Calculator calculator;

    public CalcServerD(Calculator calculator, int port) {
        this.calculator = calculator;

        //TODO: samma som CalcServerB
    }

    private class Connection extends Thread {
        private int port;

        public Connection(int port) {
            this.port = port;
        }

        public void run() {
            //TODO: samma som CalcServerB men uppgiften kan även lösas som iterativ server
        }
    }

    private class ClientHandler extends Thread {
        public ClientHandler(Socket socket) throws IOException {
            //TODO: samma som CalcServerB
        }

        public void run() {
            //TODO
            // Samma som CalcServerB men inläsning av tal och räknesätt ska ske med readObject()
            // Ett objekt av typen Expression innehåller instansvariabler för två double och en char.
        }
    }

    public static void main(String[] args) {
        new CalcServerD(new Calculator(), 724);
    }
}
