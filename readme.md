Este proyecto convierte logs del siguiente estilo:

---

|n|2024-10-30 00:07:01.945|~|INFO |~|org.example.TicketEstandar|~|main|~|TicketEstandar.java:514|~|main|~|Información sobre el entorno de ejecución: 
 ~ id_ejecucion: null
 ~ java.class.path: C:\TicketEstandar\MotorDePlantillas_v1.1.0-beta.16-jar-with-dependencies.jar
 ~ java.home: C:\Program Files\Java\jdk-17.0.2
 ~ java.vendor: Oracle Corporation
 ~ java.vendor.url: https://java.oracle.com/
 ~ java.version: 17.0.2
 ~ os.arch: amd64
 ~ os.name: Windows 11
 ~ os.version: 10.0
 ~ user.dir: C:\TicketEstandar
 ~ user.home: C:\Users\JEST
 ~ user.name: JEST

|n|2024-10-30 00:07:02.201|~|DEBUG|~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:87|~|AWT-EventQueue-0|~|Directorio creado con éxito.
|n|2024-10-30 00:07:02.201|~|WARN |~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:96|~|AWT-EventQueue-0|~|Archivo general.properties creado exitosamente.
|n|2024-10-30 00:07:02.202|~|INFO |~|org.example.Common.PropertiesManager.PropertiesManager|~|getProperties|~|PropertiesManager.java:106|~|AWT-EventQueue-0|~|Cargando archivo de configuración: general.properties

---

A csv como el siguiente:

---

"2024-10-30 00:07:01.945","INFO ","org.example.TicketEstandar","main","TicketEstandar.java:514","main","Información sobre el entorno de ejecución: 
 ~ id_ejecucion: null
 ~ java.class.path: C:\TicketEstandar\MotorDePlantillas_v1.1.0-beta.16-jar-with-dependencies.jar
 ~ java.home: C:\Program Files\Java\jdk-17.0.2
 ~ java.vendor: Oracle Corporation
 ~ java.vendor.url: https://java.oracle.com/
 ~ java.version: 17.0.2
 ~ os.arch: amd64
 ~ os.name: Windows 11
 ~ os.version: 10.0
 ~ user.dir: C:\TicketEstandar
 ~ user.home: C:\Users\JEST
 ~ user.name: JEST

"
"2024-10-30 00:07:02.201","DEBUG","org.example.Common.PropertiesManager.PropertiesManager","getProperties","PropertiesManager.java:87","AWT-EventQueue-0","Directorio creado con éxito.
"
"2024-10-30 00:07:02.201","WARN ","org.example.Common.PropertiesManager.PropertiesManager","getProperties","PropertiesManager.java:96","AWT-EventQueue-0","Archivo general.properties creado exitosamente.
"
"2024-10-30 00:07:02.202","INFO ","org.example.Common.PropertiesManager.PropertiesManager","getProperties","PropertiesManager.java:106","AWT-EventQueue-0","Cargando archivo de configuración: general.properties
"