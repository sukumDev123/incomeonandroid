package handlerparty.android.sukum.moneyhandler.views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import handlerparty.android.sukum.moneyhandler.R;
import handlerparty.android.sukum.moneyhandler.adpter.BillAdpter;
import handlerparty.android.sukum.moneyhandler.model.BillModel;


public class BillFragment extends Fragment {

    public static BillFragment newInstance() {
        BillFragment fragment = new BillFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Bill");
        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerViewBill);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
//
        BillAdpter mAdapter = new BillAdpter(getContext() , initPlayer());
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<BillModel> initPlayer() {
        List<BillModel> bills = new ArrayList<>();
        BillModel bill1 = new BillModel("Netflix" , "Netflix is most popular for view content movies or series." , 450f  , 450f);
        BillModel bill2 = new BillModel("True Move" , "True Move is service internet on mobile give me internet speed 4 mbps . This bill will has been every month." , 361f  , 361f);
        bills.add(bill1);
        bills.add(bill2);
        return  bills;



    }
}
