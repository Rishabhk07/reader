package me.rishabhkhanna.gitbookreader.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.rishabhkhanna.gitbookreader.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AuthorFragment extends Fragment {

    RecyclerView recyclerView;

    public AuthorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_author, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvAuthor);
        return view;
    }

}
