import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;
    public void addVideo(String name){
        Video video = new Video(name);
        store.add(video);
        System.out.println("Video \""+name+"\"  added successfully");

    }

    public Video getVideo(String name){
        for(Video video : store){
            if(video.getName().equals(name)) return video;
        }
        return null;
    }
    public void doCheckOut(String name){
        Video video = getVideo(name);
        video.doCheckOut();
        System.out.println("Video \""+name+"\" checked out successfully");
    }
    public void doReturn(String name){
        Video video = getVideo(name);
        video.doReturn();
        System.out.println("Video \""+name+"\" Returned successfully");

    }
    public void receiveRating(String name, int rating){
        Video video = getVideo(name);
        video.receiveRating(rating);
        System.out.println("Video \""+name+"\" Rated successfully");
    }
    public void listInventory(){
        for(Video video: store){
            System.out.println(video.getName() + " "+ video.getCheckOut()+" "+ video.getRating());
        }

    }

}
