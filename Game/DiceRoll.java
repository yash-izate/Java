package Game;

class Dice {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        Dice dice = new Dice();

        while (true) {
            int result = dice.roll();
            System.out.println(result);
            if (result == 6) {
                System.out.println("You Won!");
                break;
            }
        }
    }

}
