
package me.rishabhkhanna.gitbookreader.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;



public class BookContents {

    @SerializedName("progress")
    private Progress mProgress;
    @SerializedName("sections")
    private List<Section> mSections;
    @SerializedName("version")
    private String mVersion;

    public Progress getProgress() {
        return mProgress;
    }

    public void setProgress(Progress progress) {
        mProgress = progress;
    }

    public List<Section> getSections() {
        return mSections;
    }

    public void setSections(List<Section> sections) {
        mSections = sections;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

}
