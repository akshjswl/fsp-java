import javax.swing.*;
import java.awt.*;

public class CheckboxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JCheckBox cb = new JCheckBox("C");
        JCheckBox cb2 = new JCheckBox("C++");
        JCheckBox cb3 = new JCheckBox("Java");

        frame.add(cb);
        frame.add(cb2);
        frame.add(cb3);

        frame.setVisible(true);
    }
}
