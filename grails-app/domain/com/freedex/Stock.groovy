package com.freedex

class Stock {
    // fields from fundamentals field
    String ticker
    String name
    Sector sector
    Industry industry
    double priceToEarnings
    double earningsPerShare
    double dividendYield
    int numShares
    double dps
    double priceEarningsGrowth
    double pts
    double priceToBook

    // from price download
    double pricePerShare

    static constraints = {
        ticker unique: true
    }
}