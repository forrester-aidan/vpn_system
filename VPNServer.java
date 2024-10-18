import java.net.*;
import java.io.*;

public class VPNServer {
    public static void main(String args[]) throws IOException {
        System.out.println("\nWaiting for client to connect...");

        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("\nClient connected.\n");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Client: " + str);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Yes!");
        pr.flush();
    }
}