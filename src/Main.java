import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leonardo Luize
        //Leonardo Falango
        //André Kovalski

        System.out.println("\n| Descubra o seu celular ideal |");
        System.out.println("Responda apenas com sim ou nao!");

        Scanner scnr = new Scanner(System.in);
        int aux = 0, index = 0;
        int[] celulares = new int[6];
        String[] nome = new String[6];
        String auxiliar;
        nome[0] = "Z Flip 3";
        nome[1] = "Iphone 13";
        nome[2] = "A70";
        nome[3] = "Redmi note 9";
        nome[4] = "S21";
        nome[5] = "MotoG 100";

        for(int x = 0;celulares.length> x; x++){
            celulares[x] = 0;
        }

        System.out.println("\nVoce tem interesse em jogar jogos pesados no seu celular?");
        auxiliar = scnr.nextLine();
        if (auxiliar.equals("sim")) {
            celulares[0]++;
            celulares[1]++;
            celulares[3]++;
            celulares[5] += 2;
        }

        System.out.println("\nVoce usa muito o celular durante o dia?");
        auxiliar = scnr.nextLine();
        if (auxiliar.equals("sim")) {
            celulares[0]++;
            celulares[3]++;
            celulares[4]++;
            celulares[1]++;
        }


        //Se as duas perguntas forem verdadeiras
        if (celulares[0] == 2 || celulares[3] == 2 || celulares[1] > 1) {
            System.out.println("\nVoce gosta de celulares dobraveis?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[0] += 100;
            }
        }

        //Se uma pergunta apenas for verdadeira
        if (celulares[4] > 0) { //entao o usuario tem interesse em jogar jogos pesados
            System.out.println("\nVoce joga casualmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[2]++;
                celulares[3]++;
            }

            System.out.println("\nVoce usa as rede sociais casualmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[3] += 2;
                celulares[5]++;
            }

        }

        if(celulares[4] == 1){
            System.out.println("\nVoce usa as redes sociais profissionalmente?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[1] += 2;
                celulares[4]++;
                celulares[3]++;
            }

            System.out.println("\nQuer uma tela grande?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[0]++;
                celulares[2]++;
                celulares[3]++;
                celulares[4] += 2;
                celulares[5] += 2;
            }
        }

        if(celulares[4] == 0 || celulares[5] == 0 || celulares[2] == 0 || celulares[1] == 0 || celulares[3] == 0){
            System.out.println("\nDeseja uma camera de qualidade?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[0]++;
                celulares[1]++;
                celulares[4]++;
                celulares[2]++;
            }

            System.out.println("\nDeseja um celular custo beneficio?");
            auxiliar = scnr.nextLine();
            if (auxiliar.equals("sim")) {
                celulares[1] -= 5;
                celulares[2] += 5;
                celulares[5] += 2;
            }
        }

        for(int x = 0; celulares.length > x; x++ ){
            if(celulares[x] > aux) {
                aux = celulares[x];
                index = x;
            }
        }

        System.out.println("\nO seu celular ideal é: "+ nome[index]);
        System.out.println("Pix para comprar: 090.933.699-70");

    }
}