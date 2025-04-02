const mapRoamToInt = (val) => {

   switch (val) {
      case "I":
         return 1;
      
      case "V":
         return 5;
      
      case "X":
         return 10;
      
      case "L":
         return 50;
      
      case "C":
         return 100;
      
      case "D":
         return 500;
   
      default:
         return 1000;
   }
}

var romanToInt = function (s) {

   let index = 0;
   let total = 0;

   let roman_arr = s.split('');

   while (index < roman_arr.length) {

      let map1 = mapRoamToInt(roman_arr[index]);

      if (index + 1 >= roman_arr.length) {
         total = total + map1;
         index += 1;

      } else {

         let map2 = mapRoamToInt(roman_arr[index + 1]);

         if (map1 < map2) {
            total = total + (map2 - map1);
            index += 2;
   
         } else if (map1 >= map2) {
            total = total + map1;
            index += 1;
         }
      }
      
   }

   console.log(total);
};

romanToInt("XL");