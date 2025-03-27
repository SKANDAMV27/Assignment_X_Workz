package com.xworkz.thursday;

public class Button {
    static final String buttonCompany="cell";
    private Material material;
    void Button(Material material){
        this.material=material;
    }
    void displayButton()
    {
        if(material!=null)
        {
            material.setMaterialPrice(750);
            material.setMaterialType("Wire");
            System.out.println("Material Price: "+material.getMaterialPrice());
            System.out.println("Material Type: "+material.getMaterialType());
        }
    }
}
