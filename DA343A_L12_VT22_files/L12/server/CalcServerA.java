package L12.server;

import java.net.ServerSocket;

public class CalcServerA implements Runnable {
    private Calculator calculator;
    private ServerSocket serverSocket;

    public CalcServerA(Calculator calculator, int port) {
        try {
            this.calculator = calculator;

            //TODO
            // Skapa en ServerSocket som lyssnar på port
            // Starta tråden i det skapade CalcServerA-objektet
            // (Eftersom klassen implementerar Runnable måste först ett Thread-objekt skapas med CalcServerA-objektet som parameter [this])

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println("Server A startad");

        //TODO
        // Servern ska, i en ändlös-slinga, vänta på uppkopplingar (socket.accept())
        // Vid uppkoppling skapas både DataInputStream och DataOutputStream som kopplas till
        //   server-sockets respektive InputStream och OutputStream.
        // Servern läser räkneuppgiften (readUTF()) och delar upp den (split(",")).
        // Resultatet beräknas med hjälp av calculator.calculate(number, number, operation) och skickas tillbaka med writeUTF()
        // Meddelandet ska ha det här formatet ”1+1=2” och du kan använda metoden answerFormat() för att formatera svaret.

        while (true) {

        }

    }
    
    private String answerFormat(double nbr1, double nbr2, char operation, double result){
        return nbr1 + operation + nbr2 + "=" + result;
    }

    public static void main(String[] args) {
        new CalcServerA(new Calculator(), 721);
    }
}