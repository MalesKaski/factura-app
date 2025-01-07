package pl.qsoftware.builders;

import pl.qsoftware.invoicesDetails.Address;
import pl.qsoftware.invoicesDetails.Contract;

public class ContractBuilder {
  private String name = "ContractorName";
  private String nipNumber = "Contractor NIP number";
  private Address address = Address.builder().build();
  private int dailyRate = 0;

  public ContractBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public ContractBuilder setNipNumber(String nipNumber) {
    this.nipNumber = nipNumber;
    return this;
  }

  public ContractBuilder setAddress(Address address) {
    this.address = address;
    return this;
  }

  public ContractBuilder setDailyRate(int dailyRate) {
    this.dailyRate = dailyRate;
    return this;
  }

  public Contract build() {
    return new Contract(name, nipNumber, address, dailyRate);
  }
}