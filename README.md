# Clean Code Review CManager

Este proyecto es una aplicación Java para la gestión de clientes y órdenes, con buenas prácticas de código y herramientas de análisis estático.

## Características
- Añadir clientes y órdenes
- Procesar órdenes por cliente
- Generar reportes en consola
- Código limpio y estructurado
- Integración con PMD, PIT y Sonar para análisis de calidad

## Requisitos
- Java 21 (LTS)
- Maven

## Comandos útiles

### Ejecutar la aplicación
```bash
mvn exec:java -Dexec.mainClass="com.clean.code.CustomerOrderManager"
```

### Generar reportes PMD
```bash
mvn pmd:pmd
```

### Generar reportes de mutación PIT
```bash
mvn -DskipTests=false pitest:mutationCoverage
```

### Levantar servidor para ver reportes HTML
Desde la carpeta `target`:
```bash
python3 -m http.server 8080
```
Luego abre en tu navegador: [http://localhost:8080/pmd.html](http://localhost:8080/pmd.html) o [http://localhost:8080/pit-reports/index.html](http://localhost:8080/pit-reports/index.html)

## Estructura
- `src/main/java/com/clean/code/CustomerOrderManager.java`: Lógica principal
- `src/test/java/com/clean/code/ArchitectureTest.java`: Pruebas
- `target/`: Reportes generados

## Autor
Diegostudient07

---
Este proyecto sigue buenas prácticas de desarrollo y está listo para revisión y mejora continua.
