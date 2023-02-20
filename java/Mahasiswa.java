/*
    Saya Fauziyyah Zayyan Nur NIM 2103703 mengerjakan soal
    Tugas Praktikum 2 dalam mata kuliah Desain Pemrograman
    Berorientasi Objek untuk keberkahanNya maka saya tidak
    melakukan kecurangan seperti yang telah dispesifikan.
    Aamiin.
*/

public class Mahasiswa extends SivitasAkademik
{
    private String nim;
    private String fakultas;
    private String prodi;

    Mahasiswa(){

    }

    Mahasiswa(String nim, String fakultas, String prodi){
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    public void setNIM(String nim)
    {
        this.nim = nim;
    }

    public String getNIM()
    {
        return this.nim;
    }

    public void setFakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

    public String getFakultas()
    {
        return this.fakultas;
    }

    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    public String getProdi()
    {
        return this.prodi;
    }
}