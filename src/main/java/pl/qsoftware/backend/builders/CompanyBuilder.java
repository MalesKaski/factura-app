package pl.qsoftware.backend.builders;

import pl.qsoftware.backend.invoicesDetails.Address;
import pl.qsoftware.backend.invoicesDetails.Company;

public class CompanyBuilder {
  private String name = "Company Name";
  private String nipNumber = "Company NIP number";
  private Address address = Address.builder().build();
  private String phone = "Company Phone Number";
  private String email = "Company Email address";

  public CompanyBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public CompanyBuilder setNipNumber(String nipNumber) {
    this.nipNumber = nipNumber;
    return this;
  }

  public CompanyBuilder setAddress(Address address) {
    this.address = address;
    return this;
  }

  public CompanyBuilder setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public CompanyBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public Company build() {
    return new Company(name, nipNumber, address, phone, email);
  }
}