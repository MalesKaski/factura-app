package pl.qsoftware.frontend;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  private final int DEFAULT_WIDTH = 500;
  private final int DEFAULT_HEIGHT = 300;

  JFrame frame = new JFrame("Invoice application");
  JButton enterDateAndLocation = new JButton("enterDateAndLocation");
  ActionListener goToDateLocationFrame = e -> new DateAndLocationFrame();
  JButton enterCompany = new JButton("enterCompany");
  JButton enterCustomer = new JButton("enterCustomer");
  JButton addInvoiceItem = new JButton("addInvoiceItem");
  JButton generateInvoice = new JButton("generateInvoice");

  public MainFrame() {
    buttonConfig(enterDateAndLocation, 10);
    enterDateAndLocation.addActionListener(goToDateLocationFrame);
    buttonConfig(enterCompany, 60);
    buttonConfig(enterCustomer, 110);
    buttonConfig(addInvoiceItem, 160);
    buttonConfig(generateInvoice, 210);
    mainFrameConfig();
  }

  private void mainFrameConfig() {
    frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    frame.setLocation(100, 100);
    frame.setResizable(true);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    frame.add(enterDateAndLocation);
    frame.add(enterCompany);
    frame.add(enterCustomer);
    frame.add(addInvoiceItem);
    frame.add(generateInvoice);

    frame.setVisible(true);
  }

  private void buttonConfig(JButton button, int yLocation) {
    button.setSize(200, 40);
    button.setLocation(10, yLocation);
    button.setFocusable(true);
  }
}
