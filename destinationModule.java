import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.util.*;

public class destinationModule extends javax.swing.JFrame implements Runnable {
	
	Socket soc, soc1;
	String str, filestring;
	String [] split;
	String sip, eip1, eip2, eip3, eip4;
	Vector vector;
	String[] store;
	
	/** Creates new form destination */
	
	public destinationModule() {
		initComponents();
		setBounds(150,150,710,570);
		vector = new Vector();
		new Thread(this).start();
	}
	
	public void run() {
		try
		{
			ServerSocket ss = new ServerSocket(2345);
			ServerSocket ss1 = new ServerSocket(5432);
			while(true){
				soc = ss.accept();
				soc1 = ss1.accept();
				System.out.println("1");
				Scanner s = new Scanner(soc.getInputStream());
				str = s.nextLine();
				System.out.println("The collected IP values are: " +str);
				InputStream in = soc1.getInputStream();
				byte filecontent[] = new byte[60000];
				in.read(filecontent, 0, filecontent.length);
				System.out.println("file= " +filecontent);
				filestring = string.trim();
				System.out.println("String= " +string);
				System.out.println("The string value is: " +filestring);
				System.out.println("The IP values are: " +str);
				jTextArea1.append("The IP Address: " +str+ "\n" +"The file content is "+filestring+"\n");
				/*
				 * ServerSocket ss = new ServerSocket(2345);
				 * soc = ss.accept();
				 * Scanner s = new Scanner(soc.getInputStream());
				 * str = s.nextLine();
				 * System.out.println("The collected IP values are: " +str);
				 * InputStream in = soc1.getInputStream();
				 * byte filecontent[] = new byte[60000];
				 * in.read(filecontent, 0, filecontent.length);
				 * System.out.println("file= " +filecontent);
				 * String string = new String(filecontent);
				 * filestring = string.trim();
				 * System.out.println("The string value is: " +filestring);
				 * System.out.println("String is: " +string);
				 * System.out.println("The IP value is: " +str);
				 * jTextArea1.append("The IP Address: " +str+ "\n" +"The file content is "+filestring+"\n");
				 */
			}
		
		}
		catch(Exception e)
		{
			System.out.println("The receiving exception: " +e.toString());
		}
		
		//GEN-BEGIN: initComponents
		private void initComponents() {
					
				jPanel1 = new javax.swing.JPanel();
				jLabel1 = new javax.swing.JLabel();
				
				jScrollPane1 = new javax.swing.jScrollPane();
				jTextArea1 = new javax.swing.jTextArea();
				jButton2 = new javax.swing.JButton();
					
				setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
				setResizeable(false);
					
				jPanel1.setBackground(new java.awt.Color(0, 0, 0));
				jPanel1.setLayout(null);
				
				jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); //NOI18N
				jLabel1.setForeground(new java.awt.Color(208, 181, 130));
				jLabel1.setText("Destination Page");
				jPanel1.add(jLabel1);
				jLabel1.setBounds(150, 20, 220, 30);
				
				jTextArea1.setColumns(20);
				jTextArea1.setRows(5);
				
				jScrollPane1.setViewportView(jTextArea1)
				jPanel1.add(jScrollPane1);
				jScrollPane1.setBounds(30, 80, 450, 290);
				
				jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24));
				jButton2.setText("Close");
				jButton2.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
				jPanel1.add(jButton2);
				jButton2.setBounds(170, 390, 150, 40);
				getContentPane().add(jPanel1);
				pack();
		}//</editor-fold>//GEN-END:initComponents
		
		private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
			//GEN-FIRST:event_jButton2ActionPerformed
			//TODO: Add handling code here
			System.exit(0);
		}//GEN-LAST:event_jButton2ActionPerformed
		
		/**
		 * @param args the command line arguments
		 */
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.eventQueue.invokeLater(new Runnable() {
			public void run() {
				new destinationModule().setVisible(true);
			}
		});
	}
	
	//Variables declaration - do not modify // GEN-BEGIN: Variables
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of Variables declaration //GEN-END: Variables
}
