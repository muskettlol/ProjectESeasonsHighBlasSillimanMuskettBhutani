package com.example.projecteseasonshighblassillimanmuskettbuhanti;
import java.util.ArrayList;
import java.util.List;

public class GameState {

    private int potBalance;
    private int currentBet;
    private int currentPhaseLocation;
    private int minimumBet;
    private int playersTurnId;
    private String currentPhase;
    private String[] phases;
//    private List<Card> deck;
//    private List<Player> players;
    /**
     * constructor method declares variables and populates the arrays and lists
     */
    public GameState(){
        //declare default values for the variables
        potBalance = 0;
        currentBet = 0;
        currentPhaseLocation = 0;
        minimumBet = 5; //$5k (this may change)
        playersTurnId = 0;
        phases = new String[9];
        //deck = new ArrayList<Card>();
        //players = new ArrayList<Player>();

        //Creates all 52 card objects and puts them into the deck arraylist
        String suit = null;
        String rank = null;
        for(int i = 1; i < 15; i++){ //starts at 2 so "i" can be used for rank number
            for(int j = 0; j < 4; j++){
                //creates a String for the cardSuit
                if(j == 0){
                    suit = "Club";
                } else if(j == 1){
                    suit = "Heart";
                } else if(j == 2){
                    suit = "Diamond";
                } else {
                    suit = "Spade";
                }
                //creates a String for the cardRank
                if(i == 1){
                    rank = "Ace";
                } else if(i == 11){
                    rank = "Jack";
                } else if(i == 12){
                    rank = "Queen";
                } else if(i == 13){
                    rank = "King";
                } else {
                    rank = i + "";
                }
                //creates the new card
                //deck.add(new Card(rank, suit));
            }
        }

        //Sets up game phases and their order
        int index = 0;
        phases[index] = "Betting-Phase 0";
        index++;
        for(int i = 0; i < 3; i++) {
            phases[index] = "Betting-Phase " + i;
            index++;
            phases[index] = "Draw-Phase " + i;
            index++;
        }
        phases[index] = "Reveal-Phase";
        index++;
        phases[index] = "Reset-Phase";
        //sets current phase
        currentPhase = phases[currentPhaseLocation];

    }

    //copy constructor
    public GameState(GameState orig){
        this.potBalance = orig.potBalance;
        this.currentBet = orig.currentBet;
        this.currentPhaseLocation = orig.currentPhaseLocation;
        this.minimumBet = orig.minimumBet;
        this.currentPhase = orig.currentPhase;
        this.phases = orig.phases;
//        this.deck = orig.deck;
//        this.players = orig.players;
    }

    /**
     * Changes the active game phase and restarts the series if at the end of the phases.
     * Also if all but one player has folded, skip to the Reset-Phase.
     */
    public void changeGamePhase(){
        int numPlayersFolded = 0;
//        for(int i = 0; i < players.size(); i++){ //counts how many players have folded
//            if(players.get(i).getFolded()){
//                numPlayersFolded++;
//            }
        }
//        if(currentPhaseLocation + 1 == currentPhase.length()){
//            currentPhaseLocation = 0;
//        } else if(numPlayersFolded == players.size() - 1){//checks last person standing situation
//            currentPhaseLocation = currentPhase.length() - 1;//skips to Reset-Phase
//        } else {
//            currentPhaseLocation++;
//        }
//        currentPhase = phases[currentPhaseLocation];
//    }

    /** rotates between the player to be the first better */
    public void changeFirstPlayer(){
        this.playersTurnId++;
//        if(this.playersTurnId == this.players.size()){
//            this.playersTurnId = 0;
//        }
    }

    public void setCurrentBet(int value){ this.currentBet = value; }

    public void setPotBalance(int value){ this.potBalance += value; }

    public int getCurrentBet(){ return this.currentBet; }

    public int getPotBalance(){ return this.potBalance; }

    public int getMinimumBet(){ return this.minimumBet; }

//    public List<Player> getPlayersArray(){ return this.players; }
//
//    public List<Card> getDeckArray(){ return this.deck; }

    public String getCurrentPhase(){ return currentPhase; }

}
