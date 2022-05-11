fn main() {
    let arr = [10, 2, 1, 3, 4, 8, 7, 5, 6, 10];
    let arr2 = bubblesort(arr);

    for i in 0..arr2.len() {
        println!("{}", arr2[i]);
    }
}

// rust goes brrrr
fn bubblesort(mut array: [i32; 10]) -> [i32; 10] {
    let mut temp: i32;
    for i in 1..array.len() {
        for j in 0..array.len()-i {
            if array[j] > array[j + 1] {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }

    array
}