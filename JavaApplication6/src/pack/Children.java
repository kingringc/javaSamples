/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author chandru
 */
public class Children {
    public static void main(String[] args) {
        Parent userName = new Parent();
        userName.firstName = "suresh";
        userName.lastName = "kumar";
        String name = userName.getName();
        System.out.println(name);
    }
}
