package com.chuvblocks.Reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[] { new Carro(), new Bus() };

        try {
            Method arrancarMethod = Vehiculo.class.getMethod("arrancar");
            Method frenarMethod = Vehiculo.class.getMethod("frenar");
            for (Object vehiculo : vehiculos) {
                arrancarMethod.invoke(vehiculo);
                frenarMethod.invoke(vehiculo);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
