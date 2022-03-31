package com.nology.VenturistProxyAPI;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int transactionId;

  private String userFromId;
  private String userToId;
  private String currencyCodeFrom;
  private String currencyCodeTo;
  private double amountFrom;
  private double amountTo;
  private double rate;
  private double fee;


  public Transaction(
    String userFromId,
    String userToId,
    String currencyCodeFrom,
    String currencyCodeTo,
    double amountFrom,
    double amountTo,
    double rate,
    double fee) {
    this.userFromId = userFromId;
    this.userToId = userToId;
    this.currencyCodeFrom = currencyCodeFrom;
    this.currencyCodeTo = currencyCodeTo;
    this.amountFrom = amountFrom;
    this.amountTo = amountTo;
    this.rate = rate;
    this.fee = fee;

  }

  public Transaction() {}

  public int getTransactionId() {
    return transactionId;
  }

  public String getUserFromId() {
    return userFromId;
  }

  public String getUserToId() {
    return userToId;
  }

  public String getCurrencyCodeFrom() {
    return currencyCodeFrom;
  }

  public String getCurrencyCodeTo() {
    return currencyCodeTo;
  }

  public double getAmountFrom() {
    return amountFrom;
  }

  public double getAmountTo() {
    return amountTo;
  }

  public double getRate() {
    return rate;
  }

  public double getFee() {
    return fee;
  }

}
