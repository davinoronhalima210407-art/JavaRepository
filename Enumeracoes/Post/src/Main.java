import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Post> posts = new ArrayList<Post>();
        List<Comment> comments = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("How many posts? ");
        int numPosts = input.nextInt();

        for (int i = 0; i < numPosts; i++) {
            System.out.println("Moment of post "+(i+1) + " (DD/MM/YYYY) : ");
            Date momentDate = sdf.parse(input.nextLine());
            System.out.println("Tittle of post: ");
            String tittle = input.nextLine();
            System.out.println("Content of post: ");
            String content = input.nextLine();
            System.out.println("Likes of post: ");
            Integer likes = input.nextInt();
            System.out.println("How many comments of post: ? ");
            int numComments =  input.nextInt();
            for (int j = 0; j < numComments; j++) {
                System.out.println("Comments #" + (j+1) + (" : ") );
                String text = input.nextLine();
                Comment comment = new Comment(text);
                comments.add(comment);
            }
            Post post = new Post(momentDate,tittle, content,likes, new Comment(comments));

        }

    }
}