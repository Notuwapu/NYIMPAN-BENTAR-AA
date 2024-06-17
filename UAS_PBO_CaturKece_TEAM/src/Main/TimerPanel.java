package Main;

import javax.swing.*;
import java.awt.*;

public class TimerPanel extends JPanel {

    private JLabel whiteTimerLabel;
    private JLabel blackTimerLabel;

    public TimerPanel() {
        setLayout(new GridLayout(2, 1));

        whiteTimerLabel = new JLabel("White: 10:00", SwingConstants.CENTER);
        whiteTimerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        whiteTimerLabel.setOpaque(true);
        whiteTimerLabel.setBackground(Color.WHITE);

        blackTimerLabel = new JLabel("Black: 10:00", SwingConstants.CENTER);
        blackTimerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        blackTimerLabel.setOpaque(true);
        blackTimerLabel.setBackground(Color.BLACK);
        blackTimerLabel.setForeground(Color.WHITE);

        add(whiteTimerLabel);
        add(blackTimerLabel);
    }

    public void updateWhiteTimer(String time) {
        whiteTimerLabel.setText("White: " + time);
    }

    public void updateBlackTimer(String time) {
        blackTimerLabel.setText("Black: " + time);
    }
}
