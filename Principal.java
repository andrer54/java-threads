

import com.mycompany.empacotadoraACME.Empresa;

public class Principal {
    //atributos
    private static Empresa ANDRE;

    //metodos
    public static void main ( String args [ ] ) throws InterruptedException {
        //empresa (num de fitas, empregados disponiveis, num max de equipes, produtos a serem empacotados)
        ANDRE = new Empresa (20,25,4,200);
    }
}