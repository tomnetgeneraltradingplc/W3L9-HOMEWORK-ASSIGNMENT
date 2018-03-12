package Problem_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class StringUtility extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("String Utility");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		// Create button and add to frame
		JButton b1 = new JButton("Count Letters");
		b1.setBounds(30, 25, 150, 25);
		b1.setBackground(Color.MAGENTA);
		JButton b2 = new JButton("Reverse Letters");
		b2.setBounds(30, 65, 150, 25);
		b2.setBackground(Color.MAGENTA);
		JButton b3 = new JButton("Remove Duplicates");
		b3.setBounds(30, 105, 150, 25);
		b3.setBackground(Color.MAGENTA);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);

		// Create label and add to frame
		JLabel l1 = new JLabel("Input");
		l1.setBounds(230, 30, 100, 25);
		JLabel l2 = new JLabel("Output");
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
		frame.getContentPane().setBackground(Color.CYAN);
		
		

		// Anonymous class for button 1, Count letters
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = t1.getText();

				int count = input.length();

				t2.setText(Integer.toString(count));
			}
		});

		// Anonymous class for button 2, Reverse String
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = t1.getText();
				String a = " ";
				for (int i = input.length() - 1; i >= 0; i--) {
					a = a + input.charAt(i);

				}

				t2.setText(a);

			}
		});
		// Anonymous class for button 3, Remove duplicate
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = t1.getText();
				String str = "";
				;

				for (int i = 0; i < input.length(); i++) {
					if (!(str.contains("" + input.charAt(i)))) {
						str = str + input.charAt(i);
					}
				}
				t2.setText(str);
			}

		});

	}
}
