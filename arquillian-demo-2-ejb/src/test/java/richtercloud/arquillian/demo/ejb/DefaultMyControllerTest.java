/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.arquillian.demo.ejb;

import javax.ejb.EJB;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import richtercloud.arquillian.demo.jar.MyController;

/**
 *
 * @author richter
 */
@RunWith(Arquillian.class)
public class DefaultMyControllerTest {
    @Deployment(testable = true)
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
            .addClasses(MyController.class,
                    DefaultMyController.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @EJB
    MyController myController;

    /**
     * Test of random method, of class DefaultMyController.
     */
    @Test
    public void testRandom() throws Exception {
        int value = myController.random();
        System.out.println(value);
    }
}
