package pl.qsoftware.backend.PDF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PDFGeneratorApp {

  private JFrame frame;
  private JTextArea textArea;
  private JButton generateButton;
  private JLabel statusLabel;

  public PDFGeneratorApp() {
    initialize();
  }

  public static void main(String[] args) {
    // Uruchamiamy aplikację
    SwingUtilities.invokeLater(() -> {
      try {
        PDFGeneratorApp window = new PDFGeneratorApp();
        window.frame.setVisible(true);
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }

  private void initialize() {
    // Inicjalizacja okna głównego
    frame = new JFrame("PDF Generator");
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new BorderLayout());

    // Pole tekstowe
    textArea = new JTextArea();
    frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

    // Panel z przyciskami
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.SOUTH);

    generateButton = new JButton("Generate PDF");
    panel.add(generateButton);

    statusLabel = new JLabel("Status: ");
    panel.add(statusLabel);

    // Akcja generowania PDF
    generateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String content = textArea.getText();
        if (content.isEmpty()) {
          statusLabel.setText("Status: Please enter some text.");
        } else {
          // Generujemy PDF
          String filePath = "generated_pdf.pdf";
          PDFCreator.createPDF(content, filePath);
          statusLabel.setText("Status: PDF created successfully!");
        }
      }
    });
  }
}
