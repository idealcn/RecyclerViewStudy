package com.idealcn.recyclerView.activity.multiType.impl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idealcn.recyclerView.R;
import com.idealcn.recyclerView.treelist.base.IMultiTypeAdapter;
import com.idealcn.recyclerView.activity.multiType.MultiTypeAdapter;
import com.idealcn.recyclerView.activity.multiType.MultiTypeData;

/**
 * @author: guoning
 * @date: 2018/12/11 15:41
 * @description:
 */
public class TwoLineAdapter implements IMultiTypeAdapter<MultiTypeData,MultiTypeAdapter.MultiTypeHolder> {
    @Override
    public boolean canParseItemType(MultiTypeData data) {
        return data.getType()==2;
    }

    @Override
    public MultiTypeAdapter.MultiTypeHolder onCreateViewHolder(ViewGroup parent) {
        return new MultiTypeAdapter.MultiTypeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_two_line,parent,false));
    }

    @Override
    public void onBindViewHolder(MultiTypeAdapter.MultiTypeHolder holder, int position, MultiTypeData data) {
        TextView first =  holder.itemView.findViewById(R.id.firstLine);
        TextView second =  holder.itemView.findViewById(R.id.secondLine);


        first.setText(data.getDesc());
        second.setText(data.getDesc());
    }
}
