# 📌 TaskFlow - FrontEnd

Interface web responsável por consumir a API TaskFlow e exibir usuários e tarefas.

## 📑 Índice

- [Objetivo do projeto](#objetivo)
- [Aprendizados adquiridos](#aprendizados)
- [Tecnologias](#tecnologias)
- [Funcionalidades](#funcionalidades)
- [Comunicação com API](#api)
- [Como executar](#como-executar)

---

<a id="objetivo"></a>
## 🎯 Objetivo do projeto

Este projeto foi criado para praticar:

- Consumo de API REST
- Manipulação de DOM com JavaScript
- Async / Await
- Fetch API
- Integração com Spring Boot
- Organização de código front-end
- Separação entre front e back-end

---

<a id="aprendizados"></a>
## 📚 Aprendizados adquiridos

Durante o desenvolvimento do front-end, foram praticados os seguintes conceitos:

- Uso de fetch para requisições HTTP
- Uso de async/await para chamadas assíncronas
- Manipulação dinâmica do DOM
- Criação de elementos HTML com JavaScript
- Tratamento de respostas da API
- Consumo de endpoints REST
- Integração com backend Spring Boot
- Organização de funções JavaScript
- Separação de responsabilidades
- Importância de comentários no código

---

<a id="tecnologias"></a>
## 🛠️ Tecnologias

- HTML
- CSS
- JavaScript
- Fetch API
- Async/Await

---

<a id="funcionalidades"></a>
## 🚀 Funcionalidades

- Listar usuários
- Criar usuários
- Listar tarefas
- Criar tarefas
- Buscar tarefa por ID
- Listar tarefas por usuário
- Remover tarefas
- Visualizar status das tarefas

---

<a id="api"></a>
## 🌐 Comunicação com API

O front-end consome a API rodando em:


```
http://localhost:8080
```

Endpoints utilizados:

```
GET /user
POST /user
GET /task
POST /task
GET /task/{id}
GET /task/user/{id}
DELETE /task/{id}
```

---
<a id="como-executar"></a>
## ⚙️ Como executar

### 1. Clonar repositório

```
git clone https://github.com/ArthurVictorSena/TaskFLow-front.git
```

### 2. Abrir projeto (VsCode)

Abrir arquivo:

```
index.html
```

ou usar Live Server.
