package com.gdmitchell.hoardmaster.domain.card.impl;

import com.gdmitchell.hoardmaster.domain.card.CardSet;
import com.gdmitchell.hoardmaster.domain.card.CardSubtype;
import com.gdmitchell.hoardmaster.domain.card.CardType;
import com.gdmitchell.hoardmaster.domain.mana.Mana;
import com.gdmitchell.hoardmaster.domain.card.Rarity;

/**
 * Basic card class.
 *
 * @author gdmitchell
 */
public class DefaultCard {
    private String name;
    private Mana castingCost;
    private String flavorText;
    private String artistName;
    private CardSet cardSet;
    private Rarity rarity;
    private CardType type;
    private CardSubtype subType;
    private Art art;
    private String copyright;
}
