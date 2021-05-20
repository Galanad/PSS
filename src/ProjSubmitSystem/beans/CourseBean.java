package ProjSubmitSystem.beans;

public class CourseBean {
    private String cno;
    private String cname;
    private String cyear;
    private int cterm;
    private String scno;
    private int snum;

    public CourseBean() { }

    public CourseBean(String cno, String cname, String cyear, int cterm, String scno, int snum) {
        this.cno = cno;
        this.cname = cname;
        this.cyear = cyear;
        this.cterm = cterm;
        this.scno = scno;
        this.snum = snum;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCyear() {
        return cyear;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear;
    }

    public int getCterm() {
        return cterm;
    }

    public void setCterm(int cterm) {
        this.cterm = cterm;
    }

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }
}
