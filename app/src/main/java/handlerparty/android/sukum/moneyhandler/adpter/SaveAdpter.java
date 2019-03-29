package handlerparty.android.sukum.moneyhandler.adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import handlerparty.android.sukum.moneyhandler.R;
import handlerparty.android.sukum.moneyhandler.model.SaveModel;
import handlerparty.android.sukum.moneyhandler.viewholder.SaveHolder;

public class SaveAdpter extends RecyclerView.Adapter<SaveHolder> {
    private List<SaveModel> saveData;
    private Context mContext;
    public SaveAdpter(Context context) {
        this.mContext = context;
    }
    @NonNull
    @Override
    public SaveHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.card_view_show_save, viewGroup, false);

        SaveHolder viewHolder = new SaveHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SaveHolder saveHolder, int i) {
        SaveModel saveModel = this.saveData.get(i);
        if(saveModel.getTitle() != null) {
            saveHolder.setTitle(saveModel.getTitle());
            saveHolder.setDetail(saveModel.getDetail());
            saveHolder.setPoint(saveModel.getPoint() + ""); ;
            saveHolder.setNowHave(saveModel.getNowHave() + "");
        }
    }

    @Override
    public int getItemCount() {
        return this.saveData.size();
    }

    public void setValue(List<SaveModel> saveDatas) {
        this.saveData = saveDatas;
    }
}
