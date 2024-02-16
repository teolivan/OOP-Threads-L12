package L12.server;

//TODO
// TimeServer ska ärva Thread och överskugga run()-metoden
// En instans av servern skapas och startas (se main-metod)
// I run-metoden öppnar servern en socket (port 13) och väntar på en klient ( socket.accept() )
// Vid uppkoppling av den klient skapar servern en OutputStream och skickar datumet ( new Date().toString() )
// Sedan väntar servern på den nästa klienten ( socket.accept() )

public class TimeServer extends Thread {
    public void run() {

    }

    public static void main(String[] args) {
        new TimeServer().start();
    }
}
