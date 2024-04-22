package com.chuvblocks.Reflection;

public class Carro extends Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("Arrancando carro");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando carro");
    }
}
