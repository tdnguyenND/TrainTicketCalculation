class TicketCalculation{
    double calculateTicketPrice(int age, int distance) throws IllegalArgumentException{
        if (age < 0 || distance <= 0){
            throw new IllegalArgumentException("Age or distance is not valid"); // Message should be "Invalid"
        }
        else {
            final double[][] prices = {{5, 9, 12},
                    {7, 11, 14},
                    {9, 13, 16}};
            int ageType, distanceType;
            
            if (age < 7)
                ageType = 0;
            else if (age < 14) // Should be: age < 16
                ageType = 1;
            else ageType = 2;

            if (distance < 50)
                distanceType = 0;
            else if (distance < 150)
                distanceType = 1;
            else distanceType = 2;

            return prices[ageType][distanceType];
        }
    }
}