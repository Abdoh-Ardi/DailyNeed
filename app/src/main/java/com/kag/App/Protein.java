package com.kag.App;

public class Protein {

    /**
     * https://nutritionwithdoc.com/wp-content/uploads/2015/09/Protein-Calculation-Formula.pdf
     * @param weight weight in kg
     * @param activityRate Constant depend on daily rate of activity of ADULTS ONLY
     * @return daily protein needs
     */
    public double proteinNeeds(double weight,String activityRate){
        switch (activityRate){
            case "sedentary":
                return weight*.8;
            case "active":
                return weight*1.4;
            case "athlete":
                return weight*1.8;
            default:
                return 0;
        }
    }

    }

