
package me.rishabhkhanna.gitbookreader.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
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
