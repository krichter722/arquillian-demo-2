/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.arquillian.demo.ejb;

import java.util.Random;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import richtercloud.arquillian.demo.jar.MyController;

/**
 *
 * @author martin
 */
@Stateless
public class DefaultMyController implements MyController {

    public DefaultMyController() {
    }

    @Override
    public int random() {
        int retValue = new Random().nextInt();
        return retValue;
    }
}
