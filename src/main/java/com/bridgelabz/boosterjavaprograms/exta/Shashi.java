package com.bridgelabz.boosterjavaprograms.exta;

public class Shashi {
    public int shashi;
    public String kartik;
    public int aditya;

    public int getShashi() {
        return shashi;
    }

    public void setShashi(int shashi) {
        this.shashi = shashi;
    }

    public String getKartik() {
        return kartik;
    }

    public void setKartik(String kartik) {
        this.kartik = kartik;
    }

    public int getAditya() {
        return aditya;
    }

    public void setAditya(int aditya) {
        this.aditya = aditya;
    }

    public Shashi(int shashi, String kartik, int aditya) {
        this.shashi = shashi;
        this.kartik = kartik;
        this.aditya = aditya;
    }

    @Override
    public String toString() {
        return "Shashi{" +
                "shashi=" + shashi +
                ", kartik='" + kartik + '\'' +
                ", aditya=" + aditya +
                '}';
    }
}
