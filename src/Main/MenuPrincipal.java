package Main;

import controller.SistemaAcademicoController;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAcademicoController controller = new SistemaAcademicoController();
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar aluno normal");
            System.out.println("2. Cadastrar aluno especial");
            System.out.println("3. Cadastrar disciplina");
            System.out.println("4. Matricular aluno em disciplina");
            System.out.println("5. Listar alunos");
            System.out.println("6. Listar disciplinas");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome1 = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf1 = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula1 = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    controller.cadastrarAlunoNormal(nome1, cpf1, matricula1, curso);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome2 = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf2 = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula2 = scanner.nextLine();
                    controller.cadastrarAlunoEspecial(nome2, cpf2, matricula2);
                    break;

                case 3:
                    System.out.print("Nome da disciplina: ");
                    String nomeDisc = scanner.nextLine();
                    System.out.print("Código: ");
                    String cod = scanner.nextLine();
                    System.out.print("Carga horária: ");
                    int carga = scanner.nextInt();
                    scanner.nextLine();
                    controller.cadastrarDisciplina(nomeDisc, cod, carga);
                    break;

                case 4:
                    System.out.print("Matrícula do aluno: ");
                    String mat = scanner.nextLine();
                    System.out.print("Código da disciplina: ");
                    String codDisc = scanner.nextLine();
                    boolean sucesso = controller.matricularAluno(mat, codDisc);
                    System.out.println(sucesso ? "Matrícula realizada com sucesso." : "Falha na matrícula.");
                    break;

                case 5:
                    System.out.println("=== Alunos Cadastrados ===");
                    for (var aluno : controller.getAlunos()) {
                        System.out.println(aluno);
                    }
                    break;

                case 6:
                    System.out.println("=== Disciplinas Cadastradas ===");
                    for (var disc : controller.getDisciplinas()) {
                        System.out.println(disc);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa com segurança...");
                    
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
