
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Cover {

    @SerializedName("large")
    private String mLarge;
    @SerializedName("small")
    private String mSmall;

    public String getLarge() {
        return mLarge;
    }

    public void setLarge(String large) {
        mLarge = large;
    }

    public String getSmall() {
        return mSmall;
    }

    public void setSmall(String small) {
        mSmall = small;
    }

}
