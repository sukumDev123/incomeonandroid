package handlerparty.android.sukum.moneyhandler.model;

public class SaveModel {
    private String title;
    private  String detail;
    private float point;
    private float nowHave;

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

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getNowHave() {
        return nowHave;
    }

    public void setNowHave(float nowHave) {
        this.nowHave = nowHave;
    }

    public SaveModel(String title, String detail , float point , float nowHave ){
        this.title = title ;
        this.detail = detail ;
        this.point = point;
        this.nowHave = nowHave;
    }
}
