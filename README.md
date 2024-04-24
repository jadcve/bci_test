# bci_test
Descripción
Este proyecto es una API RESTful desarrollada con Spring Boot para la creación y manejo de usuarios. Utiliza una base de datos en memoria H2 para simplificar el desarrollo y las pruebas.

Configuración de la Base de Datos
La base de datos H2 está configurada para accederse a través de la consola H2 y se crea automáticamente al iniciar la aplicación. No requiere configuración adicional.

URL de acceso a la consola H2: /h2-console
JDBC URL: jdbc:h2:mem:db_bci_test
Usuario: sa
Contraseña: (vacía)
Configuración de la Aplicación
Puedes configurar la aplicación modificando el archivo application.properties de la siguiente manera:

properties
# code
spring.application.name=bci-test
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:db_bci_test
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.path=/h2-console
spring.jpa.hibernate.ddl-auto=create

Endpoints
La aplicación expone los siguientes endpoints para interactuar con el sistema de usuarios:

Crear Usuario: POST /api/usuario/crear
Actualizar Usuario: PUT /api/usuario/actualizar
Listar Usuarios: GET /api/usuario/listar
Validaciones
Se realizan validaciones personalizadas para los campos name, email, y password. Además, los phones[] deben cumplir con el formato especificado.

Pruebas
Para probar la aplicación, puedes utilizar herramientas como Postman o cURL. Asegúrate de que la aplicación esté ejecutándose y envía las peticiones a los endpoints proporcionados.

Construcción y Ejecución
Para construir y ejecutar la aplicación, utiliza Maven o Gradle. Aquí un ejemplo con Maven:

# code
mvn clean install
java -jar target/nombre-del-artifacto.jar
Repositorio
El código fuente está disponible en GitHub: bci-test GitHub Repository

Diagrama de la Solución
(Incluye un diagrama si es necesario para entender la arquitectura de la aplicación.)

Contribuir
Para contribuir al proyecto, por favor envía un pull request o abre un issue para discutir los cambios que te gustaría implementar.

