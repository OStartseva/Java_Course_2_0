import com.company.task4_2.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    ArrayList<Sweetness> gift = new ArrayList<>();
    private static final double DELTA = 1e-15;

    public void fill() {
        gift.add(new Candy("Аленка", 12.2, 3, "Вкус малины"));
        gift.add(new Candy("Коровка", 10.2, 5, "Вкус карамели"));
        gift.add(new Candy("Грильяж", 11.6, 9, "Вкус ореха"));
        gift.add(new Jellybean("Мармелад", 1.1, 1, "Красный"));
        gift.add(new ChocolateBar("Бабаевский", 12.15, 5, 1999));
    }

    @Test
    public void fullPriceTest() {
        fill();
        Assert.assertEquals("Стоимость подарка вычисляется неверно", 23, NewYearsGift.fullPrice(gift));
    }

    @Test
    public void fullWeightTest() {
        fill();
        Assert.assertEquals(46, NewYearsGift.fullWeight(gift), DELTA);

    }

}