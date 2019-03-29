package handlerparty.android.sukum.moneyhandler.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import handlerparty.android.sukum.moneyhandler.R;

public class SaveHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView detail;
    private TextView point;
    private TextView nowHave;

    public SaveHolder(View view) {
        super(view);
        this.title = view.findViewById(R.id.titleSave);
        this.detail = view.findViewById(R.id.detailSave);
        this.point = view.findViewById(R.id.pointSave);
        this.nowHave = view.findViewById(R.id.nowHaveSave);

    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setDetail(String detail) {
        this.detail.setText(detail);
    }

    public void setPoint(String point) {
        this.point.setText(point);
    }

    public void setNowHave(String nowHave) {
        this.nowHave.setText(nowHave);
    }
}
