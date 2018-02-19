package me.rishabhkhanna.gitbookreader.network.interfaces;

import me.rishabhkhanna.gitbookreader.models.AuthorBooks;
import me.rishabhkhanna.gitbookreader.models.BookContents;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rishabhkhanna on 11/01/18.
 */

public interface ApiInterface {

    @GET("author/{authorName}/books")
    Call<AuthorBooks> getBooksByAuthor(
            @Path("authorName") String authorName
    );

    @GET("book/{authorName}/{bookName}/contents/{chapter}/{sub}")
    Call<BookContents> getBookContents(
            @Path("authorName") String authorName,
            @Path("bookName") String bookName,
            @Path("chapter") String chapter,
            @Path("sub") String sub
    );
}
