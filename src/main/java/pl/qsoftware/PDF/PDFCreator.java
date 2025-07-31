package pl.qsoftware.PDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFCreator {

  public static void createPDF(String content, String filePath) {
    PDDocument document = new PDDocument(); // Tworzymy nowy dokument PDF
    PDPage page = new PDPage(); // Tworzymy nową stronę w dokumencie
    document.addPage(page); // Dodajemy stronę do dokumentu

    try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
      contentStream.beginText();
//      contentStream.setFont(PDType1Font., 12); // Ustawiamy czcionkę
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
  }
}
