package ProjSubmitSystem.Test;

import ProjSubmitSystem.beans.StuBean;
import ProjSubmitSystem.dao.StuDao;

import java.util.List;

public class SqlQueryTest {
    public static void main (String[] args) throws Exception{
        StuDao stuDao = new StuDao();
        String sql = "select * from stu where sno = 18152001001";
        List list = stuDao.getRecordsDataBySql(sql);
        for (Object o : list) {
            StuBean stuBean = (StuBean) o;
            System.out.println(stuBean.getSno());
            System.out.println(stuBean.getSname());
            System.out.println(stuBean.getScode());
        }
        System.out.println("hello world");
    }
}
