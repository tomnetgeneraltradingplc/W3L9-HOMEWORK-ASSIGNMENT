import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class IntToFloat extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("String Utility");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		// Create button and add to frame
		JButton b1 = new JButton("Convert");
		b1.setBounds(30, 50, 150, 40);
		b1.setBackground(Color.MAGENTA);

		frame.add(b1);

		// Create label and add to frame
		JLabel l1 = new JLabel("Input Int");
		l1.setBounds(230, 30, 100, 25);
		JLabel l2 = new JLabel("Output Float");
		l2.setBounds(230, 70, 100, 25);
		frame.add(l1);
		frame.add(l2);

		// Create text area and add to the frame
		JTextArea t1 = new JTextArea();
		t1.setBounds(230, 50, 250, 20);
		JTextArea t2 = new JTextArea();
		t2.setBounds(230, 90, 250, 20);
		frame.add(t1);
		frame.add(t2);

		frame.setBounds(100, 100, 500, 200);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.CYAN);{

}
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
String input= t1.getText();
int i = Integer.parseInt(input);
float f = Float.parseFloat(input);
double d = Double.parseDouble(input);
String s = String.valueOf(d);
//String s =  String.format( "%d",f);
t2.setText(s);
			}
			
		});
}
	
}