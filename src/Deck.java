import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards = new ArrayList<>();

    public Deck(){
        generateDeck();
        shuffle();
    }

    public Card draw(){
        System.out.println("山札からドローします");
        return cards.remove(0);
    }

    public List<Card> getCards(){
        return cards;
    }

    private void generateDeck(){
        System.out.println("トランプを生成します");
        for(Mark mark : Mark.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(mark,rank));
            }
        }
    }
    
    private void shuffle(){
        System.out.println("トランプをシャッフルします");
        Collections.shuffle(cards);
    }

}
