import com.sun.deploy.uitoolkit.impl.awt.ui.SwingConsoleWindow;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Test{
    public static void main(String[] args) throws InterruptedException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setName("frame");
                frame.add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500,200);
                frame.setVisible(true);
                label.setText("456");
            }
        });
        TimeUnit.SECONDS.sleep(5);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("123");
            }
        });
    }

}
