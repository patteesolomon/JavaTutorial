package javatutoral;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;

    public MainFrame() {
        super("Samson Jawbone");

        setLayout(new BorderLayout());

        btn = new JButton("Click Me!");
        textPanel = new TextPanel();

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textPanel.appendText("Hi Sol!\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
