package ProjSubmitSystem.beans;

public class SysnotBean {
    private String syntno;
    private String syntcont;

    public SysnotBean() { }

    public SysnotBean(String syntno, String syntcont) {
        this.syntno = syntno;
        this.syntcont = syntcont;
    }

    public String getSyntno() {
        return syntno;
    }

    public void setSyntno(String syntno) {
        this.syntno = syntno;
    }

    public String getSyntcont() {
        return syntcont;
    }

    public void setSyntcont(String syntcont) {
        this.syntcont = syntcont;
    }
}
