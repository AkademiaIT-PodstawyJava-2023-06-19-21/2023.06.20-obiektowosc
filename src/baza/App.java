package baza;

import baza.danych.v1.Connector;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Connector connector = new Connector();
        Connector connector2 = new Connector();
        baza.danych.v2.Connector connector3 = new baza.danych.v2.Connector();
        Connector connector4 = new Connector();

        Random random = new Random();
    }
}
