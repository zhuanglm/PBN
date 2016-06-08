package com.wingon.pbn.component;
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

import java.util.List;

import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wingon.pbn.R;
import com.wingon.pbn.activity.G1_HelpActivity;
import com.wingon.pbn.protocol.ARTICLE;
import com.wingon.pbn.protocol.SHOPHELP;

public class ShopHelpCell extends LinearLayout{

    Context mContext;
    TextView shophelp_content;
    LinearLayout shophelp_item;
    public List<ARTICLE> list;

    public ShopHelpCell(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    void init()
    {
        if (null == shophelp_content)
        {
            shophelp_content = (TextView)findViewById(R.id.shophelp_content);
        }
        
        if (null == shophelp_item)
        {
        	shophelp_item = (LinearLayout)findViewById(R.id.shophelp_item);
        }
    }

    public void bindData(final SHOPHELP shophelp, final Context context,final String data,final int realPosition)
    {
        init();
        shophelp_content.setText(shophelp.name);
        shophelp_item.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 
				
				Intent intent = new Intent(context, G1_HelpActivity.class);
				intent.putExtra("position", realPosition);
				intent.putExtra("data", data);
				context.startActivity(intent);
			
			}
		});
       
    }
}
