package pl.qsoftware.invoicesDetails;

import org.testng.annotations.Test;
import pl.qsoftware.backend.invoicesDetails.Company;

public class CompanyTest {

  @Test
  public void testBuilder() {
    System.out.println(Company.builder().build());
  }

  @Test
  public void testCreate() {
  }

  @Test
  public void testTestToString() {
  }
}