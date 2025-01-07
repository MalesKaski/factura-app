package pl.qsoftware.backend.enums;

public enum Months {
  JANUARY("01 January"),
  FEBRUARY("02 February"),
  MARCH("03 March"),
  APRIL("04 April"),
  MAY("05 May"),
  JUNE("06 June"),
  JULY("07 July"),
  AUGUST("08 August"),
  SEPTEMBER("09 September"),
  OCTOBER("10 October"),
  NOVEMBER("11 November"),
  DECEMBER("12 December");

  private final String destinationFolder;

  Months(String destinationFolder) {
    this.destinationFolder = destinationFolder;
  }

  public String getDestinationFolder() {
    return destinationFolder;
  }
}
