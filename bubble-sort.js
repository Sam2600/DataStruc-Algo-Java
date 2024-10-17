let unsorted = [5, 69, 13, 52, 2, 8, 6, 7, 10, 9, 4, 1, 12, 2, 100, 1001];

const bubble_sort = (unsorted) => {
    
    for (let i = 0; i < unsorted.length - 1; i++) {
        
        for (let j = 0; j < unsorted.length - i; j++) {
            
            if (unsorted[j] > unsorted[j + 1]) {
                let temp = unsorted[j];
                unsorted[j] = unsorted[j + 1];
                unsorted[j + 1] = temp;
            }

        }
    }

    return unsorted;
}

console.log(bubble_sort(unsorted));