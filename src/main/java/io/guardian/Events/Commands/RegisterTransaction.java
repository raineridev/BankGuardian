package io.guardian.Events.Commands;

import java.math.BigDecimal;
import java.util.Currency;

public class RegisterTransaction {
  private String transactionID;
  private String userID;
  private BigDecimal transactionValue;
  private String transactionCountry;
  private String transactionIp;
  private String transactionDevice;
  private Long transactionTimestamp;


  public RegisterTransaction(String transactionID,
                             String userID,
                             BigDecimal transactionValue,
                             String transactionCountry,
                             String transactionIp,
                             String transactionDevice,
                             Long transactionTimestamp
  ) {
    this.transactionID = transactionID;
    this.userID = userID;
    this.transactionValue = transactionValue;
    this.transactionCountry = transactionCountry;
    this.transactionIp = transactionIp;
    this.transactionDevice = transactionDevice;
    this.transactionTimestamp = transactionTimestamp;
  }
}
