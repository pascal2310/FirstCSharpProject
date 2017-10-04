import java.util.ArrayList;

public class Tree {
    private String naam;
    private ArrayList<Tree> kinderen;


    public void printKinderen(){
        if (kinderen == null){
            System.out.println(naam);
            return;
        }
        for (Tree kind : kinderen){
            kind.printKinderen();
        }
    }

    }

