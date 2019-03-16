package com.abms.Kaarigar.historyRecyclerView;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import com.abms.Kaarigar.R;

/**
 * Created by manel on 10/10/2017.
 */

public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView rideId;
    public TextView time;
    public HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        rideId = (TextView) itemView.findViewById(R.id.rideId);
        time = (TextView) itemView.findViewById(R.id.time);
    }


    @Override
    public void onClick(View v) {

        Bundle b = new Bundle();
        b.putString("rideId", rideId.getText().toString());

    }
}
