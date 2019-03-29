package handlerparty.android.sukum.moneyhandler.model;

public class BillModel {
    private String title;
    private String detail;
    private float price;
    private float priceBtn;

    public BillModel(String title, String detail, float price, float priceBtn) {
        this.title = title;
        this.detail = detail;
        this.price = price;
        this.priceBtn = priceBtn;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPriceBtn() {
        return priceBtn;
    }

    public void setPriceBtn(float priceBtn) {
        this.priceBtn = priceBtn;
    }
}
