package L12.server;

import java.io.*;
import java.net.Socket;

public class CalcServerB {
    private Calculator calculator;

    public CalcServerB(Calculator calculator, int port) {
        this.calculator = calculator;

        //TODO
        // Skapa ett Connection-objekt som lyssnar på port
        // Starta tråden i det skapade Connection-objektet
    }

    private class Connection extends Thread {
        private int port;

        public Connection(int port) {
            this.port = port;
        }

        //TODO
        // Connection ärver Thread och implementerar en run()-metod som skapar en ServerSocket som lyssnar på port
        // Vid en inkommande uppkoppling (socket.accept()) skapas ett nytt objekt av typ ClientHandler med port som anropsparameter.
        // Sedan lyssnar run()-metoden på nya uppkopplingar.
        public void run() {
        }
    }

    private class ClientHandler extends Thread {
        public ClientHandler(Socket socket) throws IOException {
            //TODO
            // Konstruktorn av ClientHandler har ServerSocket som parameter.
            // Konstruktorn skapar både DataInputStream och DataOutputStream som kopplas till
            //   server-sockets respektive InputStream och OutputStream.
            // Efter att ha skapat DataInputStream och DataOutputStream startar konstruktorn tråden.
        }

        public void run() {
            //TODO
            // ClientHandler läser räkneuppgiften (readUTF()) och delar upp den (split(",")).
            // Resultatet beräknas med hjälp av calculator.calculate(number, number, operation) och skickas tillbaka med writeUTF()
            // Meddelandet ska ha det här formatet: ”1+1=2” och du kan använda metoden answerFormat() för att formatera svaret.
        }

        private String answerFormat(double nbr1, double nbr2, char operation, double result){
            return nbr1 + operation + nbr2 + "=" + result;
        }
    }

    public static void main(String[] args) {
        new CalcServerB(new Calculator(), 722);
    }
}