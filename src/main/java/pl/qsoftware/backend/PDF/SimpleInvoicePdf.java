package pl.qsoftware.backend.PDF;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import pl.qsoftware.backend.Invoice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SimpleInvoicePdf {

  public static void generatePdf(Invoice invoice, String sciezkaPliku) {
    Document document = new Document(PageSize.A4, 50, 50, 50, 50);
    try {
      PdfWriter.getInstance(document, new FileOutputStream(sciezkaPliku));
      document.open();

      // 1) Nagłówek / Tytuł faktury
      Font fontHeader = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
      Paragraph header = new Paragraph("Faktura nr " + invoice.getInvoiceNumber(), fontHeader);
      header.setAlignment(Paragraph.ALIGN_CENTER);
      document.add(header);

      // Dodajemy niewielki odstęp
      document.add(new Paragraph(" "));

      // 2) Dane klienta i data
      Font fontBase = FontFactory.getFont(FontFactory.HELVETICA, 12);
      Paragraph daneKlienta = new Paragraph(
          "Data wystawienia: " + invoice.getInvoiceDate() + "\n" +
              "Klient: " + invoice.getContract().getName() + "\n" +
              "Adres: " + invoice.getContract().getAddress().toString(),
          fontBase
      );
      document.add(daneKlienta);

      document.add(new Paragraph(" ")); // odstęp

      // 3) Tabela pozycji
      PdfPTable table = new PdfPTable(4); // liczba kolumn
      table.setWidthPercentage(100);      // szerokość wypełnia stronę

      // Nagłówki kolumn
      table.addCell(createCell("Nazwa", true));
      table.addCell(createCell("Ilość", true));
      table.addCell(createCell("Cena netto", true));
      table.addCell(createCell("Wartość netto", true));

      // Wypełnianie wierszy
      invoice.getInvoiceItems().forEach(item -> {
        table.addCell(createCell(item.getName(), false));
        table.addCell(createCell(String.valueOf(item.getAmount()), false));
        table.addCell(createCell(item.getNetto().toString(), false));
        // Wartość netto = cenaNetto * ilość
        table.addCell(createCell(
            item.getNetto()
                .multiply(java.math.BigDecimal.valueOf(item.getAmount()))
                .toString(),
            false
        ));
      });

      document.add(table);

      // 4) Podsumowanie
      document.add(new Paragraph(" ")); // odstęp
      Paragraph suma = new Paragraph(
          "Suma netto: " + invoice.getSumNetto() + " PLN\n" +
              "Suma brutto (23% VAT): " + invoice.getSumBrutto() + " PLN",
          FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)
      );
      document.add(suma);

    } catch (FileNotFoundException | DocumentException e) {
      e.printStackTrace();
    } finally {
      document.close();
    }
  }

  // Metoda pomocnicza do tworzenia komórek tabeli
  private static PdfPCell createCell(String text, boolean bold) {
    Font font = bold ?
        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12) :
        FontFactory.getFont(FontFactory.HELVETICA, 12);

    PdfPCell cell = new PdfPCell(new Paragraph(text, font));
    cell.setPadding(5);
    return cell;
  }
}
