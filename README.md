# 📌 TaskFlow - BackEnd

O **TaskFlow** é uma aplicação web simples para gerenciamento de tarefas de usuários.
O sistema permite acompanhar o andamento das atividades, visualizar quem está responsável por cada tarefa e verificar se já foi concluída ou não.

Este projeto foi desenvolvido com o objetivo de **praticar e desenvolver habilidades técnicas** utilizando uma arquitetura **front-end e back-end separados**, com comunicação via API REST.

## 📑 Índice

* [Objetivo do projeto](#-objetivo-do-projeto)
* [Aprendizados adquiridos](#-aprendizados-adquiridos)
* [Tecnologias](#tecnologias)
* [Funcionalidades](#-funcionalidades)
* [Endpoints da API](#endpoints)
* [Como executar o projeto](#️-como-executar-o-projeto)


<a id="objetivo"></a>

## 🎯 Objetivo do projeto

Este projeto foi criado para praticar:

* API REST com Spring Boot
* Arquitetura em camadas
* CRUD completo
* Integração Front-end e Back-end
* Manipulação de DOM com JavaScript
* Persistência com MySQL
* Organização de projeto full stack desacoplado

---
<a id="aprendizados"></a>
## 📚 Aprendizados adquiridos

Durante o desenvolvimento deste projeto, foram praticados e reforçados os seguintes conceitos:

* Comunicação via API REST
* Uso de async/await para requisições assíncronas
* Uso de fetch para consumo da API
* Organização de código em camadas no Spring Boot
* Criação de CRUD completo
* Modelagem de banco relacional
* Relacionamento entre usuários e tarefas
* Tratamento de respostas HTTP
* Importância de comentários para manutenção do código
* Integração entre JavaScript e API Spring Boot

---

<a id="tecnologias"></a>
## 🛠️ Tecnologias:

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* PostMan


---
<a id="funcionalidades"></a>
## 🚀 Funcionalidades

* Cadastro de usuários
* Listagem de usuários
* Atualização de usuários
* Criação de tarefas
* Listagem de tarefas
* Buscar tarefa por ID
* Listar tarefas por usuário
* Remover tarefas
* Acompanhamento de status das tarefas

---
 <a id="endpoints"></a>
## 📡 Endpoints da API

### 👤 Usuários

#### Listar usuários

```http
GET /user
```

---

#### Buscar usuário por ID

```http
GET /user/{id}
```

---

#### Criar usuário

```http
POST /user
```

Exemplo:

```json
{
  "name": "João",
  "email": "joao@email.com",
  "senha": "joao"
}
```

Retorno:

* 201 → Criado com sucesso
* 409 → Usuário já existente

---

#### Atualizar usuário

```http
PUT /user/{id}
```

---

### 📋 Tarefas

#### Criar tarefa

```http
POST /task
```

Exemplo:

```json
{
  "titulo": "teste",
  "descr": "Desenvolver endpoints REST para usuários",
  "status": "in_progress",
  "user": {
    "id": 1
  }
}
```

Retorno:

* 201 → Criada com sucesso
* 500 → Erro interno

---

#### Listar todas tarefas

```http
GET /task
```

---

#### Buscar tarefa por ID

```http
GET /task/{id}
```

* 200 → Encontrado
* 404 → Não encontrado

---

#### Listar tarefas por usuário

```http
GET /task/user/{id}
```

---

#### Deletar tarefa

```http
DELETE /task/{id}
```

* 204 → Removido com sucesso
* 404 → Não encontrado

---

## ▶️ Como executar o projeto

### 1. Rodar o Back-end

Clonar repositório da API:

```bash
git clone https://github.com/ArthurVictorSena/TaskFlow-Back.git
```

Criar banco:

```sql
CREATE DATABASE tarefas;
```

Tabelas:

```sql
create table users (
 id int primary key auto_increment not null,
 nome varchar(80) not null,
 email varchar(80) not null,
 senha varchar(80) not null
);
```

```sql
create table tasks(
 id int not null auto_increment primary key,
 titulo varchar(20) not null,
 descr varchar(80) not null,
 status enum('pending','in_progress','done') default 'pending',
 id_user int not null,
 foreign key (id_user) references users(id)
);
```

Configurar:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarefas
spring.datasource.username=root
spring.datasource.password=SuaSenha
```

Executar aplicação Spring Boot.

---

### 2. Rodar o Front-end

Clonar repositório do front:

```bash
git clone https://github.com/ArthurVictorSena/TaskFLow-front.git
```

Abrir arquivo :

```
index.html
```

---



