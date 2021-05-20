package ProjSubmitSystem.beans;

public class ScBean {
    private String scno;
    private String scname;

    public ScBean() { }

    public ScBean(String scno, String scname) {
        this.scno = scno;
        this.scname = scname;
    }

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }
}
