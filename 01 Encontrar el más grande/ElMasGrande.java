class ElMasGrande {
    //writte a method to return the largest on an array
    public static int largest(int[] array){
      int largest = Integer.MAX_VALUE;
      //check empty array thorw an exception
      for(int i = 0; i < array.length-1; i++){
        if(array[i] > largest){
          largest = array[i];
        }
      }
      return largest;
  }
}