package com.todo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int opcao;

        do {
            System.out.println("\n===== MENU - Lista de Tarefas =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Buscar por título");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            while (!scanner.hasNextInt()){
                System.out.print("Digite um número válido: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    manager.addTask(titulo, descricao);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;

                case 2:
                    System.out.println("\n--- Tarefas ---");
                    manager.listarTarefas();
                    break;

                case 3:
                    System.out.print("Índice da tarefa a marcar como concluída: ");
                    int indexConcluir = scanner.nextInt();
                    scanner.nextLine();

                    if (manager.markTaskAsDone(indexConcluir)) {
                        System.out.println("Tarefa concluída com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Índice da tarefa a remover: ");
                    int indexRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (manager.removeTask(indexRemover)) {
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    System.out.print("Digite uma palavra-chave do título: ");
                    String palavra = scanner.nextLine();
                    manager.buscarPorTitulo(palavra);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}