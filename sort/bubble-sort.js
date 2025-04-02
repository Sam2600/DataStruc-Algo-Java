let unsorted = [1, 3, 2, 5, 4];

const bubble_sort = (unsorted) => {

    let out_ = 1;
    let isSwappable = true;

    let sortCount = 0;

    while (out_ < unsorted.length && isSwappable) {
        
        let in_ = 0;
        isSwappable = false;

        while (in_ < unsorted.length - out_) {
            
            if (unsorted[in_] > unsorted[in_ + 1]) {
                let temp = unsorted[in_];
                unsorted[in_] = unsorted[in_ + 1];
                unsorted[in_ + 1] = temp;

                isSwappable = true;
            }

            in_++;
        }

        out_++;
        sortCount++;
    }

    console.log(sortCount);
    console.log(unsorted);

}

bubble_sort(unsorted);