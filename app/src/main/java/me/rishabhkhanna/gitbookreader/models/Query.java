
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Query {

    @SerializedName("lang")
    private String mLang;
    @SerializedName("page")
    private String mPage;

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getPage() {
        return mPage;
    }

    public void setPage(String page) {
        mPage = page;
    }

}
