
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class TopicExplore {

    @SerializedName("component")
    private String mComponent;
    @SerializedName("props")
    private Props mProps;
    @SerializedName("script")
    private String mScript;

    public String getComponent() {
        return mComponent;
    }

    public void setComponent(String component) {
        mComponent = component;
    }

    public Props getProps() {
        return mProps;
    }

    public void setProps(Props props) {
        mProps = props;
    }

    public String getScript() {
        return mScript;
    }

    public void setScript(String script) {
        mScript = script;
    }

}
