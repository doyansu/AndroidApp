package com.example.a109590041_hw7_4_5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private final LinkedList<String> allWords;
    private final LinkedList<String> allDetail;
    private final LinkedList<Intent> allact;
    private final LayoutInflater mInflater;
    private Context context;

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        final MyAdapter mAdapter;
        Intent intent = null;

        public final TextView titleItemView, contentItemView;

        public MyViewHolder(@NonNull View itemView, MyAdapter adapter) {
            super(itemView);
            this.mAdapter = adapter;
            titleItemView = itemView.findViewById(R.id.wordlist_title);
            contentItemView = itemView.findViewById(R.id.word_content);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            /*int mposition = getLayoutPosition();
            if (mposition == 0){
                this.intent = new Intent(context, MainActivity2.class);
            } else if (mposition == 1){
                this.intent = new Intent(context, MainActivity3.class);
            } else if (mposition == 2){
                this.intent = new Intent(context, MainActivity4.class);
            } else {
                this.intent = new Intent(context, MainActivity5.class);
            }*/
            context.startActivity(this.intent);
        }
    }

    public MyAdapter(Context context, LinkedList<String> wordList, LinkedList<String> Detail, LinkedList<Intent> act) {
        mInflater = LayoutInflater.from(context);
        this.allWords = wordList;
        this.allDetail = Detail;
        this.allact = act;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.wordlist_item, parent, false);
        return new MyViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        String mCurrent = allWords.get(position);
        String Detail = allDetail.get(position);
        // Add the data to the view holder.
        holder.titleItemView.setText(mCurrent);
        holder.contentItemView.setText(Detail);
        holder.intent = allact.get(position);
    }

    @Override
    public int getItemCount() {
        return allWords.size();
    }
}
