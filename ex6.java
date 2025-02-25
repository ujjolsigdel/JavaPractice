public class ex6 {
    public static void main(String[] args) {

        Song ss = new Song("Bombs Away","Eels",10);
        Song ss2 = new Song("Grave Walker","Dave Holland",20);
        Song ss3 = new Song("Voi olla että voi","Asa",30);
        PlayList pla = new PlayList(5);
        pla.addSong(ss);
        pla.addSong(ss2);
        pla.addSong(ss3);
        pla.addSong(new Song("Takapajula","Maustetytöt",100));
        pla.addSong(ss2);
        pla.printAll();
        pla.addSong(ss2);
    }
}
class PlayList {
    private Song[] songs;
    private int numberOfSongs;

    public PlayList(){
        numberOfSongs = 0;
    }
    public PlayList( int maxsize) {
        songs = new Song[maxsize];
    }

    public void addSong(Song s) {
        if (numberOfSongs < songs.length) {
            songs[numberOfSongs] = s;
            numberOfSongs++;

        }
        else {
            System.out.println("PLAYLIST IS FULL");
        }
    }

    public void printAll(){
        for (int i = 0; i < numberOfSongs; i++) {
            System.out.printf("(%d) %s : %s (%d)%n", (i + 1),
                    songs[i].getAuthorName(),
                    songs[i].getSongName(),
                    songs[i].getTimes());
        }
    }


}



// There is no need to modify the Song-class in this task

class Song1 {
    private String songName;
    private String authorName;
    private int times;

    public Song1(){
        songName = "No song";
        authorName = "No author";
        times = 0;
    }
    public Song1(String sn, String an, int tim){
        songName = sn; authorName = an; times = tim;
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
}

