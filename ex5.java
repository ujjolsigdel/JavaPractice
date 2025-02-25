public class ex5 {
    public static void main(String[] args) {

//        Song ss = new Song("Bombs Away","Eels",10);
//        Song ss2 = new Song("Grave Walker","Dave Holland",20);
//        Song ss3 = new Song("Voi olla että voi","Asa",30);
//        Player pl = new Player (ss,ss2,ss3);
//        pl.printAll();

        Player pl2 = new Player (new Song("Bombs Away","Eels",10),new Song("Grave Walker","Dave Holland",20),new Song("Voi olla että voi","Asa",30));
        Song sing = new Song();
        System.out.println(sing.getNumberOfSongs());
        System.out.println(pl2.getSong2().getSongName());
    }
}

class Player {
    private Song song1;
    private Song song2;
    private Song song3;

    public Player(Song song1, Song song2, Song song3) {
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }


    public Song getSong1() {
        return song1;
    }
    public Song getSong2() {
        return song2;
    }
    public Song getSong3() {
        return song3;
    }

    public void printAll(){
        System.out.println("(1) " + song1.getAuthorName() + " : " + song1.getSongName() + " (" + song1.getTimes() + ")");
        System.out.println("(2) " + song2.getAuthorName() + " : " + song2.getSongName() + " (" + song2.getTimes() + ")");
        System.out.println("(3) " + song3.getAuthorName() + " : " + song3.getSongName() + " (" + song3.getTimes() + ")");

    }
}






class Song {
    private String songName;
    private String authorName;
    private int times;

    private static int numberOfSongs = 0;

    public Song(){
        this.songName = "No song";
        this.authorName = "No author";
        this.times = 0;
        numberOfSongs++;
    }


    public Song(String sn, String an, int tim){
        this.songName = sn;
        this.authorName = an;
        this.times = tim;
        numberOfSongs++;
    }
    public void setSongName(String sn){
        songName = sn;
    }
    public void setAuthorName(String an){
        authorName = an;
    }
    public void setTimes(int ti){
        times = ti;
    }
    public int getTimes(){
        return times;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getSongName(){
        return songName;
    }

    public static int getNumberOfSongs() {
        return numberOfSongs;
    }
}

