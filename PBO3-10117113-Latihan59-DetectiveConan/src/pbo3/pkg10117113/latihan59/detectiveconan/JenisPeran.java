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
public class JenisPeran extends DetectiveConan{
    protected String peran;

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    @Override
    public void tampilTokoh() {
        System.out.println("Jenis Peran = "+getPeran());
    }
}
