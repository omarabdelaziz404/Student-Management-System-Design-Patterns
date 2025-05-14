/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject2.factory;

/**
 *
 * @author Omar
 */
public class PartTimeStudent extends Student {
    public PartTimeStudent(String id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "Part-time";
    }
}