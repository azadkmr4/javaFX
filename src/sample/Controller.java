package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    @FXML
    TextField text1;// same name that is declared in id(sample).
    @FXML
    public void ButtonEvent(ActionEvent obj) throws ClassNotFoundException,SQLException{
        System.out.println("button clicked");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");

        Statement statement=con.createStatement();
        statement.executeUpdate("insert into student values(4,'"+text1.getText()+"')");
        con.close();
        //System.out.println(text1.getText());
    }
}
