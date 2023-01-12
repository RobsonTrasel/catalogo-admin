package com.robsonf.admin.catalogo.infrastructure;

import com.robsonf.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}