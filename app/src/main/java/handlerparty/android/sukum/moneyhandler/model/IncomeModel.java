package handlerparty.android.sukum.moneyhandler.model;


public class IncomeModel {
    private float money;
    private String type;
    private String detail;
    private String dateIs;



    public IncomeModel(float money , String type , String detail, String dateIs) {
        this.money = money;
        this.type = type;
        this.dateIs = dateIs;
        this.detail = detail;
    }


    public float getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateIs() {
        return dateIs;
    }

    public void setDateIs(String dateIs) {
        this.dateIs = dateIs;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
