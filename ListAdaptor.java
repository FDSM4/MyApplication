package com.example.itachi.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ITACHI on 19-01-2018.
 */

public class ListAdaptor extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindview(position);
    }

    @Override
    public int getItemCount() {
        return Data.title.length;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mtext;
        private ImageView mimage;

        public ListViewHolder(View itemView) {

            super(itemView);


            mtext = (TextView) itemView.findViewById(R.id.ItemText);
            mimage = (ImageView) itemView.findViewById(R.id.ItemImage);
            itemView.setOnClickListener(this);
        }
        public void bindview(int position){

            mtext.setText(Data.title[position]);
            mimage.setImageResource(Data.picturepath);
        }

        public void onClick(View view){

        }
    }
}
