
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Github {

    @SerializedName("integrationUrl")
    private String mIntegrationUrl;
    @SerializedName("username")
    private String mUsername;

    public String getIntegrationUrl() {
        return mIntegrationUrl;
    }

    public void setIntegrationUrl(String integrationUrl) {
        mIntegrationUrl = integrationUrl;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

}
