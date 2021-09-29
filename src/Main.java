import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int flip = 0, iphone = 0, a70 = 0, redmi = 0, s21 = 0, motog = 0;
        String auxiliar;

        System.out.println("Voce tem interesse em jogar jogos pesados no seu celular?");
        auxiliar = scnr.nextLine();
        if (auxiliar.equals("sim")) {
            flip++;
            redmi++;
            iphone++;
        }

        System.out.println("Voce usa muito o celular durante o dia?");
        auxiliar = scnr.nextLine();
        if (auxiliar.equals("sim")) {
            flip++;
            redmi++;
            s21++;
            iphone++;
        }


        //Se as duas perguntas forem verdadeiras
        if (flip == 2 || redmi == 2 || iphone > 1) {
            System.out.println("Voce gosta de celulares dobraveis?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                flip += 10;
            } else {
                flip--;
                System.out.println("Voce usa o Instagram profissionalmente?");
                auxiliar = scnr.nextLine();
                if (auxiliar.equals("sim")) {
                    iphone++;
                }
            }
        }

        //Se uma pergunta apenas for verdadeira
        if (s21 == 0) { //entao o usuario tem interesse em jogar jogos pesados
            System.out.println("Voce joga casualmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                a70++;
                motog++;
            }

            System.out.println("Voce usa as rede sociais casualmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                iphone++;
                redmi++;
            }

        }

        if(s21 == 1){
            System.out.println("Você usa as redes sociais profissionalmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                iphone += 2;
                s21++;
            }

            System.out.println("Quer uma tela grande?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                redmi++;
                flip++;
                s21++;
                a70++;
            }
        }

        if(s21 == 0 || motog == 0 || a70 == 0 || iphone == 0 || redmi == 0){
            System.out.println("Deseja uma câmera de qualidade?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                flip++;
                iphone++;
                s21++;
                a70++;
            }

            System.out.println("Deseja um celular custo befício?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                a70 += 2;
                motog++;
            }
        }



    }
}

