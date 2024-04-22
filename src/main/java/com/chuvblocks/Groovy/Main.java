package com.chuvblocks.Groovy;

import groovy.lang.GroovyShell;

public class Main {
    public static void main(String[] args) {
        StringBuilder scriptBuilder = new StringBuilder();
        scriptBuilder.append("def sum(a, b) {\n");
        scriptBuilder.append("    return a + b;\n");
        scriptBuilder.append("}\n");

        int a = 10;
        int b = 20;
        scriptBuilder.append("sum(").append(a).append(", ").append(b).append(");").append("\n");

        String scriptCode = scriptBuilder.toString();

        GroovyShell shell = new GroovyShell();
        Object result = shell.evaluate(scriptCode);

        System.out.println("Resultado de la suma: " + result.toString());
    }
}