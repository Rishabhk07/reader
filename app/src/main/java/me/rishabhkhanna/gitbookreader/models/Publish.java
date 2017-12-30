
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Publish {

    @SerializedName("builder")
    private Object mBuilder;
    @SerializedName("defaultBranch")
    private Object mDefaultBranch;
    @SerializedName("ebooks")
    private Boolean mEbooks;

    public Object getBuilder() {
        return mBuilder;
    }

    public void setBuilder(Object builder) {
        mBuilder = builder;
    }

    public Object getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(Object defaultBranch) {
        mDefaultBranch = defaultBranch;
    }

    public Boolean getEbooks() {
        return mEbooks;
    }

    public void setEbooks(Boolean ebooks) {
        mEbooks = ebooks;
    }

}
