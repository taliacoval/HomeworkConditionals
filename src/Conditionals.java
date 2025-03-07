public class Conditionals {
    public static void main(String[] args) {
        String question = "Do you like cats?";
        System.out.println(question);
Conditionals magicEightBall = new Conditionals();

    }

    public Conditionals(){
        int randomInt = (int)(Math.random()*10);
        if (randomInt>0 && randomInt<2){
            System.out.println("without a doubt!");
        } else if (randomInt>1 && randomInt<3) {
            System.out.println("better not tell you now");
        } else if (randomInt>2 && randomInt<4) {
            System.out.println("very doubtful");
        } else if (randomInt>3 && randomInt<5){
            System.out.println("as I see it, yes");
        } else if (randomInt>4 && randomInt<6) {
            System.out.println("you don't want to know the answer");
        } else if (randomInt>5 && randomInt<7) {
            System.out.println("obviously");
        } else if (randomInt>6 && randomInt<8) {
            System.out.println("results are inconclusive");
        } else if (randomInt>7 && randomInt<9) {
            System.out.println("ask again later");
        } else if (randomInt>8 && randomInt<10) {
            System.out.println("no");
        } else if (randomInt>9 && randomInt<11) {
            System.out.println("yes");
        } else{
            System.out.println("you are lame. Ask a better question");
        }


    }

}