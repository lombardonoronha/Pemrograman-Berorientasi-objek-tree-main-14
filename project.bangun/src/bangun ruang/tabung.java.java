/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author Cracker
 */
public class Tabung extends BangunRuang{
    
    public double jari;
    public double tinggi;
    
    public double hitungVolume() {
        double volume = 3.14 * this.jari * this.jari * tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        double luas = 2 * 3.14 * jari + (jari + tinggi);
        return luas;
    }
}