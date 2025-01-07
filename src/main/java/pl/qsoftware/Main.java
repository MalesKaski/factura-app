package pl.qsoftware;

import pl.qsoftware.invoicesDetails.Address;
import pl.qsoftware.invoicesDetails.Contract;

public class Main {
  public static void main(String[] args) {
    Invoice cloobeesInvoices = Invoice.builder()
        .setContract(Contract.builder()
            .setName("Cloobees Sp. z o.o.")
            .setNipNumber("5213891706")
            .setAddress(Address.builder()
                .setZipcode("18-200")
                .setCity("Wysokie Mazowieckie")
                .setStreet("Konopnickiej")
                .setBuildingNumber(3)
                .build())
            .build())
        .build();
    System.out.println(cloobeesInvoices);
  }
}