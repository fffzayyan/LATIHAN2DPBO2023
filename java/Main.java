/*
    Saya Fauziyyah Zayyan Nur NIM 2103703 mengerjakan soal
    Tugas Praktikum 2 dalam mata kuliah Desain Pemrograman
    Berorientasi Objek untuk keberkahanNya maka saya tidak
    melakukan kecurangan seperti yang telah dispesifikan.
    Aamiin.
*/

public class Main
{
    public static void main(String[] args)
    {
        Human ahuman;
        SivitasAkademik asivitasakademik;
        Mahasiswa amahasiswa;

        Human bhuman;
        SivitasAkademik bsivitasakademik;
        Mahasiswa bmahasiswa;

        ahuman = new Human();
        ahuman.setNIK("123456789");
        ahuman.setNama("Fulan");
        ahuman.setJenisKelamin("Laki-laki");

        bhuman = new Human();
        bhuman.setNIK("987654321");
        bhuman.setNama("Fulanah");
        bhuman.setJenisKelamin("Perempuan");

        // System.out.println(ahuman.getNIK());
        // System.out.println(ahuman.getNama());
        // System.out.println(ahuman.getJenisKelamin());

        asivitasakademik = new SivitasAkademik();
        asivitasakademik.setNIK("123456789");
        asivitasakademik.setNama("Fulan");
        asivitasakademik.setJenisKelamin("Laki-laki");
        asivitasakademik.setAsalUniv("Universitas_Antah_Berantah");
        asivitasakademik.setEmailEdu("fulan@uab.edu");

        bsivitasakademik = new SivitasAkademik();
        bsivitasakademik.setNIK("987654321");
        bsivitasakademik.setNama("Fulanah");
        bsivitasakademik.setJenisKelamin("Perempuan");
        bsivitasakademik.setAsalUniv("Universitas_Antah_Berantah");
        bsivitasakademik.setEmailEdu("fulanah@uab.edu");
        
        // System.out.println(asivitasakademik.getNIK());
        // System.out.println(asivitasakademik.getNama());
        // System.out.println(asivitasakademik.getJenisKelamin());
        // System.out.println(asivitasakademik.getAsalUniv());
        // System.out.println(asivitasakademik.getEmailEdu());

        amahasiswa = new Mahasiswa();
        amahasiswa.setNIK("123456789");
        amahasiswa.setNama("Fulan");
        amahasiswa.setJenisKelamin("Laki-laki");
        amahasiswa.setAsalUniv("Universitas_Antah_Berantah");
        amahasiswa.setEmailEdu("fulan@uab.edu");
        amahasiswa.setNIM("321");
        amahasiswa.setFakultas("FPMIPA");
        amahasiswa.setProdi("Ilmu_Komputer");

        bmahasiswa = new Mahasiswa();
        bmahasiswa.setNIK("987654321");
        bmahasiswa.setNama("Fulanah");
        bmahasiswa.setJenisKelamin("Perempuan");
        bmahasiswa.setAsalUniv("Universitas_Antah_Berantah");
        bmahasiswa.setEmailEdu("fulanah@uab.edu");
        bmahasiswa.setNIM("321");
        bmahasiswa.setFakultas("FPMIPA");
        bmahasiswa.setProdi("Ilmu_Komputer");

        System.out.println("Data ke-1:");
        System.out.println(amahasiswa.getNIK());
        System.out.println(amahasiswa.getNama());
        System.out.println(amahasiswa.getJenisKelamin());
        System.out.println(amahasiswa.getAsalUniv());
        System.out.println(amahasiswa.getEmailEdu());
        System.out.println(amahasiswa.getNIM());
        System.out.println(amahasiswa.getFakultas());
        System.out.println(amahasiswa.getProdi());

        System.out.println("\n");

        System.out.println("Data ke-2:");
        System.out.println(bmahasiswa.getNIK());
        System.out.println(bmahasiswa.getNama());
        System.out.println(bmahasiswa.getJenisKelamin());
        System.out.println(bmahasiswa.getAsalUniv());
        System.out.println(bmahasiswa.getEmailEdu());
        System.out.println(bmahasiswa.getNIM());
        System.out.println(bmahasiswa.getFakultas());
        System.out.println(bmahasiswa.getProdi());

        // will update later
    }
}