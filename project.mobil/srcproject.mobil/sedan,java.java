/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMobil;

/**
 *
 * @author Cracker
 */
public class Sedan extends JenisMobil{
    
    private double jarak;
    private float kecepatan;
    
    public Sedan (double j, float k) {
        this.jarak = j;
        this.kecepatan = k;
    }
    
    public float hitungBensin() {
        float bensin = (float) jarak / 10;
        return bensin;
    }
    
    public float hitungWaktu() {
        float waktu = (float) jarak / kecepatan;
        return waktu;
    }
}