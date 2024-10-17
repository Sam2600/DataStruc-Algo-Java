let unsorted = [5, 2, 9, 1, 11, 7, 8, -1, 4, 3, 10, 14, 0, 6];

const selection_sort = (unsorted) => {

    for (let i = 0; i < unsorted.length; i++) {

        let smallest_index = i;

        for (let j = i + 1; j < unsorted.length; j++) {

            if (unsorted[j] < unsorted[smallest_index]) {
                smallest_index = j;
            }
        }

        let temp = unsorted[smallest_index];
        unsorted[smallest_index] = unsorted[i];
        unsorted[i] = temp;

    }

    return unsorted;

}

console.log(selection_sort(unsorted));