package pl.qsoftware.builders;

import pl.qsoftware.enums.Countries;
import pl.qsoftware.invoicesDetails.Address;

public class AddressBuilder {
  private String street = "Street Name";
  private int buildingNumber = 0;
  private int flatNumber;
  private String zipcode = "Zip-Code";
  private String city = "City Name";
  private Countries country = Countries.Poland;

  public AddressBuilder setStreet(String street) {
    this.street = street;
    return this;
  }

  public AddressBuilder setBuildingNumber(int buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  public AddressBuilder setFlatNumber(int flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

  public AddressBuilder setZipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  public AddressBuilder setCity(String city) {
    this.city = city;
    return this;
  }

  public AddressBuilder setCountry(Countries country) {
    this.country = country;
    return this;
  }

  public Address build() {
    return new Address(street, buildingNumber, flatNumber, zipcode, city, country);
  }
}