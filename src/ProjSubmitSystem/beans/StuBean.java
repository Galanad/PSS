package ProjSubmitSystem.beans;

public class StuBean {
    private String sno;
    private String sname;
    private String scno;
    private String scode;
    private String semail;

    public StuBean(){ }

    public StuBean(String sno, String sname, String scno, String scode, String semail){
        this.sno = sno;
        this.sname = sname;
        this.scno = scno;
        this.scode = scode;
        this.semail = semail;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }
}
