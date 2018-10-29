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
public class PBO310117113Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Daftar Tokoh Anime Detective Conan ===");
        System.out.println(" ");
        
        DetectiveConan dc = new DetectiveConan();
        dc.setTokoh("Conan");
        dc.tampilTokoh();
        JenisPeran jp = new JenisPeran();
        jp.setPeran("Tokoh Utama");
        jp.tampilTokoh();
        Pekerjaan job = new Pekerjaan();
        job.setPekerjaan("Detective");
        job.tampilTokoh();
        Keterangan ket = new Keterangan();
        ket.setKeterangan("Ia tinggal bersama Ran dan Kogoro Mouri, dan "
                          + "sekaligus mencari tahu tentang Organisasi Hitam.");
        ket.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc1 = new DetectiveConan();
        dc1.setTokoh("Ran Mauri");
        dc1.tampilTokoh();
        JenisPeran jp1 = new JenisPeran();
        jp1.setPeran("Tokoh Utama");
        jp1.tampilTokoh();
        Pekerjaan job1 = new Pekerjaan();
        job1.setPekerjaan("Siswi SMU/Teman Conan");
        job1.tampilTokoh();
        Keterangan ket1 = new Keterangan();
        ket1.setKeterangan("Ia selalu menunggu kepulangan Shinichi. "
                           + "Ran beberapa kali pernah mencurigai Conan yang "
                           + "identitasnya adalah Shinichi");                   
        ket1.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc2 = new DetectiveConan();
        dc2.setTokoh("Koguro Mouri");
        dc2.tampilTokoh();
        JenisPeran jp2 = new JenisPeran();
        jp2.setPeran("Tokoh Utama");
        jp2.tampilTokoh();
        Pekerjaan job2 = new Pekerjaan();
        job2.setPekerjaan("Detective");
        job2.tampilTokoh();
        Keterangan ket2 = new Keterangan();
        ket2.setKeterangan("Kogoro Mouri adalah ayahn Ran, bekerja "
                            + "sebagai Detektif. Tetapi, jika membuat "
                            + "analisis, pasti analisis "
                            + "asal-asalan");                   
        ket2.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc3 = new DetectiveConan();
        dc3.setTokoh("Sonoko Suzuki");
        dc3.tampilTokoh();
        JenisPeran jp3 = new JenisPeran();
        jp3.setPeran("Tokoh Pembantu");
        jp3.tampilTokoh();
        Pekerjaan job3 = new Pekerjaan();
        job3.setPekerjaan("Siswi SMU/Teman Ran");
        job3.tampilTokoh();
        Keterangan ket3 = new Keterangan();
        ket3.setKeterangan("Sonoko adalah teman sekelas Ran dan juga teman "
                           + "baiknya. Berasal dari keluarga kaya.");                   
        ket3.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc4 = new DetectiveConan();
        dc4.setTokoh("Heiji Hatori");
        dc4.tampilTokoh();
        JenisPeran jp4 = new JenisPeran();
        jp4.setPeran("Tokoh Pembantu");
        jp4.tampilTokoh();
        Pekerjaan job4 = new Pekerjaan();
        job4.setPekerjaan("Detective");
        job4.tampilTokoh();
        Keterangan ket4 = new Keterangan();
        ket4.setKeterangan("Detektif yang berasal dari barat yang merupakan "
                           + "saingan Shinichi.");                   
        ket4.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc5 = new DetectiveConan();
        dc5.setTokoh("Kazuha Tooyama");
        dc5.tampilTokoh();
        JenisPeran jp5 = new JenisPeran();
        jp5.setPeran("Tokoh Pembantu");
        jp5.tampilTokoh();
        Pekerjaan job5 = new Pekerjaan();
        job5.setPekerjaan("Siswi SMU");
        job5.tampilTokoh();
        Keterangan ket5 = new Keterangan();
        ket5.setKeterangan("Kazuha adalah teman semasa kecilnya Heiji yang "
                           + "menyukai Heiji. Jika Heiji muncul dalam cerita.");                   
        ket5.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc6 = new DetectiveConan();
        dc6.setTokoh("Eri Kisaki");
        dc6.tampilTokoh();
        JenisPeran jp6 = new JenisPeran();
        jp6.setPeran("Tokoh Pembantu");
        jp6.tampilTokoh();
        Pekerjaan job6 = new Pekerjaan();
        job6.setPekerjaan("Pengacara");
        job6.tampilTokoh();
        Keterangan ket6 = new Keterangan();
        ket6.setKeterangan("Ibu nya Ran dan juga istri Kogoro. Bekerja sebagai "
                            + "pengacara dan disebut sebagai Ratu Pengacara");                   
        ket6.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc7 = new DetectiveConan();
        dc7.setTokoh("Agasa Hiroshi");
        dc7.tampilTokoh();
        JenisPeran jp7 = new JenisPeran();
        jp7.setPeran("Tokoh Pembantu");
        jp7.tampilTokoh();
        Pekerjaan job7 = new Pekerjaan();
        job7.setPekerjaan("Profesor");
        job7.tampilTokoh();
        Keterangan ket7 = new Keterangan();
        ket7.setKeterangan("Professor yang rumahnya dekat dengan rumah Shinichi"
                            + "ia bertemu Shinichi yang tubuhnya kecil");                   
        ket7.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc8 = new DetectiveConan();
        dc8.setTokoh("Ayumi Yoshida");
        dc8.tampilTokoh();
        JenisPeran jp8 = new JenisPeran();
        jp8.setPeran("Tokoh Pembantu");
        jp8.tampilTokoh();
        Pekerjaan job8 = new Pekerjaan();
        job8.setPekerjaan("Detective Cilik");
        job8.tampilTokoh();
        Keterangan ket8 = new Keterangan();
        ket8.setKeterangan("Teman Conan yang juga menyukai Conan. Ia memiliki "
                            + "sifat yang periang dan baik hati.");                   
        ket8.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc9 = new DetectiveConan();
        dc9.setTokoh("Ai Haibara");
        dc9.tampilTokoh();
        JenisPeran jp9 = new JenisPeran();
        jp9.setPeran("Tokoh Pembantu");
        jp9.tampilTokoh();
        Pekerjaan job9 = new Pekerjaan();
        job9.setPekerjaan("Detective Cilik");
        job9.tampilTokoh();
        Keterangan ket9 = new Keterangan();
        ket9.setKeterangan("Ai sebenarnya bukan anak yang berumur 7 tahun "
                           + "biasa sama seperti Conan.");                   
        ket9.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc10 = new DetectiveConan();
        dc10.setTokoh("Mitsuhiko Tsuburaya");
        dc10.tampilTokoh();
        JenisPeran jp10 = new JenisPeran();
        jp10.setPeran("Tokoh Pembantu");
        jp10.tampilTokoh();
        Pekerjaan job10 = new Pekerjaan();
        job10.setPekerjaan("Detective Cilik");
        job10.tampilTokoh();
        Keterangan ket10 = new Keterangan();
        ket10.setKeterangan("Teman Conan yang memiliki pengetahuan yang "
                            + "melebihi kelas 1 sd. Penyuka teknologi.");                   
        ket10.tampilTokoh();
        
        System.out.println(" ");
        DetectiveConan dc11 = new DetectiveConan();
        dc11.setTokoh("Genta Kojima");
        dc11.tampilTokoh();
        JenisPeran jp11 = new JenisPeran();
        jp11.setPeran("Tokoh Pembantu");
        jp11.tampilTokoh();
        Pekerjaan job11 = new Pekerjaan();
        job11.setPekerjaan("Detective Cilik");
        job11.tampilTokoh();
        Keterangan ket11 = new Keterangan();
        ket11.setKeterangan("Orang yang otaknya selalu dipenuhi "
                            + "dengan makanan.");                   
        ket11.tampilTokoh();
        
    }
    
}
