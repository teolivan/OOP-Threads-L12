package L12.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {
	public void printTime() {
		new ReadTime().start();
	}

	private class ReadTime extends Thread {
		public void run() {
			//TODO: Det kan behövas att ändra ip-adressen!
			try( Socket socket = new Socket("localhost", 13);
					InputStreamReader isr = new InputStreamReader(socket.getInputStream(),"UTF-8");
					BufferedReader br = new BufferedReader(isr)
			   ) {
				System.out.println(socket);
				socket.setSoTimeout(10000); 

				String time = br.readLine();
				while(time!=null) {
					System.out.println( time );
					time = br.readLine();
				}

			} catch(IOException e) {
				System.err.println(e);
			}
			System.out.println("That's all!");
		}
	}

	public static void main(String[] args) {
		TimeClient ex = new TimeClient();
		ex.printTime();
	}
}
