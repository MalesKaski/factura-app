package pl.qsoftware;

import pl.qsoftware.frontend.MainFrame;

public class InvoiceApp {
  public static void main(String[] args) {
    /*Company qsoftware = Company.builder()
        .setName("QualitySoftware Kamil Maleszko")
        .setAddress(Address.builder()
            .setZipcode("18-200")
            .setCity("Wysokie Mazowieckie")
            .setBuildingNumber(3)
            .setStreet("Konopnickiej")
            .build())
        .setNipNumber("7221639017")
        .setPhone("503148227")
        .setEmail("kontakt@kmaleszko.pl")
        .build();
    System.out.println(qsoftware);*/
    new MainFrame();
  }
}