package org;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class ChatClient extends JFrame{
	 private JTextArea chatArea;
	    private JTextField messageField;
	    private JButton sendButton, connectButton;
	    private JTextField ipField, portField;

	    private Socket socket;
	    private PrintWriter out;
	    private BufferedReader in;
	    
	    public ChatClient() {
	    	setTitle("Chat Client");
	    	setSize(500, 400);
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	setLocationRelativeTo(null);
	    	
	    	chatArea = new JTextArea();
	    	chatArea.setEditable(false);
	    	JScrollPane scrollPane = new JScrollPane(chatArea);
	    	
	    	messageField = new JTextField();
	        messageField.setEnabled(false);

	        ipField = new JTextField("localhost", 10);
	        portField = new JTextField("12345", 5);
	        connectButton = new JButton("Kết nối");
	        sendButton = new JButton("Gửi");
	        sendButton.setEnabled(false);

	        JPanel topPanel = new JPanel();
	        topPanel.add(new JLabel("IP:"));
	        topPanel.add(ipField);
	        topPanel.add(new JLabel("Port:"));
	        topPanel.add(portField);
	        topPanel.add(connectButton);

	        JPanel bottomPanel = new JPanel(new BorderLayout());
	        bottomPanel.add(messageField, BorderLayout.CENTER);
	        bottomPanel.add(sendButton, BorderLayout.EAST);

	        add(topPanel, BorderLayout.NORTH);
	        add(scrollPane, BorderLayout.CENTER);
	        add(bottomPanel, BorderLayout.SOUTH);

	        connectButton.addActionListener(e -> connectToServer());
	        sendButton.addActionListener(e -> sendMessage());
	        messageField.addActionListener(e -> sendMessage()); // Enter để gửi

	    	setVisible(true);
	    }
	    private void connectToServer() {
	        try {
	            socket = new Socket(ipField.getText(), Integer.parseInt(portField.getText()));
	            out = new PrintWriter(socket.getOutputStream(), true);
	            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	            chatArea.append("Đã kết nối tới server.\n");
	            messageField.setEnabled(true);
	            sendButton.setEnabled(true);
	            connectButton.setEnabled(false);

	            new Thread(this::receiveMessages).start();
	        } catch (IOException e) {
	            chatArea.append("Kết nối thất bại.\n");
	            e.printStackTrace();
	        }
	    }
	    private void sendMessage() {
	        String message = messageField.getText();
	        if (!message.isEmpty()) {
	            out.println(message);
	            messageField.setText("");
	        }
	    }

	    private void receiveMessages() {
	        String message;
	        try {
	            while ((message = in.readLine()) != null) {
	                chatArea.append(message + "\n");
	            }
	        } catch (IOException e) {
	            chatArea.append("Mất kết nối tới server.\n");
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(ChatClient::new);
	    }
	}
