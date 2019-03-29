package handlerparty.android.sukum.moneyhandler.views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import handlerparty.android.sukum.moneyhandler.R;

public class HomePageFragment extends Fragment {
//    private HomePageViewModel mViewModel;
    public Spinner day_s;
    public Spinner month_s;
    public static HomePageFragment newInstance() {
        return new HomePageFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_page_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addOrderFragment();
        handlerArrSpinner(view);
        getActivity().setTitle("Home Income");
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = ViewModelProviders.of(this).get(HomePageViewModel.class);
//        // TODO: Use the ViewModel
//    }
    private void handlerArrSpinner(View view) {
        ArrayList<String> day_sArr = setDay();
        ArrayList<String> month_sArr = setMonth();
        day_s = view.findViewById(R.id.day_sp);
        month_s = view.findViewById(R.id.month_sp);
        ArrayAdapter<String> dayArrAd = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, day_sArr);
        day_s.setAdapter(dayArrAd);

        //
        ArrayAdapter<String> monthArrAd = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, month_sArr);
        month_s.setAdapter(monthArrAd);


    }

    private ArrayList<String> setDay() {
        ArrayList<String> day_sArr = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            day_sArr.add("" + (i + 1));
        }
        return day_sArr;
    }

    private ArrayList<String> setMonth() {
        ArrayList<String> day_sArr = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            day_sArr.add("" + (i + 1));
        }
        return day_sArr;
    }

    private void addOrderFragment() {

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.layout_fragment_container, IncomeListFragment.newInstance())
                .commit();
    }

}
