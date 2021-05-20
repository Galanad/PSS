package ProjSubmitSystem.beans;

import java.text.DecimalFormat;

public class TchBean {
    private String tno;
    private String cno;

    public TchBean() { }

    public TchBean(String tno, String cno) {
        this.tno = tno;
        this.cno = cno;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }
}
