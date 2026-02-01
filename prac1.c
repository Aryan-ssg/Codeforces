

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

void findMinMax(int A[], int n, int *out_min, int *out_max) {
    if (n <= 0) {
        printf("Error: array must have at least one element.\n");
        exit(1);
    }

    int minv, maxv;
    int i = 0;

    if (n == 1) {
        minv = maxv = A[0];
        *out_min = minv;
        *out_max = maxv;
        return;
    }

    // Initialize for even/odd n
    if (n % 2 == 0) {
        // compare first two
        if (A[0] < A[1]) {
            minv = A[0];
            maxv = A[1];
        } else {
            minv = A[1];
            maxv = A[0];
        }
        i = 2;
    } else {
        minv = maxv = A[0];
        i = 1;
    }

    // Process in pairs
    while (i <= n - 2) {
        int a = A[i];
        int b = A[i + 1];
        int smaller, larger;
        if (a < b) {
            smaller = a; larger = b;
        } else {
            smaller = b; larger = a;
        }

        if (smaller < minv) minv = smaller;
        if (larger > maxv)  maxv = larger;

        i += 2;
    }

    *out_min = minv;
    *out_max = maxv;
}

int main(void) {
    int n;
    if (scanf("%d", &n) != 1) return 0;
    if (n < 0) return 0;
    if (n == 0) {
        printf("Array empty\n");
    } 

    int *arr = malloc(sizeof(int) * n);
    for (int i = 0; i < n; ++i) scanf("%d", &arr[i]);

    int mn, mx;
    findMinMax(arr, n, &mn, &mx);
    printf("Minimum = %d\nMaximum = %d\n", mn, mx);
    free(arr);
    return 0;
}
