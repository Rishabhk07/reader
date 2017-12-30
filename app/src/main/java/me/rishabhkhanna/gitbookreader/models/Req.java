
package me.rishabhkhanna.gitbookreader.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Req {

    @SerializedName("csrfToken")
    private String mCsrfToken;
    @SerializedName("date")
    private String mDate;
    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("query")
    private Query mQuery;
    @SerializedName("url")
    private String mUrl;

    public String getCsrfToken() {
        return mCsrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        mCsrfToken = csrfToken;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public Query getQuery() {
        return mQuery;
    }

    public void setQuery(Query query) {
        mQuery = query;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
