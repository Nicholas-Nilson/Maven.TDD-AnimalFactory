package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        //Given
        Cat testCat = new Cat("Marlow", null, 4);
        CatHouse.add(testCat);
        int catID = testCat.getId();
        //When
        Cat actualCat = CatHouse.getCatById(4);
        //Then
        Assert.assertEquals(testCat, actualCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatTest() {
        //Given
        Cat testCat = new Cat("Alfalfa", null, 13);
        CatHouse.add(testCat);
        int catID = testCat.getId();
        CatHouse.remove(13);
        //When
        Cat actualCat = CatHouse.getCatById(13);
        //Then
        Assert.assertNull(actualCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCatByNameTest() {
        //Given
        Cat testCat = new Cat("Alfalfa", null, 13);
        CatHouse.add(testCat);
        int catID = testCat.getId();
        CatHouse.remove(testCat);
        //When
        Cat actualCat = CatHouse.getCatById(13);
        //Then
        Assert.assertNull(actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest() {
        //Given
        Cat testCat = new Cat("Alfalfa", null, 13);
        Cat testCat2 = new Cat("Sprinkle", null, 12);
        CatHouse.add(testCat);
        CatHouse.add(testCat2);
        //When
        Cat actualCat = CatHouse.getCatById(12);
        //Then
        Assert.assertEquals(testCat2, actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats() {
        //Given
        Cat testCat = new Cat("Athos", null, 1);
        Cat testCat2 = new Cat("D'artagnan", null, 4);
        Cat testCat3 = new Cat("Porthos", null, 3);
        Cat testCat4 = new Cat("Aramis", null, 2);
        CatHouse.add(testCat);
        CatHouse.add(testCat2);
        CatHouse.add(testCat3);
        CatHouse.add(testCat4);
        int expected = 4;
        //When
        int actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
