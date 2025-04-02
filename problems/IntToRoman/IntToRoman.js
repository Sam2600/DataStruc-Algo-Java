const mapIntToRoman = (val) => {

   switch (val) {
      case 1:
         return "I";
      
      case 5:
         return "V";
      
      case 10:
         return "X";
      
      case 50:
         return "L";
      
      case 100:
         return "C";
      
      case 500:
         return "D";
   
      default:
         return "M";
   }
}

var IntToRoman = function (s) {

   //const int_arr = `${s}`.split('').map(Number);

   console.log(s % 10);
};

IntToRoman(323);