//package com.servletpack.examples;

interface check {
    public void run();
}
public class Interface {
    public static void main(String[] args) {
        try {
            check t = new check(); {
                public void message() {
                    System.out.println("Method defined in the interface");
                }
            }
            t.run();
        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
    }
}