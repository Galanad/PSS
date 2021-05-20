package ProjSubmitSystem.beans;

import javafx.beans.property.SimpleStringProperty;

public class StuBeanTableData {
    private SimpleStringProperty sno;   //
    private SimpleStringProperty sname;
    private SimpleStringProperty scno;
    private SimpleStringProperty semail;

    public StuBeanTableData() {}

    public StuBeanTableData(String sno, String sname, String scno, String scode, String semail){
        this.sno = new SimpleStringProperty(sno);
        this.sname = new SimpleStringProperty(sname);
        this.scno = new SimpleStringProperty(scno);
        this.semail = new SimpleStringProperty(semail);
    }

    public String getSno() {
        return sno.get();
    }

    public SimpleStringProperty snoProperty() {
        return sno;
    }

    public String getSname() {
        return sname.get();
    }

    public SimpleStringProperty snameProperty() {
        return sname;
    }

    public String getScno() {
        return scno.get();
    }

    public SimpleStringProperty scnoProperty() {
        return scno;
    }

    public String getSemail() {
        return semail.get();
    }

    public SimpleStringProperty semailProperty() {
        return semail;
    }
}
