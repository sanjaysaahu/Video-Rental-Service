public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    Video(String videoName){
        this.videoName = videoName;
        this.checkOut = false;
        this.rating = 0;
    }

    public String getName(){
        return this.videoName;
    }

    public void doCheckOut(){
        this.checkOut = true;
    }
    public void doReturn(){
        this.checkOut = false;
    }
    public void receiveRating(int rating){
        this.rating = rating;
    }
    public int getRating(){
        return this.rating;
    }
    public boolean getCheckOut(){
        return  this.checkOut;
    }



}
