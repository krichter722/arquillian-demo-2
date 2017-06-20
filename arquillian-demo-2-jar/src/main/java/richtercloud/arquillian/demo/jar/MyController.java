/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.arquillian.demo.jar;

import javax.ejb.Local;

/**
 *
 * @author richter
 */
@Local
public interface MyController {

    public int random();
}
