package pl.qsoftware.invoicesDetails;

import pl.qsoftware.builders.AddressBuilder;
import pl.qsoftware.enums.Countries;

public class Address {
  private final String street;
  private final int buildingNumber;
  private final int flatNumber;
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

  public static AddressBuilder builder() {
    return new AddressBuilder();
  }

  @Override
  public String toString() {
    return "Address{" +
        "\nstreet='" + street + '\'' +
        "\nbuildingNumber=" + buildingNumber +
        "\nflatNumber=" + flatNumber +
        "\nzipcode='" + zipcode + '\'' +
        "\ncity='" + city + '\'' +
        "\ncountry=" + country +
        "\n}";
  }
}
