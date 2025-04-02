let nums = [-4, 1, 3, 0, 11, 5, 3, 2];

const sortedSquares = (nums) => {

   let squaredNums = [];

   for (let i = 0; i < nums.length; i++) {
      squaredNums[i] = nums[i] * nums[i];
   }

   for (let outer = 1; outer < squaredNums.length; outer++) {
      
      let temp = squaredNums[outer];
      let inner = outer;

      while (inner > 0 && temp <= squaredNums[inner - 1]) {

         if (temp < squaredNums[inner - 1]) {
            squaredNums[inner] = squaredNums[inner - 1];
            inner--;
         } else {
            break;
         }
      
      }

      squaredNums[inner] = temp;
   }

   return squaredNums;
}

sortedSquares(nums);