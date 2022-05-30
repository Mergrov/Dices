public class Dices {
    // dowiedź się o co chodzi ze static'em i czemu randomizery zwracały NULL bez tego słowa przy funkcji.
        public static int result(){
            int minValue = 1;
            int maxValue = 6;
            int Roll = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
            return Roll;
        }


    Dices dice1 = new Dices();
    Dices dice2 = new Dices();
    Dices dice3 = new Dices();
    Dices dice4 = new Dices();
    Dices dice5 = new Dices();
    Dices dice6 = new Dices();


}








