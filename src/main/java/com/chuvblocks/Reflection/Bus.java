package com.chuvblocks.Reflection;

public class Bus extends Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("Arrancando bus");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando bus");
    }
}
