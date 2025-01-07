package pl.qsoftware.backend.invoicesDetails;

import pl.qsoftware.backend.builders.CompanyBuilder;

public class Company {
  private final String name;
  private final String nipNumber;
  private final Address address;
  private final String phone;
  private final String email;

  public Company(String name, String nipNumber, Address address, String phone, String email) {
    this.name = name;
    this.nipNumber = nipNumber;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  public static CompanyBuilder builder() {
    return new CompanyBuilder();
  }

  @Override
  public String toString() {
    return "\n" + name +
        address +
        "\nNIP: " + nipNumber +
        "\nTel.: " + phone +
        "\nEmail: " + email;
  }

  public String getName() {
    return name;
  }

  public String getNipNumber() {
    return nipNumber;
  }

  public Address getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
