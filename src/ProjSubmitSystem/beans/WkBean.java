package ProjSubmitSystem.beans;

import java.math.BigDecimal;

public class WkBean {
    private String wno;
    private String pno;
    private String sno;
    private BigDecimal score;
    private String wurl;

    public WkBean() { }

    public WkBean(String wno, String pno, String sno, BigDecimal score, String wurl) {
        this.wno = wno;
        this.pno = pno;
        this.sno = sno;
        this.score = score;
        this.wurl = wurl;
    }

    public String getWno() {
        return wno;
    }

    public void setWno(String wno) {
        this.wno = wno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getWurl() {
        return wurl;
    }

    public void setWurl(String wurl) {
        this.wurl = wurl;
    }
}
