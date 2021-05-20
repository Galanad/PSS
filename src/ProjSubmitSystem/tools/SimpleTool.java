package ProjSubmitSystem.tools;

import ProjSubmitSystem.beans.*;
import ProjSubmitSystem.dao.BookDao;
import ProjSubmitSystem.dao.StuDao;
import ProjSubmitSystem.dao.TchrDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

import java.util.List;
import java.util.Optional;

public class SimpleTool {

    private String sql;


    public SimpleTool() {
    }

    /**
     * 操作结果：JavaFX判断是否为空
     *
     * @param str 文本
     * @return boolean 如果不为空返回true，否则返回false
     */
    public boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    /**
     * 操作结果：自定义一个JavaFX的对话框
     *
     * @param alterType 对话框类型
     * @param title     对话框标题
     * @param header    对话框头信息
     * @param message   对话框显示内容
     * @return boolean 如果点击了”确定“那么就返回true，否则返回false
     */
    public boolean informationDialog(Alert.AlertType alterType, String title, String header, String message) {
        // 按钮部分可以使用预设的也可以像这样自己 new 一个
        Alert alert = new Alert(alterType, message, new ButtonType("取消", ButtonBar.ButtonData.CANCEL_CLOSE), new ButtonType("确定", ButtonBar.ButtonData.YES));
        // 设置对话框的标题
        alert.setTitle(title);
        alert.setHeaderText(header);
        // showAndWait() 将在对话框消失以前不会执行之后的代码
        Optional<ButtonType> buttonType = alert.showAndWait();
        // 根据点击结果返回，如果点击了“确定”就返回true
        return buttonType.get().getButtonData().equals(ButtonBar.ButtonData.YES);
    }

    /**
     * 操作结果：JavaFX判断是否登录成功
     *
     * @param userIdTextField 用户名文本框
     * @param passwordTextField 密码文本框
     * @return boolean 如果登录成功返回true，否则返回false
     */
    public boolean isLogIn(TextInputControl userIdTextField, TextInputControl passwordTextField, String userType) {

        SimpleTool simpleTool = new SimpleTool();

        String DaoId = null;    // 识别用户类别，确定连接的数据库

        String id = null;
        String name = null;
        String password = null;

        if (userType.equals("学生")) {    //比对学生表
            DaoId = "StuDao";
            String sql = "select sno, sname, scode  from "+ DaoId +" where sno = "+ userIdTextField.getText();
            StuDao stuDao = new StuDao();
            List list = stuDao.getRecordsDataBySql(sql);
            StuBean stuBean = (StuBean) list;

            id = stuBean.getScno();
            password = stuBean.getScode();

            if(!userIdTextField.getText().equals(name)) {
                simpleTool.informationDialog(Alert.AlertType.WARNING, "提示", "警告", "用户名不正确！");
                return false;
            }
            if(!passwordTextField.getText().equals(password)) {
                simpleTool.informationDialog(Alert.AlertType.WARNING, "提示", "警告", "密码不正确！");
                return false;
            }
            if (!userIdTextField.getText().equals(name) && !passwordTextField.getText().equals(password)) {
                simpleTool.informationDialog(Alert.AlertType.ERROR, "提示", "错误", "用户名和密码均不正确！");
                return false;
            }
            if (userIdTextField.getText().equals(name) && passwordTextField.getText().equals(password))
                return simpleTool.informationDialog(Alert.AlertType.INFORMATION, "提示", "信息", "登录成功！");
        }
        else if (userType.equals("老师") || userType.equals("管理员")){
            DaoId = "TchrDao";
            String sql = "select tno, tname, tcode  from "+ DaoId +" where tno = "+ userIdTextField.getText();
            TchrDao tchrDao = new TchrDao();
            List list = tchrDao.getRecordsDataBySql(sql);
            TchrBean tchrBean = (TchrBean) list;

            id = tchrBean.getTno();
            name = tchrBean.getTname();
            password = tchrBean.getTcode();

            if(!userIdTextField.getText().equals(name)) {
                simpleTool.informationDialog(Alert.AlertType.WARNING, "提示", "警告", "用户名不正确！");
                return false;
            }
            if(!passwordTextField.getText().equals(password)) {
                simpleTool.informationDialog(Alert.AlertType.WARNING, "提示", "警告", "密码不正确！");
                return false;
            }
            if (!userIdTextField.getText().equals(name) && !passwordTextField.getText().equals(password)) {
                simpleTool.informationDialog(Alert.AlertType.ERROR, "提示", "错误", "用户名和密码均不正确！");
                return false;
            }
            if (userIdTextField.getText().equals(name) && passwordTextField.getText().equals(password))
                return simpleTool.informationDialog(Alert.AlertType.INFORMATION, "提示", "信息", "登录成功！");
        }
        else
        {
            System.out.println("未选择用户类别！");
            return false;
        }
        return true;
    }

    /**
     * 通过SQL从数据库表中查询图书数据并进行封装
     *
     * @param sql SQL语句
     * @return 返回ObservableList<BookBeanTableData>类型的数据
     */
    public ObservableList<BookBeanTableData> getBookTableViewData(String sql) {
        BookDao bookDao = new BookDao();
        List list = bookDao.getRecordsDataBySql(sql);
        ObservableList<BookBeanTableData> data = FXCollections.observableArrayList();
        for (int i = 0; i < list.size(); i++) {
            BookBean r = (BookBean) list.get(i);
            BookBeanTableData td = new BookBeanTableData(String.valueOf(r.getBookId()), r.getBookName(), r.getBookAuthor(), r.getBookAuthorSex(), String.valueOf(r.getBookPrice()), r.getBookDescription(), String.valueOf(r.getBookTypeId()));
            data.add(td);
        }
        return data;
    }

    /**
     * 将数据显示在学生表格中
     *
     * @param tableView         表格视图控件
     * @param data              要显示要表格上的数据
     * @param snoColumn         学号表格列控件
     * @param snameColumn       学生姓名表格列控件
     * @param scnoColumn        班级号表格列控件
     * @param semailColumn      学生邮箱表格列控件
     */
    public void setStuTableViewData(TableView tableView, ObservableList data,
                                    TableColumn<StuBeanTableData, String> snoColumn,
                                    TableColumn<StuBeanTableData, String> snameColumn,
                                    TableColumn<StuBeanTableData, String> scnoColumn,
                                    TableColumn<StuBeanTableData, String> semailColumn,
                                    TableColumn<StuBeanTableData, String> descriptionColumn,
                                    TableColumn<StuBeanTableData, String> typeColumn) {
        // 设置学号列的数据
        snoColumn.setCellValueFactory(cellData -> cellData.getValue().snoProperty());
        // 设置学生姓名称列的数据
        snameColumn.setCellValueFactory(cellData -> cellData.getValue().snameProperty());
        // 设置班级号列的数据
        scnoColumn.setCellValueFactory(cellData -> cellData.getValue().scnoProperty());
        // 设置学生邮箱列的数据
        semailColumn.setCellValueFactory(cellData -> cellData.getValue().semailProperty());
        // 将数据设置到表格视图
        tableView.setItems(data);
    }

    /**
     * 通过SQL从数据库表中查询图书数据并进行封装
     *
     * @param sql SQL语句
     * @return 返回ObservableList<StuBeanTableData>类型的数据
     */
    public ObservableList<StuBeanTableData> getStuTableViewData(String sql) {
        // 实例化StuDao
        StuDao stuDao = new StuDao();
        // 查询学生表的所有数据
        List list = stuDao.getRecordsDataBySql(sql);
        // 创建ObservableList<StuBeanTableData>对象
        ObservableList<StuBeanTableData> data = FXCollections.observableArrayList();
        for (Object o : list) {
            // 循环遍历集合中的数据
            StuBean r = (StuBean) o;
            // 将数据封装到BookTypeBeanTableData中
            StuBeanTableData td = new StuBeanTableData(r.getSno(),
                    r.getSname(),
                    r.getScno(),
                    r.getScode(),
                    r.getSemail());
            // 将BookTypeBeanTableData对象添加到data中
            data.add(td);
        }
        // 返回数据
        return data;
    }

}