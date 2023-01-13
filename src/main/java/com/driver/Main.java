package com.driver;

public class Main {

public static void main(String args[]){
    Product p= new Product();
    p.product(4,5);
    p.product(1,2,3);
    p.product(345,0.5);
}
    static class Product {
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double t, double v) {
            return t*v;
        }
    }
}
