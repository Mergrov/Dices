import java.sql.Array;

public class Rules {
    Dices dice1; Dices dice2; Dices dice3; Dices dice4; Dices dice5; Dices dice6;
    int[] helperArray =new int[5];{
            helperArray[0]=dice1.result();
            helperArray[1]=dice2.result();
            helperArray[2]=dice3.result();
            helperArray[3]=dice4.result();
            helperArray[4]=dice5.result();
            helperArray[5]=dice6.result();
    }
}