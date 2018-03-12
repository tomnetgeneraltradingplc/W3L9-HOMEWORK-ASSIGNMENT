
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class NumberToString extends JFrame {

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
		JLabel l1 = new JLabel("Input Number");
		l1.setBounds(230, 30, 100, 25);
		JLabel l2 = new JLabel("Output Text");
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
				String out = "";

				for (int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
					switch (c) {
					case '1': {
						out = out + "one ";
						break;
					}
					case '2': {
						out = out + "two ";
						break;
					}
					case '3': {
						out = out + "three ";
						break;
					}
					case '4': {
						out = out + "four ";
						break;
					}
					case '5': {
						out = out + "five ";
						break;
					}
					case '6': {
						out = out + "six ";
						break;
					}
					case '7': {
						out = out + "seven ";
						break;
					}
					case '8': {
						out = out + "eight ";
						break;
					}
					case '9': {
						out = out + "nine ";
						break;
					}
					default: {
						out = out + "zero ";
						break;
					}

					}

				}
				t2.setText(out);
			}
		});

	}
}
