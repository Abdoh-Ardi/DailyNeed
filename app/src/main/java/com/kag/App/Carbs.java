package com.kag.App;

public class Carbs extends Convert{
    /**
     * calculates the daily carbs intake in grams
     * using the formula from this website
     * @see <a href="https://www.verywellfit.com/yes-you-do-need-carbs-every-day-2506236">veryWellfit.com</a>
     *
     * @param dailyCalorie intake
     * @return carbohydrate in grams
     */
    public double formula(double dailyCalorie) {
        return (dailyCalorie/2)/4;
    }

}
