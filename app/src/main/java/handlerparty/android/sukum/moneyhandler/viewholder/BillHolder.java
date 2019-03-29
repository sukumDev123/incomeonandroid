package handlerparty.android.sukum.moneyhandler.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import handlerparty.android.sukum.moneyhandler.R;

public class BillHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView detail;
    private TextView price;
    private Button priceBtn;

    public BillHolder(View view) {
        super(view);
        this.title = view.findViewById(R.id.titleBill);
        this.detail = view.findViewById(R.id.detailBill);
        this.price = view.findViewById(R.id.priceBill);
        this.priceBtn = view.findViewById(R.id.priceBtn);
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setDetail(String detail) {
        this.detail.setText(detail);
    }

    public void setPrice(String price) {
        this.price.setText(price);
    }

    public void setPriceBtn(String priceBtn) {
        this.priceBtn.setText(priceBtn);
    }


}
