package pl.qsoftware.backend;

import pl.qsoftware.backend.builders.InvoiceBuilder;
import pl.qsoftware.backend.enums.PaymentMethod;
import pl.qsoftware.backend.enums.PaymentTerm;
import pl.qsoftware.backend.invoicesDetails.Company;
import pl.qsoftware.backend.invoicesDetails.InvoiceItems;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
  private final Company company;
  private ArrayList<InvoiceItems> invoiceItems;
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

  public Invoice(Company company, LocalDate dateOfSale, LocalDate invoiceDate, PaymentMethod method, PaymentTerm paymentTerm, String bankAccount, String comments, String invoiceCity, String invoiceNumber, String toPayInWords, double itemSummary) {
    this.company = company;
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
        "\ncontract=" + company +
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

  public Company getContract() {
    return company;
  }

  public ArrayList<InvoiceItems> getInvoiceItems() {
    return invoiceItems;
  }

  public LocalDate getDateOfSale() {
    return dateOfSale;
  }

  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public PaymentMethod getMethod() {
    return method;
  }

  public PaymentTerm getPaymentTerm() {
    return paymentTerm;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public String getComments() {
    return comments;
  }

  public String getInvoiceCity() {
    return invoiceCity;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public String getToPayInWords() {
    return toPayInWords;
  }

  public double getItemSummary() {
    return itemSummary;
  }

  public String getSumNetto() {
    return null;
  }

  public String getSumBrutto() {
    return null;
  }
}
