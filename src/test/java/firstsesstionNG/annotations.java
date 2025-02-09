package firstsesstionNG;

import org.testng.annotations.*;

public class annotations {

      @BeforeSuite


         public void beforesuite(){
}
@BeforeMethod
public void beforemethod()
{
    System.out.println("before method");
}



    @Test
    public void TESTCase1()
    {
        System.out.println("testcase1");
    }

    @Test
    public void testcase2()
    {
        System.out.println("testcase2");
    }

    @AfterMethod
public void aftermethod()
    {
        System.out.println("after method");
    }
}
