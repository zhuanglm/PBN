package com.wingon.pbn.adapter;
//
//                       __
//                      /\ \   _
//    ____    ____   ___\ \ \_/ \           _____    ___     ___
//   / _  \  / __ \ / __ \ \    <     __   /\__  \  / __ \  / __ \
//  /\ \_\ \/\  __//\  __/\ \ \\ \   /\_\  \/_/  / /\ \_\ \/\ \_\ \
//  \ \____ \ \____\ \____\\ \_\\_\  \/_/   /\____\\ \____/\ \____/
//   \/____\ \/____/\/____/ \/_//_/         \/____/ \/___/  \/___/
//     /\____/
//     \/___/
//
//  Powered by BeeFramework
//

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.insthub.BeeFramework.adapter.BeeBaseAdapter;
import com.wingon.pbn.R;
import com.wingon.pbn.component.HotSellingCell;
import com.wingon.pbn.component.SpecificationCell;
import com.wingon.pbn.protocol.SPECIFICATION;

import java.util.ArrayList;

public class SpecificationAdapter extends BeeBaseAdapter
{
    private Context mContext;
    public SpecificationAdapter(Context c, ArrayList dataList) {
        super(c, dataList);
        mContext = c;
    }

    @Override
    protected BeeCellHolder createCellHolder(View cellView) {
        return null;
    }

    @Override
    protected View bindData(int position, View cellView, ViewGroup parent, BeeCellHolder h) {
        SPECIFICATION specification = (SPECIFICATION)dataList.get(position);
        ((SpecificationCell)cellView).bindData(specification);
        return cellView;
    }

    @Override
    public View createCellView() {
        return LayoutInflater.from(mContext).inflate(R.layout.specification_cell, null);
    }
}
