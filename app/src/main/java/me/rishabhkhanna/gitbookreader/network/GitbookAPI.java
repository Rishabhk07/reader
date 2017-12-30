package me.rishabhkhanna.gitbookreader.network;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rishabhkhanna on 30/12/17.
 */

public class GitbookAPI {
    public static GitbookAPI instance;
    public Retrofit retrofit;

    public GitbookAPI(Context context) {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://www.gitbook.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static GitbookAPI getInstance(Context context){
        if(instance == null){
            instance = new GitbookAPI(context);
        }
        return instance;
    }
}
