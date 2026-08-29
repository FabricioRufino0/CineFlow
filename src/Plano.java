import java.sql.SQLOutput;
import java.util.Scanner;

public class Plano {

    String tipoDePlano = "";
    double valorDoPlano;



    void verificaTipoDePlano(String tipoDePlano) {
        switch (tipoDePlano) {
            case "normal":
                tipoDePlano = "Normal";
                break;
            case "basic":
                tipoDePlano = "Basic";
                break;
            case "premium" :
                tipoDePlano = "Premium";

        }
    }

    //-------------------------------------------------


     if (tipoDePlano == 'Premium') {
        System.out.println("Esta incluido no seu plano");
    } else{
        System.out.println("Infelizmente nao esta incluido no seu plano");
    }


}
