package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int transactionId;

  private int userFromId;
  private int userToId;
  private String currencyCodeFrom;
  private String currencyCodeTo;
  private double amountFrom;
  private double amountTo;
  private double rate;
  private double fee;
  private Timestamp timestamp;

  public Transaction(
    int transactionId,
    int userFromId,
    int userToId,
    String currencyCodeFrom,
    String currencyCodeTo,
    double amountFrom,
    double amountTo,
    double rate,
    double fee) {
    this.transactionId = transactionId;
    this.userFromId = userFromId;
    this.userToId = userToId;
    this.currencyCodeFrom = currencyCodeFrom;
    this.currencyCodeTo = currencyCodeTo;
    this.amountFrom = amountFrom;
    this.amountTo = amountTo;
    this.rate = rate;
    this.fee = fee;
    this.timestamp = new Timestamp(System.currentTimeMillis());
  }

  public Transaction() {}

  public int getTransactionId() {
    return transactionId;
  }

  public int getUserFromId() {
    return userFromId;
  }

  public int getUserToId() {
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

  public Timestamp getTimestamp() {
    return timestamp;
  }
}
