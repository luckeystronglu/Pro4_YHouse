package com.huangj.adapter;

import android.content.Context;

import com.huangj.entity.CommentEntity;
import com.huangj.pro4_yhouse.R;

/**
 * Created by mmmm on 2016/10/28.
 */
public class MsginfoListViewAdapter extends AbsMoreBaseAdapter<CommentEntity.CustomerReplyListBean>{
    public MsginfoListViewAdapter(Context context) {
        super(context, R.layout.item_msg_infolv);
    }

    @Override
    protected void bindData(ViewHolder viewHolder, CommentEntity.CustomerReplyListBean data, int typeView) {
        switch (typeView){
            case 0:
                viewHolder.cBindImageView(R.id.infoitem_ivhead,data.getUserBasic().getPicUrl(),R.drawable.icon)
                        .bindTextView(R.id.infoitem_name,data.getUserBasic().getName())
                        .bindTextView(R.id.infoitem_neirong,data.getReply().getContent());
                break;
        }
    }
}
