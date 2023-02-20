/*
    Saya Fauziyyah Zayyan Nur NIM 2103703 mengerjakan soal
    Tugas Praktikum 2 dalam mata kuliah Desain Pemrograman
    Berorientasi Objek untuk keberkahanNya maka saya tidak
    melakukan kecurangan seperti yang telah dispesifikan.
    Aamiin.
*/

class SivitasAkademik extends Human
{
    private String asal_universitas;
    private String email_edu;

    SivitasAkademik(){

    }

    SivitasAkademik(String asal_universitas, String email_edu){
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }

    public void setAsalUniv(String asal_universitas)
    {
        this.asal_universitas = asal_universitas;
    }

    public String getAsalUniv()
    {
        return this.asal_universitas;
    }

    public void setEmailEdu(String email_edu)
    {
        this.email_edu = email_edu;
    }

    public String getEmailEdu()
    {
        return this.email_edu;
    }
}