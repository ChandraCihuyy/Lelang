/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lelang;
import java.util.ArrayList;

/**
 *
 * @author SMK TELKOM 09
 */
public class Masyarakat {
   
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat(){
        addMasyarakat("?","?","?");
        addMasyarakat("Who","Where","086473858398");
        addMasyarakat("This","There","094758206461");
        addMasyarakat("he","idk","086473858398");
        addMasyarakat("her","?","094758206461");
    } 

    public void addMasyarakat(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

  
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
