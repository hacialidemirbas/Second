package Package8m;

public class movieReview {
    public static void main(String[] args) {
        movieRev(7,3500,1500);

    }
    public static void movieRev(int IMDB, int totalVotes, int boxOffice){
        if(IMDB*totalVotes/boxOffice>10){
            System.out.println("Watch the movie");
        }
        else{
            System.out.println("Do not watch");
        }
    }
}
