import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public void showAllHand(){
        for(Card card : cards){
            System.out.println(card + ",");
        }
    }

    public int getScore(){
        int sum = 0;
        for(Card card : cards){
            sum += card.getRank().getValue();
        }
        return sum;
    }

    public boolean isBurst(){
        return getScore() > 21;
    }

    public List<Card> getCards(){
        return cards;
    }
}
