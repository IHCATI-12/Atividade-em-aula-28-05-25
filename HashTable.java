package HashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable {
    private static Scanner input = new Scanner(System.in);
    private static Hashtable<String, Aluno> alunos = new Hashtable();

    public static void Cadastrar(){
        System.out.println("---- Cadastro ----");
        System.out.print("Matricula: ");
        String matricula = input.nextLine();
        
        if (matricula.equals(matricula)) {
            System.out.println("Chave Matricula Ja cadastrada!");
            return;
        }
        
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Curso: ");
        String curso = input.nextLine();

        System.out.print("email: ");
        String email = input.nextLine();

        Aluno a = new Aluno(matricula, nome, curso, email);

        alunos.put(matricula, a);
    }

    public static void buscar() {
        System.out.println("---- Buscar ----");
        System.out.println("Matricula: ");
        String matricula = input.nextLine();
        boolean n = alunos.containsKey(matricula);
        if (n) {
            System.out.println("Usuario Cadastrado! " + "\n" + "Aluno: " + alunos.get(matricula).getNome() + "\n" + "Curso: " + alunos.get(matricula).getCurso() + "\n" + "Email: " + alunos.get(matricula).getEmail());
        } else {
            System.out.println("Usuario não cadastrado");
        }
    }

    public static int menu(){
        System.out.println("\n");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Buscar");
        // System.out.println();
        System.out.println("0 - Sair");
        System.out.println("Escolha");
        int op = input.nextInt();
        input.nextLine(); // limpar buffer
        return op;
    }
    public static void main(String[] args) {
        // <KEY, VALUE>
        // <CHAVE, VALOR>
        // <MATRICULA, NOME>
        
        
        int opcao = 0;
        do{
            opcao = menu();
            switch (opcao) {
                case 1:
                    // Cadastrar
                    Cadastrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 0:
                    // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Invalida" + "\n" + "\n");
                    break;
            }
        }while (opcao != 0);
    }
}
