import Rhanulfi.Gerente;
import Rhanulfi.NivelAcesso;

public class Principal {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(  1l,  "Rhanulfi",  "rhanulfi@gmail.com", NivelAcesso.ADMIN,  "RH",
        2.2);
    }
}