# sort-algorithms-with-java

A code collection of popular sort algorithms coded using java

## Description:

This repository contains the java source codes that were written during my practice of implementing various sort algorithms
from scratch using Java.
This repo might be helpful for anyone who needs a quick refresher on popular sorting algorithms and their implementation during their
preparation for a technical interview or an examination.

## Contents:

### 1. Bubble Sort:

#### optimization done to the original algorithm:

The code maintains the last unsorted index which is updated on every outer loop iteration and the inner loop loops through till
the last unsorted index of the array, instead of iterating through the entire array during each loop of the bubbling process.

#### Worst case time complexity:

O(n^2)

#### Implemented Sort Type:

Stable Sort
