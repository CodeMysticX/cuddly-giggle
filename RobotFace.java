import javax.swing.*;
import java.awt.*;

public class RobotFace extends JFrame {

    public RobotFace() {
        setTitle("Robot Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(true);
        setLocationRelativeTo(null);

        FacePanel facePanel = new FacePanel();
        add(facePanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        RobotFace f = new RobotFace();
    }
}

class FacePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        setBackground(Color.WHITE);

        // Set face color
        g.setColor(Color.LIGHT_GRAY);

        // Draw the face
        g.fillOval(100, 100, 200, 200);

        // Set eye color
        g.setColor(Color.BLUE);

        // Draw the eyes
        g.fillOval(150, 160, 40, 40);
        g.fillOval(210, 160, 40, 40);

        // Set mouth color
        g.setColor(Color.RED);

        // Draw the mouth
        g.fillArc(150, 220, 100, 60, 0, -180);
    }
}