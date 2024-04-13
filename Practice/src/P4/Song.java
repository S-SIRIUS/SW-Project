package P4;


public class Song {

    String name;
    public Song(String name){
        this.name = name;
    }

    public String getTitle(){
        return this.name;
    }


    public static void main(String[]args){
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");
        System.out.println("내노래는 "+mySong.getTitle());
        System.out.println("너노래는 "+yourSong.getTitle());
    }
}
