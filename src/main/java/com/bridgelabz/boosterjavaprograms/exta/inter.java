package com.bridgelabz.boosterjavaprograms.exta;

interface Inter {
    public void meth();

    public class Lambda {
        public static void main(String[] args) {
            int obj = 2;

            Inter s = () -> {
                System.out.println("" + obj);
            };
            s.meth();
        }
    }
}
