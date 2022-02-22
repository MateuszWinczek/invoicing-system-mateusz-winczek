package pl.futurecollars.invoicing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Company {
  private String name;
  private Integer taxId;
  private String address;
}
