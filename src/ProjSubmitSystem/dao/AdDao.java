package ProjSubmitSystem.dao;

import ProjSubmitSystem.beans.AdBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdDao {
    private Connection conn = null;
    private Statement stmt = null;
    /**
     * 操作结果：根据SQL语句执行数据库的增删改操作
     *
     * @param sql SQL语句
     * @return boolean 如果操作数据库成功返回true，否则返回false
     */
    public boolean dataChange(String sql) {
        try {
            //获得数据的连接
            conn = JDBCUtils.getConnection();
            //获得Statement对象
            stmt = conn.createStatement();
            //发送SQL语句
            int num = stmt.executeUpdate(sql);
            return num > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(stmt, conn);
        }
        return false;
    }
    /**
     * 操作结果：根据参数sql获取数据库记录数据
     *
     * @param sql SQL语句
     * @return List 返回包含记录Records对象的集合
     */
    public List getRecordsDataBySql(String sql) {
        ResultSet rs = null;
        List list = new ArrayList();
        try {
            //获得数据的连接
            conn = JDBCUtils.getConnection();
            //获得Statement对象
            stmt = conn.createStatement();
            //发送SQL语句
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                AdBean adBean = new AdBean();
                // 索引是从1开始的
                adBean.setAdno(rs.getString(1));
                adBean.setSno(rs.getString(2));
                adBean.setTno(rs.getString(3));
                adBean.setAdcont(rs.getString(4));
                list.add(adBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return list;
    }
}
