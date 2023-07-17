<h1>API Store - Backend</h1>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/wlusbar/API_Store_JavaReact_BackEnd/blob/main/store/LICENSE)

## Sobre o Projeto
Essa aplicação foi desenvolvido durante o video tutorial utilizando **Java Spring e Spring MVC** para criação do servidor, e integração com uma **App React** desenvolvido em outro repositorio.

Obs. As imagens utilizadas no projeto, foi adquirida aleatoriamente no google.com, commit em um repositorio privado e atribuido 7 dessas imagens nos insert no import.sql e 1 utilizado na collection do Postman. 

<h2>💻 Requisitos</h2> 

Para rodar esse projeto sua máquina deve ter um JDK instalado. O projeto foi criado em Java 17.

<h2> 🚀 Instalando o projeto</h2>

Primeiro você deve clonar o repositório, acessar o diretorio e utilizar a IDE de sua preferencia. 
Obs. O projeto foi implementado com a IDE Spring Tool Suite 4

## Trechos de código

### Plug-in Maven

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.1</version> <!--$NO-MVN-MAN-VER$ -->
</plugin>
```

### application-test.properties

```
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Collections
Para realizar o teste a API, foi utilizado uma collection no Postmam
👉 [Link da Collection](https://github.com/wlusbar/API_Store_JavaReact_BackEnd/blob/main/Store.postman_collection.json)
Esse tutorial será associado ao repositorio de desenvolvimento Front End

## Tecnologias Utilizadas
- Spring Boot
  Com uso de bibliotecas
  - Lombok
  - Tomcat
  - h2
  - dev Tools
  - Web

## Autor
- Wellington Luiz

[![Profile](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wellingtonluizsb/)

## Agradecimentos
Este desenvolvimento foi realizado durante tutorial do canal "Fernanda Kipper | Dev" no video 

 👉 [Video tutorial no canal](https://youtu.be/lUVureR5GqI)
