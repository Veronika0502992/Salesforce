package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    String accountName;
    String phone;
    String fax;
    String parentAccount;
    String website;
    String employee;
    String annualRevenue;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZip;
    String billingCountry;
    String shippingZip;
    String shippingCountry;
    String description;
    String billingStreet;
    String shippingStreet;
}
