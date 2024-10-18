const unsorted = [8, 9, 5, 3, 4, 7, 6, 1];

const merge_sort = (unsorted) => {

    let left_arr = [];
    let right_arr = [];

    if (unsorted.length <= 1) {
        return;
    }

    let pivot = Math.floor(unsorted.length / 2);

    let j = 0;
    
    for (let i = 0; i < unsorted.length; i++) {

        if (i < pivot) {
            left_arr[i] = unsorted[i];
        } else {
            right_arr[j] = unsorted[i];
            j++;
        }
    }

    merge_sort(left_arr);
    merge_sort(right_arr);
    merge(left_arr, right_arr, unsorted);

    return unsorted;

}

const merge = (left_arr, right_arr, unsorted) => {

    let i = 0;
    let l = 0;
    let r = 0;

    let left = unsorted.length / 2;
    let right = unsorted.length - left;

    while (l < left && r < right) {

        if (left_arr[l] > right_arr[r]) {

            unsorted[i] = right_arr[r];
            r++;
            i++;

        } else {

            unsorted[i] = left_arr[l];
            l++;
            i++;
        }

    }

    while (r < right) {
        unsorted[i] = right_arr[r];
        i++;
        r++;
    }

    while (l < left) {
        unsorted[i] = left_arr[l];
        i++;
        l++;
    }
}

console.log(merge_sort(unsorted));