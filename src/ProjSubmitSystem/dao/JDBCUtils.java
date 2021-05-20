package ProjSubmitSystem.dao;

import java.sql.*;

/**
 * 杩炴帴JDBC绫�
 * @author lck100
 */
public class JDBCUtils {
    //鍔犺浇椹卞姩锛屽苟寤虹珛鏁版嵁搴撹繛鎺�

    /**
     * 鍔犺浇椹卞姩寤虹珛鏁版嵁搴撻摼鎺�
     *
     * @return 杩斿洖鏁版嵁搴揅onnection杩炴帴瀵硅薄
     * @throws SQLException           鎶涘嚭SQLException
     * @throws ClassNotFoundException 鎶涘嚭ClassNotFoundException
     */
    static Connection getConnection() throws SQLException, ClassNotFoundException {
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String username = "sua";
        String password = "123";
        String url = "jdbc:sqlserver://localhost;databaseName=PSS";
    	
        // 鑾峰彇鏁版嵁搴撹繛鎺ュ璞″苟杩斿洖Connection瀵硅薄
        return DriverManager.getConnection(url, username, password);
    }

    /**
     * 鍏抽棴鏁版嵁搴撹繛鎺ワ紝閲婃斁璧勬簮
     *
     * @param stmt Statement瀵硅薄
     * @param conn Connection瀵硅薄
     */
    static void release(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }
    }

    /**
     * 鍏抽棴鏁版嵁搴撹繛鎺ワ紝閲婃斁璧勬簮
     *
     * @param rs   ResultSet瀵硅薄
     * @param stmt Statement瀵硅薄
     * @param conn Connection瀵硅薄
     */
    public static void release(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(stmt, conn);
    }

}
