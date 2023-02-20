import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class stopwatch implements ActionListener{
	JButton button, button2, button3;
	JLabel field;
	int sec = 1;
	
	Timer timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			field.setText("      " + sec);
			sec += 1;
		}
	});
	
	stopwatch() {
		JFrame frame = new JFrame("StopWatch");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(50, 50, 500, 400);
		
		
		button = new JButton("START");
		button.setBounds(100, 150, 100, 100);
		button.addActionListener(this);
		button.setFont(new Font("Serif", Font.BOLD, 20));
		button.setOpaque(true);
		button.setFocusable(false);
		button.setBackground(Color.black);
		button.setForeground(Color.green);
		
		button2 = new JButton("STOP");
		button2.setBounds(400, 150, 100, 100);
		button2.addActionListener(this);
		button2.setFont(new Font("Serif", Font.BOLD, 20));
		button2.setOpaque(true);
		button2.setFocusable(false);
		button2.setBackground(Color.black);
		button2.setForeground(Color.green);
		
		button3 = new JButton("RESET");
		button3.setBounds(250, 300, 100, 100);
		button3.addActionListener(this);
		button3.setFont(new Font("Serif", Font.BOLD, 20));
		button3.setOpaque(true);
		button3.setFocusable(false);
		button3.setBackground(Color.black);
		button3.setForeground(Color.green);
		
		JLabel label = new JLabel("SECONDS COUNTER");
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBounds(180, 70, 450, 50);
		label.setForeground(Color.green);
		
		field = new JLabel("      0");
		field.setOpaque(true);
		field.setFont(new Font("Serif", Font.BOLD, 26));
		field.setBounds(250, 150, 100, 100);
		field.setBackground(Color.black);
		field.setForeground(Color.green);
		
		
		frame.add(field);
		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(label);
		frame.add(panel);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		frame.setSize(620, 540);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			timer.start();
		} else if(e.getSource()==button2) {
			timer.stop();
		} else if(e.getSource()==button3) {
			timer.stop();
			sec = 1;
			field.setText("      0");
		}
	}
}

public class STOPWATCH {
	public static void main(String[] args) {
		new stopwatch();
	}
}
