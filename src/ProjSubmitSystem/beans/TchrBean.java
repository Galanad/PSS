package ProjSubmitSystem.beans;

public class TchrBean {
    private String tno;
    private String tname;
    private String tpro;
    private String tcode;
    private String temail;

    public TchrBean() { }
    public TchrBean(String tno, String tname, String tcno, String tcode, String temail) {
        this.tno = tno;
        this.tname = tname;
        this.tpro = tcno;
        this.tcode = tcode;
        this.temail = temail;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpro() {
        return tpro;
    }

    public void setTpro(String tpro) {
        this.tpro = tpro;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }
}
