
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Download {

    @SerializedName("epub")
    private String mEpub;
    @SerializedName("mobi")
    private String mMobi;
    @SerializedName("pdf")
    private String mPdf;

    public String getEpub() {
        return mEpub;
    }

    public void setEpub(String epub) {
        mEpub = epub;
    }

    public String getMobi() {
        return mMobi;
    }

    public void setMobi(String mobi) {
        mMobi = mobi;
    }

    public String getPdf() {
        return mPdf;
    }

    public void setPdf(String pdf) {
        mPdf = pdf;
    }

}
