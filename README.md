## Lista de Tarefas (todo-cli) ![Java 17](https://img.shields.io/badge/Java-17-red?logo=java) ![Maven](https://img.shields.io/badge/Maven-Build%20Tool-orange?logo=apachemaven)
Uma aplicação de linha de comando em Java para gerenciar tarefas de forma simples, rápida e eficiente.

## 🎮 Sobre o projeto
todo-cli é uma aplicação simples de linha de comando desenvolvida em Java com Maven para gerenciamento de tarefas. É ideal para demonstrar conhecimentos em lógica de programação, estruturação de projetos Java e manipulação
básicas de listas.

## 🔧 Funcionalidades
- Adicionar tarefas com título e descrição.
- Listar todas as tarefas.
- Marcar tarefa como concluída.
- Remover tarefa.
- Buscar tarefas por palavra-chave no título.

## 📁 Estrutura do projeto
- `App.java`: Classe principal (CLI).
- `TaskManager.java`: Gerenciador de tarefas.
- `Task.java`: Modelo da tarefa.
- `pom.xml`: Arquivo de configuração do Maven.
- `.gitignore`: Arquivos/pastas ignorados pelo Git.
- `README.md`: Este arquivo (em português e em inglês).

## 🚀 Como executar
- Java 17 ou superior.
- Maven instalado (mvn -v para verificar).
- Terminal (Git Bash, CMD, PowerShell, Terminal Linux/Mac, etc.).

#### Windows/Linux/macOS 
##### Passo 1. Clone o repositório:
```bash
git clone https://github.com/YunaKimari/todo-cli.git
cd todo-cli
```

##### Passo 2. Compile e execute com Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.todo.App"
```

Se o comando mvn exec:java não funcionar, certifique-se de que o plugin exec-maven-plugin esteja configurado no seu pom.xml.

## 📄 Licença
Este projeto está licenciado sob a Licença MIT.

## 👤 Autor
- YunaKimari (Denise Rocha)
- GitHub: github.com/YunaKimari

---

## Task List (todo-cli) ![Java 17](https://img.shields.io/badge/Java-17-red?logo=java) ![Maven](https://img.shields.io/badge/Maven-Build%20Tool-orange?logo=apachemaven)
A simple Java command-line app to manage tasks quickly and efficiently.

## 🎮 About th project
todo-cli is a simple command-line Java application built with Maven for task management. It's ideal as a project to demonstrate programming logic, basic Java project structure, and list manipulation.

## 🔧 Features
- Add tasks with title and description.
- List all tasks.
- Mark task as completed.
- Remove task.
- Search tasks by title keyword.

## 📁 Project structure
- `App.java`: Main CLI class.
- `TaskManager.java`: Task manager logic.
- `Task.java`: Task model.
- `pom.xml`: Maven build configuration.
- `.gitignore`: Git ignored files/folders.
- `README.md`: This file (in both Portuguese and English).

## 🚀 How to run
- Java 17 or higher.
- Maven installed (mvn -v to check).
- Terminal (Git Bash, CMD, PowerShell, Linux/Mac Terminal, etc.).

#### Windows/Linux/macOS
##### Step 1. Clone the repository:
```bach
git clone https://github.com/YunaKimari/todo-cli.git
cd todo-cli
```

#### Step 2. Compile and run using Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.todo.App"
```

If the mvn exec:java command fails, make sure the exec-maven-plugin is configured in your pom.xml.

## 📄 License
This project is licenced under the MIT License.

## 👤 Author
- YunaKimari (Denise Rocha)
- GitHub: github.com/YunaKimari
