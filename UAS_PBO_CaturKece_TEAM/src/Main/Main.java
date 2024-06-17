package Main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());
        frame.setMinimumSize(new Dimension(690, 1000));
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        TimerPanel timerPanel = new TimerPanel();
        // Create player profile panels
        ImageIcon whitePlayerAvatar = new ImageIcon("path/to/white_player_avatar.png"); // Replace with actual path or default image
        ImageIcon blackPlayerAvatar = new ImageIcon("path/to/black_player_avatar.png"); // Replace with actual path or default image

        PlayerProfilePanel whitePlayerProfile = new PlayerProfilePanel("Player 1 (White)", whitePlayerAvatar);
        PlayerProfilePanel blackPlayerProfile = new PlayerProfilePanel("Player 2 (Black)", blackPlayerAvatar);

        // Create a panel to hold the board and center it
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(Color.BLACK); // to match the background of the frame
        centerPanel.add(board, new GridBagConstraints());

        // Add the timerPanel to the NORTH, board to the CENTER, and profile panels to EAST and WEST
        frame.add(timerPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(whitePlayerProfile, BorderLayout.WEST);
        frame.add(blackPlayerProfile, BorderLayout.EAST);


        // Set the TimerPanel in the NORTH and Board in the CENTER
        frame.add(timerPanel, BorderLayout.NORTH);
        frame.add(board, BorderLayout.CENTER);

        // Link the timerPanel to the board so it can update the timers
        board.setTimerPanel(timerPanel);

        frame.setVisible(true);
    }
}
