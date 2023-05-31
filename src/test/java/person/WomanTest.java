package person;

import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanTest {

    private Man man;
    private Woman woman;

    @BeforeTest
    @BeforeClass(groups = "initialization")
    public void createPersons() {
        woman = new Woman("Anna", "Poroshenko", 35, null);
        man = new Man("Ivan", "Ivanov", 40, null);
    }
    @Test(groups = "getter")
    public void testGetFirstName(){
        Assert.assertEquals(woman.getFirstName(), "Anna", "Incorrect first name");
    }

    @Test(groups = "getter")
    public void testGetLastName(){
        Assert.assertEquals(woman.getLastName(), "Poroshenko", "Incorrect last name");
    }

    @Test(groups = "getter")
    public void testGetAge(){
        Assert.assertEquals(woman.getAge(), 35, "Incorrect age");
    }


    @Test(groups = "getter")
    public void testGetPartner() {
        Assert.assertEquals(woman.getPartner(), null, "Incorrect partner");

        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "Incorrect partner");
    }

    @Test(groups = "getter")
    public void testGetMaidenName() {
        woman.setMaidenName("Poroshenko");
        Assert.assertEquals(woman.getMaidenName(),"Poroshenko", "Incorrect maiden name");
    }

    @Test
    public void testPartnership(){
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getLastName(), man.getLastName());
        Assert.assertEquals(woman.getPartner(),man);
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), woman.getMaidenName());
        Assert.assertEquals(woman.getPartner(),null);


    }


}
