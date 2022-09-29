import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PizzaFrame extends JFrame{
    JFrame frame = new JFrame();
    JPanel mainPnl;
    JPanel topPnl;
    JPanel midPnl;
    JPanel botPnl;

    JLabel titleLbl;

    JButton quitButton;

    public PizzaFrame()
    {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
        createTopPanel();
        mainPnl.add(topPnl, BorderLayout.NORTH);
        createMiddlePanel();
        mainPnl.add(midPnl, BorderLayout.CENTER);
        createBottomPanel();
        mainPnl.add(botPnl, BorderLayout.SOUTH);

        add(mainPnl);

        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTopPanel()
    {
        topPnl = new JPanel();
        titleLbl = new JLabel("Pizza Order Form",JLabel.CENTER);
        titleLbl.setFont(new Font("SansSerif", Font.BOLD, 28));

        topPnl.add(titleLbl);
    }

    private void createMiddlePanel()
    {
        midPnl = new JPanel();

        
    }

    private void createBottomPanel()
    {
        botPnl = new JPanel();
        botPnl.setLayout(new GridLayout(1,2));
        quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent ae) -> System.exit(0));
        botPnl.add(quitButton);
    }
}
