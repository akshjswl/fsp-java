import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationDemo extends JFrame {
    private DrawPanel drawPanel;
    private JLabel statusLabel;

    public AnimationDemo() {
        setTitle("Enhanced Animation with Key Bindings");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        statusLabel = new JLabel("Use arrow keys to move. Press R to reset. C to change color.", JLabel.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setupKeyBindings();

        setVisible(true);
    }

    private void setupKeyBindings() {
        InputMap im = drawPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = drawPanel.getActionMap();

        im.put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");
        im.put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        im.put(KeyStroke.getKeyStroke("UP"), "moveUp");
        im.put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
        im.put(KeyStroke.getKeyStroke("R"), "reset");
        im.put(KeyStroke.getKeyStroke("C"), "changeColor");

        am.put("moveRight", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.move(20, 0);
            }
        });
        am.put("moveLeft", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.move(-20, 0);
            }
        });
        am.put("moveUp", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.move(0, -20);
            }
        });
        am.put("moveDown", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.move(0, 20);
            }
        });
        am.put("reset", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.reset();
            }
        });
        am.put("changeColor", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.changeColor();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimationDemo::new);
    }

    // --- Custom drawing panel ---
    static class DrawPanel extends JPanel {
        private int x = 50, y = 100;
        private final int size = 100;
        private Color color = Color.RED;

        public DrawPanel() {
            setBackground(Color.WHITE);
        }

        public void move(int dx, int dy) {
            x = Math.max(0, Math.min(getWidth() - size, x + dx));
            y = Math.max(0, Math.min(getHeight() - size, y + dy));
            repaint();
        }

        public void reset() {
            x = 50;
            y = 100;
            repaint();
        }

        public void changeColor() {
            color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(color);
            g.fillOval(x, y, size, size);

            g.setColor(Color.BLACK);
            g.drawString("Position: (" + x + ", " + y + ")", 10, 15);
        }
    }
}
