package com.example.loftcoin.data;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

import java.io.IOException;


public interface CoinsRepo {

    @NonNull
    @WorkerThread
    List<AutoValue_Coin> listings(@NonNull String currency) throws IOException;

}