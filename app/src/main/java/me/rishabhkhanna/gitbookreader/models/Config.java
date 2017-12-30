
package me.rishabhkhanna.gitbookreader.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Config {

    @SerializedName("apiHost")
    private String mApiHost;
    @SerializedName("betaHost")
    private String mBetaHost;
    @SerializedName("gaToken")
    private String mGaToken;
    @SerializedName("github")
    private Github mGithub;
    @SerializedName("hasBlog")
    private Boolean mHasBlog;
    @SerializedName("isEnterprise")
    private Boolean mIsEnterprise;
    @SerializedName("mainHost")
    private String mMainHost;
    @SerializedName("mixpanelToken")
    private String mMixpanelToken;
    @SerializedName("stripePublicKey")
    private String mStripePublicKey;
    @SerializedName("version")
    private String mVersion;

    public String getApiHost() {
        return mApiHost;
    }

    public void setApiHost(String apiHost) {
        mApiHost = apiHost;
    }

    public String getBetaHost() {
        return mBetaHost;
    }

    public void setBetaHost(String betaHost) {
        mBetaHost = betaHost;
    }

    public String getGaToken() {
        return mGaToken;
    }

    public void setGaToken(String gaToken) {
        mGaToken = gaToken;
    }

    public Github getGithub() {
        return mGithub;
    }

    public void setGithub(Github github) {
        mGithub = github;
    }

    public Boolean getHasBlog() {
        return mHasBlog;
    }

    public void setHasBlog(Boolean hasBlog) {
        mHasBlog = hasBlog;
    }

    public Boolean getIsEnterprise() {
        return mIsEnterprise;
    }

    public void setIsEnterprise(Boolean isEnterprise) {
        mIsEnterprise = isEnterprise;
    }

    public String getMainHost() {
        return mMainHost;
    }

    public void setMainHost(String mainHost) {
        mMainHost = mainHost;
    }

    public String getMixpanelToken() {
        return mMixpanelToken;
    }

    public void setMixpanelToken(String mixpanelToken) {
        mMixpanelToken = mixpanelToken;
    }

    public String getStripePublicKey() {
        return mStripePublicKey;
    }

    public void setStripePublicKey(String stripePublicKey) {
        mStripePublicKey = stripePublicKey;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

}
