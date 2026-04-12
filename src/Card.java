public class Card {
    
    private final Mark mark;
    private final Rank rank;

    public Card(Mark mark, Rank rank){
        this.mark = mark;
        this.rank = rank;
    }

    public Mark getMark(){
        return mark;
    }

    public Rank getRank(){
        return rank;
    }

    @Override
    public String toString() {
        return rank.getLabel() + mark.getSymbol();
    }        
}
