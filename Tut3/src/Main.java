public class Main {
    public static void main(String[] args) {

        Date d1 = new Date(23,1,2005);

        System.out.println(d1);

        Director di1 = new Director("James","Cameron");

        di1.setDob(d1);

        di1.setNumberOfMovies(123);

        System.out.println(di1);

        Movie m1 = new Movie("Avatar", "Fiction", di1);

        m1.setNoOfAwards(42);

        System.out.println(m1);
    }
}