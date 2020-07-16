import java.util.Scanner;

public class MovieRatingsExamPrep05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filmsCnt = Integer.parseInt(scanner.nextLine());
        double maxRatingFilm = 0;
        double minRatingFilm = 11;
        String minRatingFilmName = "";
        String maxRatingFilmName = "";
        double totalRating = 0.0;
        for (int i = 0; i < filmsCnt; i++) {
            String filmName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating = totalRating + rating;
            if (rating > maxRatingFilm) {
                maxRatingFilm = rating;
                maxRatingFilmName = filmName;
            }
            if (rating < minRatingFilm) {
                minRatingFilm = rating;
                minRatingFilmName = filmName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f %n", maxRatingFilmName, maxRatingFilm);
        System.out.printf("%s is with lowest rating: %.1f %n", minRatingFilmName, minRatingFilm);
        System.out.printf("Average rating: %.1f ", totalRating / filmsCnt);
    }
}
