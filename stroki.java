import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stroki extends JFrame {

    private String[] strings = {"Hello", "Papa", "Mama", "52", "POKA"};
    private JLabel[] labels;
    private int yPos;

    public stroki() {
        func();
    }

    private void func() {
        setTitle("Moving Strings App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        createLabels();
        add(createPanel());

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveStrings();
            }
        });
        timer.start();
    }

    private void createLabels() {
        labels = new JLabel[strings.length];
        for (int i = 0; i < strings.length; i++) {
            labels[i] = new JLabel(strings[i]);
            labels[i].setSize(80, 20);
        }
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < labels.length; i++) {
            panel.add(labels[i]);
        }

        return panel;
    }

    private void moveStrings() {
        yPos += 5; // Регулируйте скорость при необходимости

        for (int i = 0; i < labels.length; i++) {
            labels[i].setLocation(50, yPos + (i * 30)); // Изменяем вертикальную позицию каждой метки
        }

        if (yPos > getHeight()) {
            yPos = -labels[0].getHeight(); // Начните снова сверху
        }

        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                stroki app = new stroki();
                app.setVisible(true);
            }
        });
    }
}



