package pl.qsoftware.invoicesDetails;

import pl.qsoftware.builders.ContractBuilder;

public class Contract {
  private final String name;
  private final String nipNumber;
  private final int dailyRate;
  private final Address address;

  public Contract(String name, String nipNumber, Address address, int dailyRate) {
    this.name = name;
    this.nipNumber = nipNumber;
    this.address = address;
    this.dailyRate = dailyRate;
  }

  public static ContractBuilder builder() {
    return new ContractBuilder();
  }

  @Override
  public String toString() {
    return "Contract{" +
        "\nname='" + name + '\'' +
        "\nnipNumber='" + nipNumber + '\'' +
        "\ndailyRate=" + dailyRate +
        "\naddress=" + address +
        "\n}";
  }
}
