

import com.mycompany.empacotadoraACME.Empresa;

public class Principal {
    //atributos
    private static Empresa ACME;

    //metodos
    public static void main ( String args [ ] ) throws InterruptedException {
        //empresa (num de fitas, empregados disponiveis, num max de equipes, produtos a serem empacotados)
        ACME = new Empresa (20,25,4,200);
    }
}