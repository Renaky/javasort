
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
    private String name;
   private String platform;
   private String releaseYear;
   private String releaseDate;
   private double metascore;
   private double userReview;
   private int ranking;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getMetascore() {
        return metascore;
    }

    public void setMetascore(double metascore) {
        this.metascore = metascore;
    }

    public double getUserReview() {
        return userReview;
    }

    public void setUserReview(double userReview) {
        this.userReview = userReview;
    }
   
   

   

   
    @Override    
    public int compareTo(Dados outroDado){
      return this.getName().
              compareTo(outroDado.getName());
    }
    
    
     @Override
    public String toString(){
        return getName()+ " : " + getPlatform() ;
    }// fim toString
    
}
