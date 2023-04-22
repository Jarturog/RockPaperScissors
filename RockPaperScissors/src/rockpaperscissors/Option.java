package rockpaperscissors;

public abstract class Option {

    public static class Rock extends Option {

        @Override
        public String toString() {
            return "rock";
        }

        @Override
        public boolean beats(Option o) {
            return o instanceof Scissors;
        }

        @Override
        public boolean losesTo(Option o) {
            return o instanceof Paper;
        }

    }

    public static class Paper extends Option {

        @Override
        public String toString() {
            return "paper";
        }

        @Override
        public boolean beats(Option o) {
            return o instanceof Rock;
        }

        @Override
        public boolean losesTo(Option o) {
            return o instanceof Scissors;
        }

    }

    public static class Scissors extends Option {

        @Override
        public String toString() {
            return "scissors";
        }

        @Override
        public boolean beats(Option o) {
            return o instanceof Paper;
        }

        @Override
        public boolean losesTo(Option o) {
            return o instanceof Rock;
        }

    }

    @Override
    public abstract String toString();

    public abstract boolean beats(Option o);

    public abstract boolean losesTo(Option o);
}
