package me.rishabhkhanna.gitbookreader.adapters;

import android.animation.LayoutTransition;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import me.rishabhkhanna.gitbookreader.R;
import me.rishabhkhanna.gitbookreader.models.List;

/**
 * Created by rishabhkhanna on 18/02/18.
 */

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>{

    java.util.List<List> bookList;
    Context context;

    public ExploreAdapter(java.util.List<List> bookList, Context context) {
        this.bookList = bookList;
        this.context = context;
    }

    @Override
    public ExploreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.book_layout,parent,false);

        return new ExploreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExploreViewHolder holder, int position) {

        holder.tvTitle.setText(bookList.get(position).getTitle());
        holder.tvContent.setText(bookList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ExploreViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        TextView tvContent;
        public ExploreViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvBookTitle);
            tvContent = (TextView) itemView.findViewById(R.id.tvBookDesc);
        }
    }
}
