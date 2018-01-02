package me.rishabhkhanna.gitbookreader.network;

import android.content.ContentProvider;
import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rishabhkhanna on 29/12/17.
 */

public class API {
    public static API apiInstance;
    public Retrofit retrofit;
    Context context;
    public API(Context context){
        this.context = context;

        retrofit = new Retrofit.Builder().baseUrl("http://api.gitbook.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
    public static API getInstance(Context context){
        if (apiInstance == null){
            apiInstance = new API(context);
        }
        return apiInstance;
    }
}
