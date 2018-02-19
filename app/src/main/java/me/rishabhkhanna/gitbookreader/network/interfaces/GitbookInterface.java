package me.rishabhkhanna.gitbookreader.network.interfaces;

import me.rishabhkhanna.gitbookreader.models.TopicExplore;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by rishabhkhanna on 19/02/18.
 */

public interface GitbookInterface {
    @Headers("x-pjax: true")
    @GET("explore")
    Call<TopicExplore> getNoParamsExplore(
            @Query("page") String page,
            @Query("lang") String lang
    );

    @Headers("x-pjax: true")
    @GET("explore/topic/{topic}")
    Call<TopicExplore> getGitbookExplore(
            @Query("page") String page,
            @Query("lang") String lang
    );
}
