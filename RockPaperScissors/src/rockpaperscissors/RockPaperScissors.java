package rockpaperscissors;

public class RockPaperScissors {

    public static void main(String[] args) {
        Option.Rock ro = new Option.Rock();
        Option.Paper pa = new Option.Paper();
        Option.Scissors sc = new Option.Scissors();
        Option a[] = new Option[3];
        a[0] = ro;
        a[1] = pa;
        a[2] = sc;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                boolean win = a[i].beats(a[j]);
                boolean lose = a[i].losesTo(a[j]);
                //boolean tie = !win && !lose;
                String s;
                if (win) {
                    s = " beats ";
                } else if (lose) {
                    s = " loses to ";
                } else {
                    s = " ties to ";
                }
                System.out.println(a[i] + s + a[j]);
            }
            System.out.println();
        }
    }

}
