package com.github.soulrepear14;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PigLatinTranslator {
  private static void init() {
    // Step 1. create GUI components: labels, text fields and button
    JLabel englishLabel = new JLabel("English");
    JLabel pigLatinLabel = new JLabel("Pig Latin");
    JTextField englishText = new JTextField(10);
    JTextField pigLatinText = new JTextField(10);
    JButton calculateButton = new JButton("Translate");
    calculateButton.addActionListener(e -> {
      System.out.println("translation button is clicked");
      String english = englishText.getText();
      System.out.println("english: " + english);

      // Step a. convert "english" to "pig latin" translation
      // Step b. set the pigLatinText to the pig latin translation
    });

    // Step 2. add GUI components to a single panel
    JPanel centerPanel = new JPanel(new FlowLayout());
    centerPanel.add(englishLabel);
    centerPanel.add(englishText);
    centerPanel.add(pigLatinLabel);
    centerPanel.add(pigLatinText);
    centerPanel.add(calculateButton);

    // Step 3. create the application window
    JFrame frame = new JFrame("Pig Latin Translator");
    frame.setLayout(new BorderLayout());
    frame.add(centerPanel, BorderLayout.CENTER);
    frame.pack();

    // Step 4. when the application shows, center it on the screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = frame.getWidth();
    int h = frame.getHeight();
    int x = (screenSize.width - w) / 2;
    int y = (screenSize.height - h) / 2;

    frame.setLocation(x, y);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> init());
  }
}
