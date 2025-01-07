package pl.qsoftware.frontend;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class DateAndLocationFrame extends JFrame {
  JFrame frame = new JFrame();
  JLabel label = new JLabel("Invoice sell date");
  JTextArea setDateTextArea = new JTextArea("Data (Format: YYYY-MM-DD)");
  JButton setTodayDateButton = new JButton("Set Today's date");
  JButton acceptDateButton = new JButton("Accept");
  JButton exitButton = new JButton("Exit");
  ActionListener exit = e -> frame.dispose();
  ActionListener setTodayDate = e -> setDateTextArea.setText(String.valueOf(LocalDate.now()));
//  ActionListener  = e -> frame.dispose();
//  ActionListener exit = e -> frame.dispose();

  public DateAndLocationFrame() {
    frameConfig();
    componentConfiguration();
    addingComponents();
    actionListenersConfig();
    frame.setVisible(true);
  }

  private void frameConfig() {
    frame.setSize(500, 300);
    frame.setLocation(100, 100);
    frame.setResizable(true);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void componentConfiguration() {
    componentConfig(label, 10, 10);
    componentConfig(setDateTextArea, 120, 10);
    componentConfig(setTodayDateButton, 230, 10);
    componentConfig(acceptDateButton, 340, 10);
    componentConfig(exitButton, 10, 60);
  }

  private void componentConfig(JComponent component, int xLocation, int yLocation) {
    component.setSize(100, 40);
    component.setLocation(xLocation, yLocation);
    component.setFocusable(true);
  }

  private void addingComponents() {
    frame.add(label);
    frame.add(setDateTextArea);
    frame.add(setTodayDateButton);
    frame.add(acceptDateButton);
    frame.add(exitButton);
  }

  private void actionListenersConfig() {
    setTodayDateButton.addActionListener(setTodayDate);
    exitButton.addActionListener(exit);
  }
}
