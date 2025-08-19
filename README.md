forohub - Plataforma de consultas y respuestas  

Un **foro colaborativo en línea** desarrollado en **Java (Spring Boot)** que permite a estudiantes, desarrolladores y profesionales **aclarar dudas relacionadas con backend**.  
La aplicación soporta publicación de preguntas, respuestas, votación y administración de usuarios, fomentando el aprendizaje comunitario.  

---

## 📌 Características principales  
- Registro e inicio de sesión con autenticación JWT.  
- Creación de preguntas categorizadas (Java, Spring, Node.js, Python, APIs, Bases de Datos, etc.).  
- Publicación y edición de respuestas en tiempo real.  
- Sistema de votación para destacar las mejores contribuciones.  
- Panel de administración para moderadores.  
- API REST para consultas externas.  

---

## ⚙️ Instalación  

### 1. Clonar el repositorio  
```bash
git clone https://github.com/usuario/foro-backend-java.git
cd foro-backend-java
2. Configurar la base de datos
Crea una base de datos en MySQL:

sql
Copiar
Editar
CREATE DATABASE foro_backend;
3. Configurar variables de entorno
Edita el archivo src/main/resources/application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/foro_backend
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=tu_clave_secreta
server.port=8080
4. Compilar y ejecutar el proyecto
Usando Maven:

bash
Copiar
Editar
mvn clean install
mvn spring-boot:run
🚀 Uso
Inicia el servidor en:

arduino
Copiar
Editar
http://localhost:8080
Endpoints principales:

POST /auth/register → Registrar usuario

POST /auth/login → Iniciar sesión y obtener token JWT

GET /questions → Listar preguntas

POST /questions → Crear nueva pregunta

POST /answers → Responder preguntas

POST /votes → Votar respuestas

Usa herramientas como Postman o un frontend en React/Angular para consumir la API.

💻 Requisitos del sistema
Java JDK: 17 o superior

Maven: 3.8+

Spring Boot: 3+

Base de datos: MySQL 8+

RAM mínima: 4 GB

Sistema operativo: Windows, macOS o Linux

📚 Tecnologías utilizadas
Backend: Java 17, Spring Boot 3, Spring Security, Hibernate/JPA

Base de datos: MySQL

Autenticación: JWT

Testing: JUnit 5

Control de versiones: Git & GitHub

Contribución

Haz un fork del repositorio.

Crea una rama para tu funcionalidad:

git checkout -b feature/nueva-funcionalidad


Haz commit de tus cambios:

git commit -m "Agrega nueva funcionalidad"


Sube tus cambios:

git push origin feature/nueva-funcionalidad


Abre un Pull Request.



