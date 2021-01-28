package com.kag.App;

public class Calories {
    /**
     * bmrValue : variable in class scope , initialized & returned by bmr method and used by
     * calorieNeeds method to return the daily calorie needs respect the daily workout rate.
     */
    double bmrValue;

    /**Calculate Male or Female (Basal Metabolic Rate) in Metric
     * Unnamed Constants are gender specific and in Metric Standards.
     * https://i.imgur.com/h9UAhP5.png
     * @param gender Gender of User
     * @param weight Weight in Metric Standards
     * @param height Height in Metric Standards
     * @param age User Age
     * @return BMR for male or female
     */

    public double bmr(char gender , double weight , double height , byte age){

        switch(gender){
            case 'M':
            case 'm':
                bmrValue = 66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
                return bmrValue;
            case 'F':
            case 'f':
                bmrValue = 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
                return bmrValue;

            default:
                return 0;
        }

    }

    /**
     *
     * @param bmrValue declared in class scope and initialized by bmr method. Multiplied
     *                 by factor of workout to calculate daily calories needs.
     *
     * @param activityRate constants, reflect how much calories per day needed respect to
     *                      daily workout level.
     * https://i.imgur.com/aPZla1B.png
     * @return calorie needs per day respect to workout level.
     */
    public double calorieNeeds(double bmrValue,String activityRate){
        switch (activityRate){
            case "sedentary":
                return bmrValue*1.2;
            case "lightly active":
                return bmrValue*1.375;
            case "moderately active":
                return bmrValue*1.55;
            case "very active":
                return bmrValue*1.725;
            case "super active":
                return bmrValue*1.9;
            default:
                return 0;
        }
    }


}
