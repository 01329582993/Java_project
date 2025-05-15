import java.io.*;
import java.util.*;

public class MOVIE {

    public static class Movies {

        int Id;
        String Title;
        String Name_director;;
        String Name_producer;
        String Actors;
        String Genre;

        public Movies(int id, String tt, String nd, String np, String act, String gr) {
            this.Id = id;
            this.Title = tt;
            this.Name_director = nd;
            this.Name_producer = np;
            this.Actors = act;
            this.Genre = gr;
        }

        public boolean SearchMovie(String tt) {
            if (Title == tt) {
                return true;
            } else
                return false;
        }

        public void ViewMovies() {
            System.out.println("Id: " + Id + "\n" + "Title: " + Title + "\n" + "Director name: " + Name_director + "\n"
                    + "producer name: " + Name_producer + "\n" + "Actors & Actress: " + Actors + "\n" + "Genre " + Genre
                    + "\n\n");
        }
    }

    public class Users {
        int IDu;
        String Name;

        public void ViewRMovies() {

        }

    }

    public static void main(String[] args) {
        System.out.println("Hellos");
        Vector<Movies> M = new Vector<>();

        Movies Mo1 = new Movies(1, "Chroma", "Jean", "Leaonar", "Luc", "action");
        M.add(Mo1);
        Movies Mo2 = new Movies(2, "Dead day", "Hassan", "Omar", "Leaonar", "Dram");
        M.add(Mo2);

        Mo1.ViewMovies();
        Mo2.ViewMovies();

        Mo1.SearchMovie("Chroma");

    

    }
}
