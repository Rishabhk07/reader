package me.rishabhkhanna.gitbookreader.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import me.rishabhkhanna.gitbookreader.R;
import me.rishabhkhanna.gitbookreader.adapters.ExploreAdapter;
import me.rishabhkhanna.gitbookreader.models.List;
import me.rishabhkhanna.gitbookreader.models.TopicExplore;
import me.rishabhkhanna.gitbookreader.network.GitbookAPI;
import me.rishabhkhanna.gitbookreader.network.interfaces.GitbookInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {


    RecyclerView recyclerView;
    int page  = 0;
    public static final String TAG = "Explre Fragment";
    java.util.List<List> exploreBooksList = new ArrayList<>();
    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_explore, container, false);

        recyclerView  = (RecyclerView) view.findViewById(R.id.explore_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        final ExploreAdapter exploreAdapter = new ExploreAdapter(exploreBooksList, getContext());
        recyclerView.setAdapter(exploreAdapter);
        GitbookAPI.getInstance(getContext()).retrofit.create(GitbookInterface.class).getNoParamsExplore(
                String.valueOf(page),
                "en"
        ).enqueue(new Callback<TopicExplore>() {
            @Override
            public void onResponse(Call<TopicExplore> call, Response<TopicExplore> response) {
                    Log.d(TAG, "onResponse: " + call.request());
                    Log.d(TAG, "onResponse: " + call.request().header("x-pjax"));
                    exploreBooksList.addAll(response.body().getProps().getBooks().getList());
                    exploreAdapter.notifyDataSetChanged();
            }
            @Override
            public void onFailure(Call<TopicExplore> call, Throwable t) {

            }
        });


        return view;
    }

}
