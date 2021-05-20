package ProjSubmitSystem.beans;

public class AdBean {
    private String adno;
    private String sno;
    private String tno;
    private String adcont;

    public AdBean() { }

    public AdBean(String adno, String sno, String tno, String adcont) {
        this.adno = adno;
        this.sno = sno;
        this.tno = tno;
        this.adcont = adcont;
    }

    public String getAdno() {
        return adno;
    }

    public void setAdno(String adno) {
        this.adno = adno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getAdcont() {
        return adcont;
    }

    public void setAdcont(String adcont) {
        this.adcont = adcont;
    }
}
