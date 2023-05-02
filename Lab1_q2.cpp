#include <iostream>
using namespace std;

int main() {
    // Initializing the array
    int arr[10];

    // Reading the integer values and storing in the array
    for (int i = 0; i < 10; i++) {
        cout << "Enter number " << i+1 << " : ";
        cin >> arr[i];
    }

    // Counting the numbers greater than 100 and calculating their summation
    int count = 0;
    int total = 0;
    for (int i = 0; i < 10; i++) {
        if (arr[i] > 100) {
            count++;
            total += arr[i];
        }
    }

    // Printing the result
    cout << "There are " << count << " numbers more than 100 and their total values is " << total << endl;

    return 0;
}

