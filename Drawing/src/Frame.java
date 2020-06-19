import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	Frame() {
		setTitle("Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingPlace panel = new DrawingPlace();
		this.add(panel);

		this.pack();
	}

	public static void main(String[] args) {
		Frame program = new Frame();
		program.setVisible(true);
	}
}
