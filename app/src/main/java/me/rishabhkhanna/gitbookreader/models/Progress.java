
package me.rishabhkhanna.gitbookreader.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;



public class Progress {

    @SerializedName("chapters")
    private List<Chapter> mChapters;
    @SerializedName("current")
    private Current mCurrent;
    @SerializedName("percent")
    private Long mPercent;
    @SerializedName("prevPercent")
    private Long mPrevPercent;

    public List<Chapter> getChapters() {
        return mChapters;
    }

    public void setChapters(List<Chapter> chapters) {
        mChapters = chapters;
    }

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Long getPercent() {
        return mPercent;
    }

    public void setPercent(Long percent) {
        mPercent = percent;
    }

    public Long getPrevPercent() {
        return mPrevPercent;
    }

    public void setPrevPercent(Long prevPercent) {
        mPrevPercent = prevPercent;
    }

}
