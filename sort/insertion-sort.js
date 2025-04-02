let unsorted = [5, 4, 3, 1, 2, 8, 6, 7, 10, 9];

const insert_sort = (unsorted) => {

    for (let outer = 1; outer < unsorted.length; outer++) {

        let inner = outer;
        let temp = unsorted[outer];

        while (inner > 0 && temp < unsorted[inner - 1]) {
            unsorted[inner] = unsorted[inner - 1];
            inner--;
        }

        unsorted[inner] = temp;

    }

    console.log(unsorted);
}

insert_sort(unsorted);

