package handlerparty.android.sukum.moneyhandler.adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import handlerparty.android.sukum.moneyhandler.R;
import handlerparty.android.sukum.moneyhandler.model.BillModel;
import handlerparty.android.sukum.moneyhandler.viewholder.BillHolder;

public class BillAdpter extends RecyclerView.Adapter<BillHolder> {

    private Context myContext;
    private List<BillModel> bills;

    public BillAdpter(Context c ,  List<BillModel> billDs) {
        bills = billDs;
        myContext = c;
    }
    @NonNull
    @Override
    public BillHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(myContext)
                .inflate(R.layout.card_view_show_bill, viewGroup, false);

        BillHolder viewHolder = new BillHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BillHolder billHolder, int i) {
        BillModel bill = bills.get(i);
        if(bill.getTitle() != null) {
            billHolder.setTitle(bill.getTitle());
            billHolder.setDetail(bill.getDetail());
            billHolder.setPrice(bill.getPrice() + "");
            billHolder.setPriceBtn(bill.getPriceBtn() + "");
        }
    }

    @Override
    public int getItemCount() {
        return this.bills.size();
    }

    public void setValue(List<BillModel> billDs) {
        bills = billDs;
    }
}
