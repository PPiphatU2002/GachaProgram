package ClassMethod;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PIPHAT
 */
public class Method {
   private static DB_Con db = new DB_Con();
    public static int  get_money(String ID){
        String sql = String.format("Select user_money from user where user_id = '%s'",ID);
        try{
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) return rs.getInt(1);
            else return 0;
        }catch(Exception e){
            return 0;
        }
    }
    
    public static int  get_exchange(String ID){
        String sql = String.format("Select user_exchange from user where user_id = '%s'",ID);
        try{
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) return rs.getInt(1);
            else return 0;
        }catch(Exception e){
            return 0;
        }
    }
 //สุ่ม
public static ItemObject RandomItem(List<ItemObject> ItemList)  {
        double completeWeight = 0.0;
        for (ItemObject item : ItemList)
            completeWeight += item.getRate();
        double r = Math.random() * completeWeight;
        double countRate = 0.0;
        for (ItemObject item : ItemList) {
            countRate += item.getRate();
            if (countRate >= r)
                return item;
        }
        throw new RuntimeException("Should never be shown.");
    }
//เซ็ตไอเทม
    public static List<ItemObject>GetItem(String GachaID ){
        List<ItemObject> IO = new ArrayList();
        DB_Con db = new DB_Con();
        String sql =String.format("Select * from item where gacha_id = '%s'",GachaID);
        try{
            ResultSet rs = db.getResultSet(sql);
            while (rs.next()){
                IO.add(new ItemObject(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
            }
            return IO;
        }catch(Exception e){
            IO = null;
           e.printStackTrace();
            return IO;
        }
        
    
} 
}
