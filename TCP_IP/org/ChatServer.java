package org;
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	private static final int PORT=12345;
	private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());
	
	public static void main(String[] args) {
		try(ServerSocket serverSocket = new ServerSocket(PORT)){
			System.out.println("Server đang chạy trên port "+PORT);
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("Client mới kết nối: "+socket.getInetAddress());
				ClientHandler clientHandler = new ClientHandler(socket);
				clients.add(clientHandler);
				new Thread(clientHandler).start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void broadcast(String message, ClientHandler excludeClient) {
		synchronized (clients) {
			for(ClientHandler client: clients) {
				if(client != excludeClient) {
					client.sendMessage(message);
				}
			}
		}
	}
	static void removeClient(ClientHandler clientHandler) {
		clients.remove(clientHandler);
	}
}

class ClientHandler implements Runnable{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ClientHandler(Socket socket) {
		try {
			this.socket = socket;
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		}catch(IOException e) {
			closeEverything();
		}
	}
	
	@Override
	public void run() {
		String message;
		try {
			while((message = in.readLine()) != null) {
				System.out.println("Nhận được: "+ message);
				ChatServer.broadcast(message, this);
			}
		} catch(IOException e) {
			System.out.println("Client: "+ socket.getRemoteSocketAddress() + " ngắt kết nối");
		} finally {
			closeEverything();
		}
		
	}
	
	public void sendMessage(String message) {
		out.println(message);
	}
	
	private void closeEverything() {
		ChatServer.removeClient(this);
		try {
			if(socket != null) socket.close();
			if(in != null) in.close();
			if(out != null) out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
