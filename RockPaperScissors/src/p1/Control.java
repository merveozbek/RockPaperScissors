package p1;

import java.util.Scanner;

public class Control
{

    Scanner keyboard = new Scanner(System.in);
    int logicPlayer1=0;
    int logicPlayer2=0;
    Game Player1Model;
    Game Player2Model;
    String player1 = "Player1";
    String player2 = "Player2";


    public Control() {
    }


    public void Player1Control(){
        System.out.println("lütfen 1-3 arası değer giriniz:");
        int getValue = keyboard.nextInt();
        if(getValue>=1 && getValue<=3){
            Player1Model = new Game(getValue,player1);

        }else{
            System.out.println("aralığın dışında değer girdiniz");
            Player1Control();
        }

    }

    public void Player2Control() {
        System.out.println("lütfen 1-3 arası değer giriniz:");
        int getValue2 = keyboard.nextInt();

        if (getValue2 >= 1 && getValue2 <= 3) {
            Player2Model = new Game();
            Player2Model.setPlayer(player2);
            Player2Model.setValue(getValue2);


        } else {
            System.out.println("aralığın dışında değer girdiniz");
            Player2Control();

        }
    }

    public void compare()
    {
        if(Player1Model.getValue()==Player2Model.getValue()){

            System.out.println("bu oyunun kazananı yok.");

        }else {

            switch(Player1Model.getValue())
            {
                case 1:
                    if (Player2Model.getValue()==2){
                        System.out.println("tebrikler player1 kazandı");
                    }else{

                        System.out.println("player2 kazandı");
                    }
                    break;
                case 2:
                    if(Player2Model.getValue()==1){
                        System.out.println("player2 kazandı");

                    }else{
                        System.out.println("player1 kazandı");

                    }
                    break;
                case 3:

                    if(Player2Model.getValue()==1){
                        System.out.println("player1 kazandı");

                    }else {
                        System.out.println("player 2 kazandı");
                    }
                    break;
                default:

            }

        }


    }




    public void start(){
        Player2Control();
        Player2Control();
        compare();
    }


}
