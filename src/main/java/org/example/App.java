package org.example;

import java.util.Objects;
import java.util.Scanner;

public class App {

    private int k = 0;
    private String name;
    public int getK(){
        return k;
    }
    public void setK(int k){
        if (k < 0)
            throw new IllegalArgumentException();
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return k == app.k && Objects.equals(name, app.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, name);
    }

    public static void main(String[] args) {

        System.out.println("Hello There!");
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println(add(a,b));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static boolean odd(int a){
        if (a % 2 == 1){
            return true;
        }
        else
            return false;
    }
}
