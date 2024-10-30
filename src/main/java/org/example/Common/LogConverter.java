package org.example.Common;

public class LogConverter {
    
    public static String convertLog(String input){
        String output = "";

        String[] lineas = input.split("\\|n\\|");
        System.out.println("Cantidad de líneas: "+lineas.length);

        for (String linea : lineas) {
            String lineaOutput = "";
            if (linea.isEmpty()) {
                continue;
            }
            // System.out.println("-->: "+linea);
            String[] columnas = linea.split("\\|~\\|");

            for (int i = 0; i < columnas.length; i++) {
                String columna = columnas[i];
                String columnaOutput = "\""+columna+"\"";
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
        String file = "|n|2024-10-30 00:07:02.201|~|DEBUG|~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:87|~|AWT-EventQueue-0|~|Directorio creado con éxito, MENSAJE CON COMA.\r\n" + //
                        "|n|2024-10-30 00:07:02.201|~|WARN |~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:96|~|AWT-EventQueue-0|~|Archivo general.properties creado exitosamente.\r\n" + //
                        "|n|2024-10-30 00:07:02.202|~|INFO |~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:106|~|AWT-EventQueue-0|~|Cargando archivo de configuración: general.properties";


        // LogConverter.convertLog(file);


        System.out.println("\n\nLOG:\n");
        System.out.println(LogConverter.convertLog(file));
        System.out.println("\n\n");
    }
}
