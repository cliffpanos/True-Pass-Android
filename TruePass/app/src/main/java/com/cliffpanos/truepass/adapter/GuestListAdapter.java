package com.cliffpanos.truepass.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cliffpanos.truepass.activity.GuestPassDetailActivity;
import com.cliffpanos.truepass.object.Guest;
import com.cliffpanos.truepass.R;

import java.util.List;
import java.util.Locale;

public class GuestListAdapter extends RecyclerView.Adapter<GuestListAdapter.GuestListViewHolder> {

    private Context context;
    private List<Guest> guestList;

    public GuestListAdapter(Context context, List<Guest> guestList) {
        this.context = context;
        this.guestList = guestList;
    }

    @Override
    public GuestListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.guest_passes_row, parent, false);
        return new GuestListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GuestListViewHolder viewHolder, int position) {
        Guest guest = guestList.get(position);
        viewHolder.guestName.setText(guest.getGuestName());
        viewHolder.guestImage.setImageBitmap(guest.getGuestImage());
        String dateText = String.format(Locale.getDefault(), "%d", guest.getGuestPassDateCreated());
        viewHolder.guestPassDateCreated.setText(dateText);
    }

    @Override
    public int getItemCount() {
        return guestList.size();
    }


    public class GuestListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public View view;
        public TextView guestName;
        public ImageView guestImage;
        public TextView guestPassDateCreated;

        public GuestListViewHolder(View view) {
            super(view);
            this.view = view;
            guestName = (TextView) view.findViewById(R.id.guest_name);
            guestImage = (ImageView) view.findViewById(R.id.guest_image);
            guestPassDateCreated = (TextView) view.findViewById(R.id.guest_pass_date_created);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == view.getId()) {
                int position = getAdapterPosition();
                Guest selectedGuest = guestList.get(position);
                Intent intent = new Intent(context, GuestPassDetailActivity.class);
                // TODO: Get unique guest identifier in order to get correct data on next page
                context.startActivity(intent);
            }
        }

    }
}
