package com.example.mypackage;

/*
    Fastest n + lgn - 2 comparisons implementation of the
     Maximum Pairwise Product algorithm

    L_and_S (array of length n):
      Let A = copy of input
      // base case
      if n == 2:
        if A[1] > A[2]:
          return (1, 2)
        else:
          return (2, 1)

      // recursive case
      Let W be new array length n/2 (keeps track of largest elements)
      Let M be new array length n/2 (keeps track of swaps)
      for i in 1 ... n/2:
        // swap larger element into first position of pair
        // set M[i] to 1 if pair was swapped, else 0
        // move larger element into W
        if A[2*i - 1] < A[2*i]:
          temp = A[2*i - 1]
          A[2*i - 1] = A[2*i]
          A[2*i] = temp
          M[i] = 1
        else:
          M[i] = 0
        W[i] = A[2*i - 1]

      // now recurse on W
      (j, k) = L_and_S(W)
      // map back from W to A
      j_swap = M[j]
      k_swap = M[k]
      j = 2*j - 1
      k = 2*k - 1
      if A[j + 1] > A[k]:
        k = j + 1
        k_swap = 0 - j_swap
      return (j + j_swap, k + k_swap) // account for the swap

      Adapted from ryan's solution at https://cs.stackexchange.com/questions/83022/find-largest-and-second-largest-elements-of-the-array
 */
public class MaximumPairwiseProductFastest {
}
