package com.spring.demo.SpringCoreConcept;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;
    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = SortAlgorithm.sort(numbers);

        // search the array

        return 3;
    }
}
