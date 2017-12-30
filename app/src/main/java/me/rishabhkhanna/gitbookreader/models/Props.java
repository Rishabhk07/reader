
package me.rishabhkhanna.gitbookreader.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Props {

    @SerializedName("books")
    private Books mBooks;
    @SerializedName("config")
    private Config mConfig;
    @SerializedName("req")
    private Req mReq;
    @SerializedName("selectedLanguage")
    private String mSelectedLanguage;
    @SerializedName("sort")
    private String mSort;
    @SerializedName("topic")
    private Topic mTopic;
    @SerializedName("topics")
    private List<Topic> mTopics;

    public Books getBooks() {
        return mBooks;
    }

    public void setBooks(Books books) {
        mBooks = books;
    }

    public Config getConfig() {
        return mConfig;
    }

    public void setConfig(Config config) {
        mConfig = config;
    }

    public Req getReq() {
        return mReq;
    }

    public void setReq(Req req) {
        mReq = req;
    }

    public String getSelectedLanguage() {
        return mSelectedLanguage;
    }

    public void setSelectedLanguage(String selectedLanguage) {
        mSelectedLanguage = selectedLanguage;
    }

    public String getSort() {
        return mSort;
    }

    public void setSort(String sort) {
        mSort = sort;
    }

    public Topic getTopic() {
        return mTopic;
    }

    public void setTopic(Topic topic) {
        mTopic = topic;
    }

    public List<Topic> getTopics() {
        return mTopics;
    }

    public void setTopics(List<Topic> topics) {
        mTopics = topics;
    }

}
