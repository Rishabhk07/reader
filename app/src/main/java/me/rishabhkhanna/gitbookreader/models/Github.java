
package me.rishabhkhanna.gitbookreader.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
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
