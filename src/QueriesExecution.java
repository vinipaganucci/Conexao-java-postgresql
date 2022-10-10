import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QueriesExecution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		CursoDAO cursoDAO = new CursoDAO();
		
		System.out.print("Digite o nome do curso que está procurando: ");
		String cursoCedido = scanner.next();
		
		String cursoParaConsulta = cursoDAO.getNomeCurso(cursoCedido);
		
		
		if (cursoParaConsulta.equals(cursoCedido)) {
			System.out.println("O curso está na lista");
		} else {
			System.out.println("O curso de " + cursoCedido + " não está na lista");
		}

        // =========================== 1 - Consulta =================================================
        List<Curso> curso = cursoDAO.list();

        curso.stream().forEach(System.out::println);
        
        
        
      
	}
}
