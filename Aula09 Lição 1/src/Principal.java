public class Principal {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Homem-aranha", "Eng Software", "3° Periodo", "Manhã");
    
        System.out.println("Dados aluno a1:");
        
        //Mostre os dados de "a1" na tela
        System.out.println(a1.toString());
        
        Aluno a2 = new Aluno();

        //Leia do teclado os dados do aluno "a2"
        System.out.println("\nAluno a2:");
        System.out.println("Informe o nome do aluno: ");
        a2.setNome(Aluno.leitor.nextLine());
        System.out.println("Informe o curso: ");
        a2.setCurso(Aluno.leitor.nextLine());
        System.out.println("Periodo: ");
        a2.setPeriodo(Aluno.leitor.nextLine());
        System.out.println("Turno: ");
        a2.setTurno(Aluno.leitor.nextLine());

        //Mostre os dados de "a2" na tela
        System.out.println("\nDados a2:");
        System.out.println(a2.toString());

        //Altere o nome de "a1" para um valor vindo do teclado
        System.out.println("\nNovo nome a1: ");
        a1.setNome(Aluno.leitor.nextLine());
        //Mostre o novo nome de "a1" na tela
        System.out.println(a1.toString());

        //Crie um objeto "a3" do tipo Aluno contendo o nome de "a1" e os demais dados de "a2"
        Aluno a3 = new Aluno(a1.getNome(), a2.getCurso(), a2.getPeriodo(), a2.getTurno());
        //Altere o valor do atributo "turno" de "a3" para um valor qualquer
        System.out.println("\nNovo turno: ");
        a3.setTurno("tarde");
        //Mostre os dados de "a3" na tela
        System.out.println(a3.toString());

        //Crie um objeto "a4" do tipo Aluno com os mesmos dados de "a3"
        Aluno a4 = new Aluno(a3.getNome(), a3.getCurso(), a3.getPeriodo(), a3.getTurno());
        //Mostre os dados de "a4" na tela
        System.out.println(a4.toString());

        //Altere todos os dados de "a4" com valores vindos do teclado
        System.out.println("Informe o nome do aluno: ");
        a4.setNome(Aluno.leitor.nextLine());
        System.out.println("Informe o curso: ");
        a4.setCurso(Aluno.leitor.nextLine());
        System.out.println("Periodo: ");
        a4.setPeriodo(Aluno.leitor.nextLine());
        System.out.println("Turno: ");
        a4.setTurno(Aluno.leitor.nextLine());


        //Mostre Todos os nomes na tela
        System.out.println("Nome 1: " + a1.getNome());
        System.out.println("Nome 2: " + a2.getNome());
        System.out.println("Nome 3: " + a3.getNome());
        System.out.println("Nome 4: " + a4.getNome());

        //Leia do teclado um novo valor para o curso de "a4"
        System.out.println("Informe o novo curso do a4: ");
        a4.setCurso(Aluno.leitor.nextLine());

        //Altere o curso de "a1" para o mesmo curso de "a4"
        a1.setCurso(a4.getCurso());

        //Mostre apenas os cursos na tela
        System.out.println("Curso 1: " + a1.getCurso());
        System.out.println("Curso 2: " + a2.getCurso());
        System.out.println("Curso 3: " + a3.getCurso());
        System.out.println("Curso 4: " + a4.getCurso());

        //Faça com que todos os alunos passem a se chamar "Joe Doe"
        a1.setNome("Joe Doe");
        a2.setNome("Joe Doe");
        a3.setNome("Joe Doe");
        a4.setNome("Joe Doe");

        //Mostre todos os dados de todos os alunos na tela
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
