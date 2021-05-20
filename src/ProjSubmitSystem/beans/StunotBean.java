package ProjSubmitSystem.beans;

public class StunotBean {
    private String stntno;
    private String tno;
    private String scno;
    private String stntcont;

    public StunotBean() { }

    public StunotBean(String stntno, String tno, String scno, String stntcont) {
        this.stntno = stntno;
        this.tno = tno;
        this.scno = scno;
        this.stntcont = stntcont;
    }

    public String getStntno() {
        return stntno;
    }

    public void setStntno(String stntno) {
        this.stntno = stntno;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }

    public String getStntcont() {
        return stntcont;
    }

    public void setStntcont(String stntcont) {
        this.stntcont = stntcont;
    }
}
