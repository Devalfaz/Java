import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class smiley extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(60, 60, 200, 200);
        g.fillOval(90, 120, 50, 20);
        g.fillOval(190, 120, 50, 20);
        g.drawLine(165, 125, 165, 175);
        g.drawArc(110, 130, 95, 95, 0, -180);
    }

    public static void main(String[] args) {
        smiley smily = new smiley();
        JFrame app = new JFrame();
        app.add(smily);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}