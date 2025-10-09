public class Movie {

    private final String title;
    private final String category;
    private int noOfAwards;
    private final Director director;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String toString(){
        return "Movie [ Title = " + title + ", Category = " + category + ", Number of Awards = " + noOfAwards + ", Director Name = " + director.getName() + ", Director Surname = " + director.getSurname() + " ]";
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public Director getDirector(){
        return director;
    }

    public void setNoOfAwards(int noOfAwards){
        this.noOfAwards = noOfAwards;
    }

    public int getNoOfAwards(){
        return noOfAwards;
    }

}
