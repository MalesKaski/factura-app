package pl.qsoftware.backend.PDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

public class PDFCreator {

  public static void createPDF(String content, String filePath) {
    PDDocument document = new PDDocument(); // Tworzymy nowy dokument PDF
    PDPage page = new PDPage(); // Tworzymy nową stronę w dokumencie
    document.addPage(page); // Dodajemy stronę do dokumentu

    try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
      contentStream.beginText();
      contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD), 12);
      contentStream.newLineAtOffset(100, 700); // Ustawiamy pozycję tekstu na stronie
      contentStream.showText(content); // Wstawiamy tekst
      contentStream.endText();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      document.save(filePath); // Zapisujemy dokument PDF do pliku
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      document.close(); // Zamykamy dokument
    } catch (IOException e) {
      e.printStackTrace();
    }

//    String destination = "formal_letter.pdf";
//
//    // Tworzenie dokumentu PDF
//    try {
//      PdfWriter writer = new PdfWriter(destination);
//      PdfDocument pdf = new PdfDocument(writer);
//      Document document = new Document(pdf);
//
//      // Nagłówek: Dane nadawcy
//      document.add(new Paragraph(senderName)
//          .setBold());
//      document.add(new Paragraph(senderAddress));
//      document.add(new Paragraph("Telefon: " + senderPhone));
//      document.add(new Paragraph("\n"));
//
//      // Nagłówek: Dane odbiorcy
//      document.add(new Paragraph(recipientName)
//          .setBold());
//      document.add(new Paragraph(recipientAddress));
//      document.add(new Paragraph("\n"));
//
//      // Wprowadzenie treści pisma
//      document.add(new Paragraph("Warszawa, 9 stycznia 2025"));
//      document.add(new Paragraph("\n"));
//      document.add(new Paragraph(letterContent));
//      document.add(new Paragraph("\n"));
//
//      // Zakończenie pisma
//      document.add(new Paragraph("Z poważaniem,"));
//      document.add(new Paragraph(senderName));
//
//      // Zakończenie dokumentu
//      document.close();
//
//      System.out.println("Pismo zostało wygenerowane pomyślnie!");
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
