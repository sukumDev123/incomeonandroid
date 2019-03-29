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
import handlerparty.android.sukum.moneyhandler.adpter.SaveAdpter;
import handlerparty.android.sukum.moneyhandler.model.SaveModel;


public class SaveFragment extends Fragment {

    public RecyclerView mRecyclerView;




    // TODO: Rename and change types and number of parameters
    public static SaveFragment newInstance() {

        return new SaveFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_save_list, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("เงินออม");
        mRecyclerView = view.findViewById(R.id.recyclerViewList);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
//
        SaveAdpter mAdapter = new SaveAdpter(getContext());
        mAdapter.setValue(initPlayer());
        mRecyclerView.setAdapter(mAdapter);
    }
    private List<SaveModel> initPlayer() {
        List<SaveModel> saveDatas = new ArrayList<>();
        SaveModel saveModel1 = new SaveModel("Air Max" , "Air Max 97" , 6700f , 50f);
        SaveModel saveModel2 = new SaveModel("S" , "S" , 5700f , 50f);
        saveDatas.add(saveModel1);
        saveDatas.add(saveModel2);
        return saveDatas;
    }
}
