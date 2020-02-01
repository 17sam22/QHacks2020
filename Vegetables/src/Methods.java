
public int numVeg(family fam, VegetablesOptions veg){
  dounble[] array = {fam.vitaminA,fam.vitiminC, fam.vitaminK, fam.iron, fam.calcium, fam.protien, fam.calories, fam.potassium};

  int count = 0;
  int numVeg = 1;
  while(count < 5){
    if(array[0] > 0){
      array[0] -= veg.vitaminA;
      if(array[0]<= 0){
        count++;
      }

      if(array[1] > 0){
        array[1] -= veg.vitaminC;
        if(array[1]<= 0){
          count++;
        }
    }

    if(array[2] > 0){
      array[2] -= veg.vitaminK;
      if(array[2]<= 0){
        count++;
      }

      if(array[3] > 0){
        array[3] -= veg.iron;
        if(array[3]<= 0){
          count++;
        }

        if(array[4] > 0){
          array[4] -= veg.calcium;
          if(array[4]<= 0){
            count++;
          }

          if(array[5] > 0){
            array[5] -= veg.protien;
            if(array[5]<= 0){
              count++;
            }
            if(array[6] > 0){
              array[6] -= veg.calories;
              if(array[6]<= 0){
                count++;
              }
              if(array[7] > 0){
                array[7] -= veg.potassium;
                if(array[7]<= 0){
                  count++;
                }

    numVeg++;
  }
  return numVeg;
}
-----------------------------------------------------------------------------
 public double gardenSpace(int numVeg, VegetablesOptions veg){
   int space = numVeg*veg.area;
   return space;
 }

 --------------------------------------------------------------------------

public double totalWater(int numVeg, VegetablesOptions veg){
  int water = numVeg*veg.dailyWater;
  return water;
}
----------------------------------------------------------------------------
