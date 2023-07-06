public class Play2 {

    public static boolean areTwoMoviesEqualFlightLength(int[] movies, int flightLength) {

        // if flightLength - movie = timeLeftForNextMovie
        // if timeLeft = movieLength in that array

        for (int i = 0; i < movies.length - 1; i++) {
            while ((movies[i] != movies[i + 1]) && (movies[i] + movies[i + 1] == flightLength)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] movieLengthArr = {120, 60, 180, 90, 70};
        // Test cases
        System.out.println(areTwoMoviesEqualFlightLength(movieLengthArr, 190) + " == true");
        System.out.println(areTwoMoviesEqualFlightLength(movieLengthArr, 200) + " == false");
    }
}
