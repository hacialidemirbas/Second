package MDReview;

public class MovieDecision {
    public static void main(String[] args) {
        decideMovie(5.6,84500,154000.89);
    }

    public static void decideMovie(double imdb,int totalVotes,double boxOffice){
        if( (imdb*totalVotes/boxOffice) > 10 ){
            System.out.println("Watch the Movie");
        }
        else {
            System.out.println("Do not Watch the Movie");
        }
    }
}
