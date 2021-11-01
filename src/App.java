import java.time.Month;
import java.time.LocalDate;

public class App {   
    public static void main(String[] args) {
    Cliente julia = new Cliente();
    julia.nome = "Julia Barboza";
    julia.rg = "99999";
    julia.cpf = "88888";
    julia.dateDeNascimento = LocalDate.of(1970, Month.AUGUST,23);
    julia.email = "julia.barboza@gmail.com";
    julia.telefone = "4444444";

    }
}
