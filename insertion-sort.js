let unsorted = [5, 4, 3, 1, 2, 8, 6, 7, 10, 9];

const insert_sort = (unsorted) => {

    for (let i = 1; i < unsorted.length; i++) {

        let key = unsorted[i];

        let j = i - 1;

        while (j >= 0 && unsorted[j] > key) {
            unsorted[j + 1] = unsorted[j]
            --j;
        }

        unsorted[j + 1] = key;
    }

    return unsorted;
}

console.log(insert_sort(unsorted));

