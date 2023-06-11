# Desafío Spring boot Medios de Pago MARIA FERNANDA MUÑOZ

Tecnologías involucradas: Spring Boot, Rest, jpa, h2 y Swagger

## Aplicación Java 11 con Spring Boot, Maven, Swagger y H2 Database

Esta es una aplicación de Java 11 construida con Spring Boot, Maven, Swagger y H2 Database. Proporciona dos endpoints para manipular datos relacionados con un desafío MDP

## Requisitos previos

-   Java 11 o superior instalado en tu máquina.
-   Maven instalado en tu máquina.

## Instrucciones de instalación y ejecución

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/greyesbbr/BBRDesafioMDP8j57ML
   ```
   
2. Navega hasta el directorio raíz de la aplicación:
   ```bash
   cd desafio-mdp-app
  
3. Compila la aplicación usando Maven:

   ```bash
    mvn clean install

4. Compila la aplicación usando Maven:
	```bash
	mvn spring-boot:run

5. La aplicación ahora está en funcionamiento y puedes acceder a ella en la siguiente URL: http://localhost:8080
## Endpoints

La aplicación expone los siguientes endpoints:

### Búsqueda TRX por type

-   Método: GET
-   URL: /api/v1/desafio/mdp/search?type

Este endpoint permite realizar una búsqueda de todas las transacciones (TRX) filtradas por type existente en la base de datos.

### Búsqueda TRX por type

-   Método: GET
-   URL: /api/v1/desafio/mdp/search

Este endpoint permite realizar una búsqueda de todas las transacciones (TRX) existente en la base de datos.


### Creación TRX

-   Método: POST
-   URL: /api/v1/desafio/mdp/create

Este endpoint permite crear una nueva transaction (TRX) y la persiste en la base de datos.

## Documentación de la API con Swagger

La aplicación utiliza Swagger para generar una documentación interactiva de la API. Después de iniciar la aplicación, puedes acceder a la documentación de Swagger en la siguiente URL: http://localhost:8080/swagger-ui/index.html