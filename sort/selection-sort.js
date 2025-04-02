let unsorted = [5, 2, 9, 1, 11, 7, 8, -1, 4, 3, 10, 14, 0, 6];

const selection_sort = (unsorted) => {

    for (let outer = 0; outer < unsorted.length - 1 ; outer++) {
        
        var min = outer;

        for (let inner = outer + 1; inner < unsorted.length; inner++) {
            if (unsorted[min] > unsorted[inner]) {
                min = inner;
            }
        }

        let temp = unsorted[outer];
        unsorted[outer] = unsorted[min];
        unsorted[min] = temp;
    }

    console.log(unsorted);
}

selection_sort(unsorted);