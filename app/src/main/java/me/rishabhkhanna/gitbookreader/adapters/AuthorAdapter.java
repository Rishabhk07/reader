package me.rishabhkhanna.gitbookreader.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import me.rishabhkhanna.gitbookreader.R;
import me.rishabhkhanna.gitbookreader.models.AuthorBooks;

/**
 * Created by rishabhkhanna on 15/01/18.
 */

public class AuthorAdapter extends RecyclerView.Adapter {

    List<AuthorBooks> authorBooksArrayList = null;
    Context context;

    public AuthorAdapter(List<AuthorBooks> authorBooksArrayList, Context context) {
        this.authorBooksArrayList = authorBooksArrayList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.book_layout,parent,false);
        return new AuthorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AuthorViewHolder extends RecyclerView.ViewHolder{
        TextView tvHeading;
        TextView tvText;
        public AuthorViewHolder(View itemView) {
            super(itemView);
            tvHeading = (TextView) itemView.findViewById(R.id.tvBookTitle);
            tvText = (TextView) itemView.findViewById(R.id.tvBookDesc);
        }
    }
}
