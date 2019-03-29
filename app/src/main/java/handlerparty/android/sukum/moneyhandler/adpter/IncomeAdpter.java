package handlerparty.android.sukum.moneyhandler.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import handlerparty.android.sukum.moneyhandler.R;
import handlerparty.android.sukum.moneyhandler.model.IncomeModel;
import handlerparty.android.sukum.moneyhandler.viewholder.ViewHolder1;

public class IncomeAdpter extends RecyclerView.Adapter<ViewHolder1> {
    private List<IncomeModel> outComes;
    private Context mContext;

    public IncomeAdpter(Context context) {
        mContext = context;
    }

    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.card_view_income, parent, false);

        ViewHolder1 viewHolder = new ViewHolder1(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder1 holder, int position) {
//        if (this.outComes.isEmpty() == false) {
            IncomeModel incomeModel = outComes.get(position);
            if (incomeModel.getType() != null) {
                holder.setPrice1(incomeModel.getMoney());
                holder.setTitle1(incomeModel.getType());
                holder.setDetail1(incomeModel.getDetail());
                holder.setDateIs(incomeModel.getDateIs());
            }
//        }
    }

    @Override
    public int getItemCount() {
        return this.outComes.size();

    }

    public void setOutComes(List<IncomeModel> outComes) {
        this.outComes = outComes;

    }
}
