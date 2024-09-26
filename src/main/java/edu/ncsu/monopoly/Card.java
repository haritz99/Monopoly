package edu.ncsu.monopoly;
//I have added a comment�
public abstract class Card {
	//modificado el dia 26/09/2024
    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
