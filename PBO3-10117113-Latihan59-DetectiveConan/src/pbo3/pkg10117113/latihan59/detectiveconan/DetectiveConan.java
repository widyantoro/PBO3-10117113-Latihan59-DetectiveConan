/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan59.detectiveconan;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan Daftar Nama Tokoh Anime Detective Conan
 *              
 *            
 */
public class DetectiveConan {
    protected String tokoh;

    public String getTokoh() {
        return tokoh;
    }

    public void setTokoh(String tokoh) {
        this.tokoh = tokoh;
    }
    
    public void tampilTokoh(){
        System.out.println("Nama Tokoh  = "+getTokoh());
          
    } 
}
