
package me.rishabhkhanna.gitbookreader.models;


import com.google.gson.annotations.SerializedName;



public class Topic {

    @SerializedName("books")
    private Long mBooks;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("urls")
    private Urls mUrls;

    public Long getBooks() {
        return mBooks;
    }

    public void setBooks(Long books) {
        mBooks = books;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Urls getUrls() {
        return mUrls;
    }

    public void setUrls(Urls urls) {
        mUrls = urls;
    }

}
