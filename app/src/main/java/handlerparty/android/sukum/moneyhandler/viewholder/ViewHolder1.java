package handlerparty.android.sukum.moneyhandler.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import handlerparty.android.sukum.moneyhandler.R;

public  class ViewHolder1 extends RecyclerView.ViewHolder {
    public TextView title1;
    public TextView price1;
    public TextView detail1;
    public TextView dateIs1;
    public ViewHolder1(View view) {
        super(view);
        this.title1 = (TextView) view.findViewById(R.id.title1);
        this.price1 = (TextView) view.findViewById(R.id.price1);
        this.detail1 = (TextView) view.findViewById(R.id.detail1);
        this.dateIs1 = view.findViewById(R.id.dateIs1);
    }
    public void setTitle1(String tital1) {
        this.title1.setText(tital1);
    }
    public void setPrice1(float price1) {
        this.price1.setText(String.format("%10.2f บาท", price1));
    }
    public void setDetail1(String detail1) {
        this.detail1.setText(detail1);
    }
    public void setDateIs(String dateIs){
        this.dateIs1.setText(dateIs);
    }
}
