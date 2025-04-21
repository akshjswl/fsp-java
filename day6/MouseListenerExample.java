import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample() {
        super("Mouse Listener Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Blank", JLabel.LEFT);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);

        addMouseListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
