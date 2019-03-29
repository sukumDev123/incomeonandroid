package handlerparty.android.sukum.moneyhandler.views;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


import handlerparty.android.sukum.moneyhandler.R;
import handlerparty.android.sukum.moneyhandler.adpter.IncomeAdpter;
import handlerparty.android.sukum.moneyhandler.model.IncomeModel;

public class IncomeListFragment extends Fragment {
    public RecyclerView mRecyclerView;
    public LinearLayoutManager mLayoutManager;
    public IncomeAdpter mAdapter;

    public static IncomeListFragment newInstance() {
        return new IncomeListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_income_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new IncomeAdpter(getContext());
        mAdapter.setOutComes(initPlayer());
        mRecyclerView.setAdapter(mAdapter);
    }


    private List<IncomeModel> initPlayer() {
        List<IncomeModel> dataset = new ArrayList<>();
        String[] type = {"รายรับ"  , "รายจ่าย"};
        IncomeModel messi = new IncomeModel(2000,   type[0] , "เงินเดือน" , "18/01/2561");
        IncomeModel messi2 = new IncomeModel(500.00f,   type[1] , "กินข้าว" , "19/01/2561");

        dataset.add(messi);
        dataset.add(messi2);

        return dataset;
    }
}
