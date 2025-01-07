package pl.qsoftware.builders;

import pl.qsoftware.Invoice;
import pl.qsoftware.enums.PaymentMethod;
import pl.qsoftware.enums.PaymentTerm;
import pl.qsoftware.invoicesDetails.Contract;

import java.time.LocalDate;
import java.util.Map;

public class InvoiceBuilder {
  private Contract contract;
  private Map<String, Integer> invoiceItems;
  private LocalDate dateOfSale;
  private LocalDate invoiceDate;
  private PaymentMethod method;
  private PaymentTerm paymentTerm;
  private String bankAccount;
  private String comments;
  private String invoiceCity;
  private String invoiceNumber;
  private String toPayInWords;
  private double itemSummary;

  public InvoiceBuilder setContract(Contract contract) {
    this.contract = contract;
    return this;
  }

  public InvoiceBuilder setInvoiceItems(Map<String, Integer> invoiceItems) {
    this.invoiceItems = invoiceItems;
    return this;
  }

  public InvoiceBuilder setDateOfSale(LocalDate dateOfSale) {
    this.dateOfSale = dateOfSale;
    return this;
  }

  public InvoiceBuilder setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  public InvoiceBuilder setMethod(PaymentMethod method) {
    this.method = method;
    return this;
  }

  public InvoiceBuilder setPaymentTerm(PaymentTerm paymentTerm) {
    this.paymentTerm = paymentTerm;
    return this;
  }

  public InvoiceBuilder setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  public InvoiceBuilder setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public InvoiceBuilder setInvoiceCity(String invoiceCity) {
    this.invoiceCity = invoiceCity;
    return this;
  }

  public InvoiceBuilder setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  public InvoiceBuilder setToPayInWords(String toPayInWords) {
    this.toPayInWords = toPayInWords;
    return this;
  }

  public InvoiceBuilder setItemSummary(double itemSummary) {
    this.itemSummary = itemSummary;
    return this;
  }

  public Invoice build() {
    return new Invoice(contract, invoiceItems, dateOfSale, invoiceDate, method, paymentTerm, bankAccount, comments, invoiceCity, invoiceNumber, toPayInWords, itemSummary);
  }
}