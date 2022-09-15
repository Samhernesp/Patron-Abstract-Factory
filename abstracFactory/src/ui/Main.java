package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import model.abstractModels.*;
import model.factory.DSFactory;
import model.factory.NesFactory;
import model.factory.WiiFactory;
import model.factory.WiiUFactory;

public class Main {
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        println("Selecciona una plataforma:\n1-Nes\n2-DS\n3-Wii\n4-WiiU");
        AbstractFactory factory = null;
        switch(Integer.parseInt(in.readLine())) {
            case 1:
                factory = new NesFactory();
                break;
            case 2:
                factory = new DSFactory();
                break;
            case 3:
                factory = new WiiFactory();
                break;
            case 4:
                factory = new WiiUFactory();
                break;
        }

        print(factory.createAnPrintAllObjects());
    }

    public static void println(String s) throws IOException {
        out.write(s);
        out.write("\n");
        out.flush();
    }

    public static void print(String s) throws IOException {
        out.write(s);
        out.flush();
    }
}