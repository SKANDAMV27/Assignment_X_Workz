package com.XworkZ;

public class FoodMenu {
    public void Menu(Food food)
    {
        food.items();
        food.name();
        food.price();
        food.type();
        food.teast();
        if(food instanceof Biryani)
        {
            Biryani biryani = (Biryani) food;
            biryani.avaliable();
        }
    }
}
