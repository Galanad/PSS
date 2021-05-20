package ProjSubmitSystem.beans;

public class AssignBean {
    private String cno;
    private String pno;

    public AssignBean() { }

    public AssignBean(String cno, String pno) {
        this.cno = cno;
        this.pno = pno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }
}
