let unsorted = [5, 2, 9, 1, 11, 7, 8, -1, 4, 3, 10, 14, 0, 6];

const quick_sort = (unsorted, start, end) => {

    if (start < end) {

        let pivot = splitArray(unsorted, start, end);

        quick_sort(unsorted, start, pivot - 1);

        quick_sort(unsorted, pivot + 1, end);
    }

    return unsorted;
}

const splitArray = (unsorted, start, end) => {

    for (let i = start; i <= end; i++) {

        if (unsorted[i] <= unsorted[end]) {

            if (unsorted[i] != unsorted[start]) {

                let temp = unsorted[i];
                unsorted[i] = unsorted[start];
                unsorted[start] = temp;

            }

            start++;
        }
    }

    return start - 1;
}

console.log(quick_sort(unsorted, 0, unsorted.length - 1));