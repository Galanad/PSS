package ProjSubmitSystem.beans;

import java.math.BigDecimal;

public class ElecBean {
    private String sno;
    private String cno;
    private int rc;
    private BigDecimal score;

    public ElecBean() { }

    public ElecBean(String sno, String cno, int rc, BigDecimal score) {
        this.sno = sno;
        this.cno = cno;
        this.rc = rc;
        this.score = score;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
