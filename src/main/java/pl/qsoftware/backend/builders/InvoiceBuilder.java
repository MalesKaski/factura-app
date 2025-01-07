package pl.qsoftware.backend.builders;

import pl.qsoftware.backend.Invoice;
import pl.qsoftware.backend.enums.PaymentMethod;
import pl.qsoftware.backend.enums.PaymentTerm;
import pl.qsoftware.backend.invoicesDetails.Company;

import java.time.LocalDate;

public class InvoiceBuilder {
  private Company company;
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

  public InvoiceBuilder setContract(Company company) {
    this.company = company;
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
    return new Invoice(company, dateOfSale, invoiceDate, method, paymentTerm, bankAccount, comments, invoiceCity, invoiceNumber, toPayInWords, itemSummary);
  }
}