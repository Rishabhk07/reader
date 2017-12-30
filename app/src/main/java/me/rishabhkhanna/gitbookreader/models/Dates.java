
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Dates {

    @SerializedName("build")
    private String mBuild;
    @SerializedName("created")
    private String mCreated;

    public String getBuild() {
        return mBuild;
    }

    public void setBuild(String build) {
        mBuild = build;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

}
