public enum Mark {
    SPADE("スペード","S"),
    HEART("ハート","H"),
    DIAMOND("ダイヤ","D"),
    CLUB("クラブ","C");

    private final String symbolName;
    private final String symbol;

    Mark(String symbolName, String symbol){
        this.symbolName = symbolName;
        this.symbol = symbol;
    }   

    public String getSymbolName(){
        return symbolName;
    }
    public String getSymbol(){
        return symbol;
    }
}
