
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Section {

    @SerializedName("content")
    private String mContent;
    @SerializedName("type")
    private String mType;

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
