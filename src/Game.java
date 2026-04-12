public class Game {
    public void startGame(){
        System.out.println("ブラックジャックstart");
        Deck deck = new Deck();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();        
        
        playerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());
        playerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());

        System.out.println("プレイヤーの手札");
        playerHand.showAllHand();
        System.out.println("ディーラーの手札");
        System.out.println(dealerHand.getCards().get(0));

        System.out.println("あなたの得点" + playerHand.getScore());

        Player player = new Player();
        while(player.wantHit()){
            playerHand.addCard(deck.draw());
            playerHand.showAllHand();
            System.out.println("あなたの得点" + playerHand.getScore());
            if(playerHand.isBurst()){
                break;
            }            
        }
        System.out.println("ディーラーのターンです");
        while(dealerHand.getScore() <= 17){
            dealerHand.addCard(deck.draw());
        }
        System.out.println("勝敗判定です");
        Judge judge = new Judge();
        System.out.println(judge.judge(playerHand,dealerHand));
        System.out.println("あなたの得点：" + playerHand.getScore());
        System.out.println("ディーラーの得点：" + dealerHand.getScore());
        System.out.println("あなたの手札：");
        playerHand.showAllHand();
        System.out.println("ディーラーの手札：");
        dealerHand.showAllHand();
    }
}
