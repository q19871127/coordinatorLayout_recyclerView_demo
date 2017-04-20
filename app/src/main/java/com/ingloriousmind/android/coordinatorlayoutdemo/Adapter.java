package com.ingloriousmind.android.coordinatorlayoutdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2017/4/20.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.VH> {

    private Context context;

    public Adapter(Context context){
        this.context=context;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,android.R.layout.simple_list_item_1,null);
        VH vh = new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.text.setText(position+"");
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class VH extends RecyclerView.ViewHolder{

        TextView text;

        public VH(View itemView) {
            super(itemView);
            text= (TextView) itemView.findViewById(android.R.id.text1);
        }
    }
}
