package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name).isEqualTo("foo");
    }

    @Test
    void wine1() {
        Item[] items = new Item[] { new Item("Aging Red Wine 4", -150, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(14);
    }

    @Test
    void wine2() {
        Item[] items = new Item[] { new Item("Aging Red Wine 2", -50, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(21);
    }

    @Test
    void wine3() {
        Item[] items = new Item[] { new Item("Aging Red Wine 2", 50, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(20);
    }
}
