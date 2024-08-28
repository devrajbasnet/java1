import java.io.*;
import java.net.*;

public class SimpleInterestClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost, port 12345
            Socket clientSocket = new Socket("localhost", 12345);

            // Create input and output streams for communication
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            // Input principle, time, and interest rate from the user
            double principle = 1000; // Replace with your desired value
            double time = 2;        // Replace with your desired value
            double interestRate = 5; // Replace with your desired value

            // Send principle, time, and interest rate to the server
            outToServer.writeBytes(principle + "\n");
            outToServer.writeBytes(time + "\n");
            outToServer.writeBytes(interestRate + "\n");

            // Receive and display the computed simple interest from the server
            String response = inFromServer.readLine();
            System.out.println(response);

            // Close the socket
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
