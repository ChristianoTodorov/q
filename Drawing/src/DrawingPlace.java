import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class DrawingPlace extends JPanel {

	DrawingPlace() {
		this.setPreferredSize(new Dimension(400, 300));
		this.setFont(new Font("Courier", Font.BOLD, 20));
		this.setBackground(Color.ORANGE);
		this.setForeground(Color.BLACK);
	}

	public void paint(Graphics g) {
		super.paintComponent(g);

		//
		g.setColor(Color.cyan);
		g.drawString("Hello", 50, 80);
		g.setColor(Color.cyan);
		g.drawString("String Example", 199, 55);

		/*
		 * g.drawLine(30, 30, 200, 90); g.drawLine(50, 110, 90, 30);
		 * g.setColor(Color.MAGENTA); g.drawLine(10, 250, 360, 40);
		 */
		// Kreslení a vyplòování tvarù
		g.setColor(Color.RED);
		g.drawRect(280, 25, 55, 35);
		g.setColor(getForeground());
		g.fillOval(320, 260, 70, 130);
		g.drawOval(320, 260, 70, 130);

		g.setColor(getForeground());
		g.fillOval(250, 260, 70, 130);
		g.drawOval(250, 260, 70, 130);

		g.setColor(getForeground());
		/*
		g.fillOval(290, 320, 40, 200);
		g.drawOval(290, 320, 40, 200);
*/
		g.fillOval(285, 360, 60, 120);
		g.drawOval(285, 360, 60, 120);
		
		g.setColor(Color.PINK);
		g.fillOval(295, 440, 35, 35);
		g.drawOval(295, 440, 35, 35);
		
	}
}
