package Problem_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RainbowColors{

	public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setTitle("Rainbow Color Frame");
frame.setBounds(20, 60, 1210, 250);
frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//Create Button1 and add to the frame
JButton b1 = new JButton();
b1.setPreferredSize(new Dimension(165, 202));
b1.setBackground(Color.RED);
frame.add(b1);
//Create Button2 and add to the frame
JButton b2 = new JButton();
b2.setPreferredSize(new Dimension(165, 202));
b2.setBackground(Color.ORANGE);
frame.add(b2);
//Create Button3 and add to the frame
JButton b3 = new JButton();
b3.setPreferredSize(new Dimension(165, 202));
b3.setBackground(Color.GREEN);
frame.add(b3);
//Create Button4 and add to the frame
JButton b4 = new JButton();
b4.setPreferredSize(new Dimension(165, 202));
b4.setBackground(Color.BLUE);
frame.add(b4);
//Create Button5 and add to the frame
JButton b5 = new JButton();
b5.setPreferredSize(new Dimension(165, 202));
b5.setBackground(Color.YELLOW);
frame.add(b5);
//Create Button6 and add to the frame
JButton b6 = new JButton();
b6.setPreferredSize(new Dimension(165, 202));
b6.setBackground(new Color(75, 0, 130));
frame.add(b6);
//Create Button7 and add to the frame
JButton b7 = new JButton();
b7.setPreferredSize(new Dimension(165, 202));
b7.setBackground(new Color(138, 43, 226));
frame.add(b7);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// Anonymous class for button 1,
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "RED is the color of fire and blood, so it is associated with energy, war, danger, strength, power, determination as well as passion, desire, and love.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
	
		}
	});
	// Anonymous class for button 2,
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "ORANGE is associated with meanings of joy, warmth, heat, sunshine, creativity, success, encouragement, change, determination, health, stimulation, happiness, fun, enjoyment, balance, freedom, expression, and fascination.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		
			}
		});
		// Anonymous class for button 3,
				b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "GREEN is the color of life, renewal, nature, and energy, is associated with meanings of growth, harmony, freshness, safety, fertility, environment, money, finances, banking, ambition, greed, jealousy, and wall street.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
					}
				});
				// Anonymous class for button 4,
				b4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "BLUE is the color of the sky and sea. It is often associated with depth and stability. It symbolizes trust, loyalty, wisdom, confidence, intelligence, faith, truth, and heaven.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
					}
				});
				// Anonymous class for button 5,
				b5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "YELLOW stands for freshness, happiness, positivity, clarity, energy, optimism, enlightenment, remembrance, intellect, honor, loyalty, and joy, but on the other, it represents cowardice and deceit.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
					}
				});
				// Anonymous class for button 6,
				b6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "INDIGO is the color of the deep midnight sky. It can have a negative effect when used during a depressed state, because it will deepen the mood. It symbolizes a mystical borderland of wisdom, self-mastery and spiritual realization.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
					}
				});
				// Anonymous class for button 7,
				b7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "PURPLE is associated with royalty, nobility, luxury, power, and ambition. Purple also represents meanings of wealth, extravagance, creativity, wisdom, dignity, grandeur, devotion, peace, pride, mystery, independence, and magic.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
					}
				});
	}

}
