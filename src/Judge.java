public class Judge {

    public Result judge(Hand playerHand,Hand dealerHand){
        int playerScore = playerHand.getScore();
        int dealerScore = dealerHand.getScore();

        if(playerHand.isBurst()){
            return Result.LOSE;
        }
        if(dealerHand.isBurst()){
            return Result.WIN;
        }

        if(playerScore > dealerScore){
            return Result.WIN;
        }else if(playerScore < dealerScore){
            return Result.LOSE;
        }else{
            return Result.DRAW;
        }

    }
}
