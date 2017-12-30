
package me.rishabhkhanna.gitbookreader.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AuthorBooks {

    @SerializedName("limit")
    private Long mLimit;
    @SerializedName("list")
    private java.util.List<me.rishabhkhanna.gitbookreader.models.List> mList;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("pages")
    private Long mPages;
    @SerializedName("total")
    private Long mTotal;

    public Long getLimit() {
        return mLimit;
    }

    public void setLimit(Long limit) {
        mLimit = limit;
    }

    public java.util.List<me.rishabhkhanna.gitbookreader.models.List> getList() {
        return mList;
    }

    public void setList(java.util.List<me.rishabhkhanna.gitbookreader.models.List> list) {
        mList = list;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Long getPages() {
        return mPages;
    }

    public void setPages(Long pages) {
        mPages = pages;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
