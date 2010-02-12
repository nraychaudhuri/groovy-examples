import javax.swing.*;

public class HelloJavaSwing {
  public static void main(String[] args) {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hello Java Swing");

    JFrame frame = new JFrame("Hello Java Swing");
    panel.add(label);
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,300);
    frame.setVisible(true);
  }
}
