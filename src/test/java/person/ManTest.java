package person;

import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManTest
{

    private Man man;
    private Woman woman;

    @BeforeTest
    @BeforeClass(groups = "initialization")
    public void createPersons()
    {
       woman = new Woman("Anna","Poroshenko", 35, null);
       man = new Man("Ivan", "Ivanov", 40, null);

    }

    @Test(groups = "getter")
    public void testGetFirstName(){
        Assert.assertEquals(man.getFirstName(), "Ivan", "Incorrect first name");
    }

    @Test(groups = "getter")
    public void testGetLastName(){
        Assert.assertEquals(man.getLastName(), "Ivanov", "Incorrect last name");
    }

    @Test(groups = "getter")
    public void testGetAge(){
        Assert.assertEquals(man.getAge(), 40, "Incorrect age");
    }


    @Test(groups = "getter")
    public void testGetPartner(){
        Assert.assertEquals(man.getPartner(), null, "Incorrect partner");

        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "Incorrect partner");
    }

    @Test
    public void testRetirement(){
        Assert.assertFalse(man.isRetired(), "Expected not retired");
        man.setAge(70);
        Assert.assertTrue(man.isRetired(), "Expected retired");

    }
}
