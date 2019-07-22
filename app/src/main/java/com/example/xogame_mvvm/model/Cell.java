package com.example.xogame_mvvm.model;


import com.example.xogame_mvvm.StringUtility;


public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
