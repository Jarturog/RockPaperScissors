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
                boolean gana = a[i].beats(a[j]);
                boolean pierde = a[i].losesTo(a[j]);
                //boolean empate = !beats && !losesTo;
                String s;
                if (gana) {
                    s = " beats ";
                } else if (pierde) {
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
