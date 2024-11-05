package org.example.Common;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class LogConverter {
    
    public static String convertLog(String input){
        String output = "";

        input = input.replaceFirst("\\|n\\|", "");
        String[] lineas = input.split("\r\n\\|n\\|");
        System.out.println("Cantidad de líneas: "+lineas.length);

        int contador = 1;
        for (String linea : lineas) {
            if (linea.isEmpty()) {
                continue;
            }
            String lineaOutput = "\"" + (contador++) + "\",";
            // System.out.println("-->: "+linea);
            String[] columnas = linea.split("\\|~\\|");

            for (int i = 0; i < columnas.length; i++) {
                String columna = columnas[i];
                columna = columna.replaceAll("\"","\"\""); // Escapa commillas dobles
                String columnaOutput = "\""+columna+"\""; // Escapa saltos de línea y comas
                lineaOutput+=columnaOutput;
                if (i!=columnas.length-1) {
                    lineaOutput+=",";
                }
            }
            // System.out.println("---->: " + lineaOutput);
            output += lineaOutput+"\n"; 
        }

        return output;
    }

    public static void main(String[] args) {
        String sourceFilePath = "C:/Users/JEST/Downloads/TicketEstandar.log";
        String targetFilePath = sourceFilePath.replace(".log", ".csv");

        // LogConverter.convertLog(file);
        try {
            // Leer el archivo de origen en UTF-8
            String content = new String(Files.readAllBytes(Paths.get(sourceFilePath)), StandardCharsets.UTF_8);
            String result = LogConverter.convertLog(content);
            
            // Escribir el contenido en el archivo de destino
            Files.write(Paths.get(targetFilePath), result.getBytes(StandardCharsets.UTF_8));
            // System.out.println("Contenido\n\n"+result+"\n\n");
            System.out.println("Contenido copiado exitosamente a: " + targetFilePath);
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }
    }
}
