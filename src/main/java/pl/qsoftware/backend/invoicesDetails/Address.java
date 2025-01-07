package pl.qsoftware.backend.invoicesDetails;

import pl.qsoftware.backend.builders.AddressBuilder;
import pl.qsoftware.backend.enums.Countries;

public class Address {
  private final String street;
  private final int buildingNumber;
  private int flatNumber;
  private final String zipcode;
  private final String city;
  private final Countries country;

  public Address(String street, int buildingNumber, int flatNumber, String zipcode, String city, Countries country) {
    this.street = street;
    this.buildingNumber = buildingNumber;
    this.flatNumber = flatNumber;
    this.zipcode = zipcode;
    this.city = city;
    this.country = country;
  }

  public void setFlatNumber(int flatNumber) {
    this.flatNumber = flatNumber;
  }

  public static AddressBuilder builder() {
    return new AddressBuilder();
  }

  @Override
  public String toString() {
    String text = "\nul. " + street + " " + buildingNumber;
    if (flatNumber != 0) {
      text += "/" + flatNumber;
    }
    text += "\n" + zipcode + " " + city;
    return text;
  }
}
