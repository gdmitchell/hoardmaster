package com.gdmitchell.hoardmaster.domain.mana.impl;

import com.gdmitchell.hoardmaster.domain.mana.ManaColor;

/**
 * Default class for mana (costs, etc.)
 *
 * @author gdmitchell
 */
public class DefaultMana {
    private ManaColor manaColor;

    private int number;

    public ManaColor getManaColor() {
        return manaColor;
    }

    public void setManaColor(ManaColor manaColor) {
        this.manaColor = manaColor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
