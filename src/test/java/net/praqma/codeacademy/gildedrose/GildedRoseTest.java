package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void ItemNameShouldBePreserved() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    public void AgedBrieShouldIncreaseInValueAsTimePasses(){
    	Item[] items = new Item[] { new Item("Aged brie", 10, 10) };
	GildedRose uut = new GildedRose(items);
	uut.updateQuality();
	assertEquals("Aged brie", uut.items[0].name);
	}
}
