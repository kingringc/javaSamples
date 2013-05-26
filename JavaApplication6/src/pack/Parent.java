/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author chandru
 */
public class Parent {
    public String firstName;
    public String lastName;
    
    public String getName(){
        String fullName = this.firstName+this.lastName;
        return fullName;
    }
}
