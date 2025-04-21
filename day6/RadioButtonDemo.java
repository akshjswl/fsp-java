import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JRadioButton rb1 = new JRadioButton("c");
        JRadioButton rb2 = new JRadioButton("c++");
        JRadioButton rb3 = new JRadioButton("java");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);

        frame.setVisible(true);
    }
}
