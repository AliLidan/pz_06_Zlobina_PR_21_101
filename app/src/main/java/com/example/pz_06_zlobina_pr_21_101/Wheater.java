package com.example.pz_06_zlobina_pr_21_101;

public class Wheater {


    String date;
    String temp;
    String we;
    public Wheater(String date, String temp, String we)
    {
        this.date= date;
        this.temp= temp;
        this.we= we;
    }
    public String GetDate()
    {
        return this.date;
    }
    public void SetDate(String date)
    {
        this.date= date;
    }
    public String GetUrl()
    {
        return this.we;
    }
    public String GetTemp()
    {
        return this.temp;
    }

}
