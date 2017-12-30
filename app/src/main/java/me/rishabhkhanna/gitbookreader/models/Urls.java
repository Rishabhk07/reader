
package me.rishabhkhanna.gitbookreader.models;

import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("access")
    private String mAccess;
    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("content")
    private String mContent;
    @SerializedName("download")
    private Download mDownload;
    @SerializedName("edit")
    private String mEdit;
    @SerializedName("explore")
    private String mExplore;
    @SerializedName("git")
    private String mGit;
    @SerializedName("homepage")
    private String mHomepage;
    @SerializedName("profile")
    private String mProfile;
    @SerializedName("read")
    private String mRead;
    @SerializedName("stars")
    private String mStars;

    public String getAccess() {
        return mAccess;
    }

    public void setAccess(String access) {
        mAccess = access;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public Download getDownload() {
        return mDownload;
    }

    public void setDownload(Download download) {
        mDownload = download;
    }

    public String getEdit() {
        return mEdit;
    }

    public void setEdit(String edit) {
        mEdit = edit;
    }

    public String getExplore() {
        return mExplore;
    }

    public void setExplore(String explore) {
        mExplore = explore;
    }

    public String getGit() {
        return mGit;
    }

    public void setGit(String git) {
        mGit = git;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        mHomepage = homepage;
    }

    public String getProfile() {
        return mProfile;
    }

    public void setProfile(String profile) {
        mProfile = profile;
    }

    public String getRead() {
        return mRead;
    }

    public void setRead(String read) {
        mRead = read;
    }

    public String getStars() {
        return mStars;
    }

    public void setStars(String stars) {
        mStars = stars;
    }

}
