package pl.qsoftware.backend.invoicesDetails;

import java.math.BigDecimal;

public class InvoiceItems {
  private String name;
  private int amount;
  private BigDecimal netto;
  private BigDecimal vatAmount;

  public InvoiceItems(String name, int amount, BigDecimal netto, BigDecimal vatAmount) {
    this.name = name;
    this.amount = amount;
    this.netto = netto;
    this.vatAmount = vatAmount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public BigDecimal getNetto() {
    return netto;
  }

  public BigDecimal getVatAmount() {
    return vatAmount;
  }
}
