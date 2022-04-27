/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMethod;
import java.util.Map;
/**
 *
 * @author PIPHAT
 */
public class ItemObject <String,Integer> implements Map.Entry <String,Integer> {
    private final String Item;
    private int Rate;
    private String Id;
    private String Level;
    public  ItemObject (String Id,String Item,String Level,int Rate){
        this.Level = Level;
        this.Id = Id;
        this.Item = Item;
        this.Rate = Rate;
    }
    
    public String getLevel(){
        return Level;
    }
    
    public String getId(){
        return Id;
    }

    public String getItem() {
        return Item ;
    }

    public int getRate() {
        return Rate ;
    }

    @Override
    public String getKey() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer setValue(Integer value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
    
}
