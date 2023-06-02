import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {

    private static int clickCount = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");

        JButton button = new JButton("Click me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                System.out.println("Button clicked " + clickCount + " times");
            }
        });

        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
