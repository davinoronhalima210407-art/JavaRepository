import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String tittle;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<Comment>();



    public Post(Date moment, String tittle, String content, Integer likes) {
        this.moment = moment;
        this.tittle = tittle;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public void addComent(Comment comment) {
        comments.add(comment);
    }
    public void removeComent(Comment comment) {
        comments.remove(comment);
    }
}
