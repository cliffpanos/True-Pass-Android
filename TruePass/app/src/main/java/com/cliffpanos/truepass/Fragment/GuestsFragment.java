package com.cliffpanos.truepass.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cliffpanos.truepass.adapter.GuestListAdapter;
import com.cliffpanos.truepass.object.Guest;
import com.cliffpanos.truepass.R;

import java.util.ArrayList;
import java.util.List;

public class GuestsFragment extends Fragment {

    private List<Guest> guestList;
    private RecyclerView recyclerView;
    private GuestListAdapter guestListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guest_passes_fragment, container, false);

        guestList = new ArrayList<>();

        recyclerView = (RecyclerView) view.findViewById(R.id.guest_passes_recycler_view);
        guestListAdapter = new GuestListAdapter(getActivity(), guestList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(guestListAdapter);

        prepareDummyGuestPassList();

        return view;
    }

    public void prepareDummyGuestPassList() {
        Bitmap dummyImage1 = BitmapFactory.decodeResource(getResources(), R.drawable.account_icon);

        Guest rahul = new Guest("Rahul Raina", dummyImage1, 20170802);
        Guest cliff = new Guest("Cliff Panos", dummyImage1, 20170802);
        Guest jerome = new Guest("Jerome Jackson", dummyImage1, 20170802);
        Guest wade = new Guest("Dwyane Wade", dummyImage1, 20170802);

        guestList.add(rahul);
        guestList.add(cliff);
        guestList.add(jerome);
        guestList.add(wade);
        guestList.add(wade);
        guestList.add(wade);
        guestList.add(wade);

        guestListAdapter.notifyDataSetChanged();
    }
}
