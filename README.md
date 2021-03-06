# RESTful Web Services
Es una aplicación desarrollada con cuatro recursos REST utilizando Spring Framework, el patrón de diseño es MVC (Modelo Vista Controlador)

## Instalación 
Procedimiento para desarrollar la instalación 

### 1.- Crear el archivo .war de la aplicación 
Comandos e instrucciones a realizar para crear el archivo .rar
```bash
# Se posiciona el el directorio donde reside el archivo POM.xml
$ cd /RESTfulWS/target/m2e-wtp/web-resources/META-INF/me.jmll/utm
# Se ejecuta el comando 
$ mvn clean install
# Ó este comando 
$ mvn clean package
# Con esto se creará el archivo .war
```
### 2.- Instalar el archivo .war en el servidor Tomcat
Esto se logra copiando el archivo .war en el directorio webapps del directorio del servidor web
```bash
# Ejemplo del directorio
$ cd /Apache Software Foundation/Tomcat 9.0/webapps
# Para copiar el archivo war al directorio del servidor 
$ cp -p file.war /Apache Software Foundation/Tomcat 9.0/webapps
# Posteriormente automaticamente al iniciar el servidor Tomcat, instala la aplicació 
```
### 3.- Ejecutar Tomcat 
Eso es realizado mediante la ejecución del archivo por lotes 
#### En Windows
```batch
:: Se posiciona en el directorio donde reside el archivo
> cd startup.bat 
```
#### En Linux 
```bash
# Se posiciona en el directorio donde reside el archivo
$ cd startup.sh
```
## Uso 
Se puede hacer uso de las APIs consumiendo los siguientes servicios en el servidor montado en el puerto 8080 de la siguiente forma http://localhost:8080/utm/api/v1
### APIS
```json
{
    "_links": [
        {
            "href": "http://localhost:8080/utm/api/v1/",
            "rel" : "self"
        },
        {
            "href": "http://localhost:8080/utm/api/v1/file/",
            "rel" : "file"
        },
        {
            "href": "http://localhost:8080/utm/api/v1/directory/",
            "rel" : "directory"
        },
        {
            "href": "http://localhost:8080/utm/api/v1/notify/",
            "rel" : "notify"
        },
        {
            "href": "http://localhost:8080/utm/api/v1/user/",
            "rel" : "user"
        }
    ],
    "version" : "1"
}
```
Las APIs mostradas anteriormente son empleadas para lograr ver todos los servicios disponibles de la aplicación 
## Créditos
### Alummnos
Yesica Lizbeth Aldape García  
Miguel Matthew Montes de Oca Guzmán  
José Isaac Zermeño Sánchez  
Allie Michell Flores Sánchez   
### Universidad
Universidad Tecmilenio 
### Materia 
Computación Avanzada en Java
### Profesor
Lucía Guadalupe Moyeda Cornejo
## Licencia
MIT 