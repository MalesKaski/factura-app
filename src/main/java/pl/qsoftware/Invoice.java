package pl.qsoftware;

import pl.qsoftware.builders.InvoiceBuilder;
import pl.qsoftware.enums.PaymentMethod;
import pl.qsoftware.enums.PaymentTerm;
import pl.qsoftware.invoicesDetails.Contract;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Invoice {
  private final Contract contract;
  private Map<String, Integer> invoiceItems = new HashMap<>();
  private final LocalDate dateOfSale;
  private final LocalDate invoiceDate;
  private final PaymentMethod method;
  private final PaymentTerm paymentTerm;
  private final String bankAccount;
  private final String comments;
  private final String invoiceCity;
  private final String invoiceNumber;
  private final String toPayInWords;
  private final double itemSummary;

  public Invoice(Contract contract, Map<String, Integer> invoiceItems, LocalDate dateOfSale, LocalDate invoiceDate, PaymentMethod method, PaymentTerm paymentTerm, String bankAccount, String comments, String invoiceCity, String invoiceNumber, String toPayInWords, double itemSummary) {
    this.contract = contract;
    this.invoiceItems = invoiceItems;
    this.dateOfSale = dateOfSale;
    this.invoiceDate = invoiceDate;
    this.method = method;
    this.paymentTerm = paymentTerm;
    this.bankAccount = bankAccount;
    this.comments = comments;
    this.invoiceCity = invoiceCity;
    this.invoiceNumber = invoiceNumber;
    this.toPayInWords = toPayInWords;
    this.itemSummary = itemSummary;
  }

  public static InvoiceBuilder builder() {
    return new InvoiceBuilder();
  }

  @Override
  public String toString() {
    return "Invoice{" +
        "\ncontract=" + contract +
        "\ninvoiceItems=" + invoiceItems +
        "\ndateOfSale=" + dateOfSale +
        "\ninvoiceDate=" + invoiceDate +
        "\nmethod=" + method +
        "\npaymentTerm=" + paymentTerm +
        "\nbankAccount='" + bankAccount + '\'' +
        "\ncomments='" + comments + '\'' +
        "\ninvoiceCity='" + invoiceCity + '\'' +
        "\ninvoiceNumber='" + invoiceNumber + '\'' +
        "\ntoPayInWords='" + toPayInWords + '\'' +
        "\nitemSummary=" + itemSummary +
        "\n}";
  }
}
