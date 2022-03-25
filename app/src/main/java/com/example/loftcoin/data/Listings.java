package com.example.loftcoin.data;

import com.google.auto.value.AutoValue;


@AutoValue
abstract class Listings {

    abstract List<AutoValue_Coin> data();

}