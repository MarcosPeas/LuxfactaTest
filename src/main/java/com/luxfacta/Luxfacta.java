package com.luxfacta;

public class Luxfacta {
    private int n;

    public Luxfacta(int n) {
        this.n = n;
    }

    public String say() {
        if (n % 3 == 0 && n % 5 == 0) return "LuxFacta";
        if (n % 3 == 0) return "Lux";
        if (n % 5 == 0) return "Facta";
        return String.valueOf(n);
    }
}
