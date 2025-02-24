public class ex2 {
    public static void main(String[] args){

        Song s = new Song("Get Lucky","Daft Punk",500);

        System.out.println("Favorite song:" + s.getSongName());
        System.out.println("Author:" + s.getAuthorName());
        System.out.println("Times played:" + s.getTimes());
        System.out.println();

        Song s1 = new Song();
        System.out.println("Favorite song:" + s1.getSongName());
        System.out.println("Author:" + s1.getAuthorName());
        System.out.println("Times played:" + s1.getTimes());
        System.out.println();

        Song s2 = new Song();
        s2.setSongName("Chase");
        s2.setAuthorName("Giorgio Moroder");
        s2.setTimes(50000);

        System.out.println("Favorite song:" + s2.getSongName());
        System.out.println("Author:" + s2.getAuthorName());
        System.out.println("Times played:" + s2.getTimes());
    }
}
class Song {
    private String songName;
    private String authorName;
    private int timesPlayed;

    public Song() {
        this.songName = "No song";
        this.authorName = "No author";
        this.timesPlayed = 0;
    }
    public Song(String songName, String authorName, int timesPlayed){
        this.songName = songName;
        this.authorName = authorName;
        this.timesPlayed = timesPlayed;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public void setTimes(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }

    public String getSongName() {
        return songName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public int getTimes() {
        return timesPlayed;
    }
}


