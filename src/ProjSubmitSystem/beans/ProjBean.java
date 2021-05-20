package ProjSubmitSystem.beans;

import java.util.Date;

public class ProjBean {
    private String pno;
    private String pname;
    private String cno;
    private String purl;
    private String pdmd;
    private int pa;
    private Date pddl;

    public ProjBean() {    }

    public ProjBean(String pno, String pname, String cno, String purl, String pdmd, int pa, Date pddl) {
        this.pno = pno;
        this.pname = pname;
        this.cno = cno;
        this.purl = purl;
        this.pdmd = pdmd;
        this.pa = pa;
        this.pddl = pddl;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getPdmd() {
        return pdmd;
    }

    public void setPdmd(String pdmd) {
        this.pdmd = pdmd;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public Date getPddl() {
        return pddl;
    }

    public void setPddl(Date pddl) {
        this.pddl = pddl;
    }
}
