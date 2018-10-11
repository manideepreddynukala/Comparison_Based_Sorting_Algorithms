class Quick_Small_Subproblem
{
    public void sort(int[] inputArray, int left, int right)
    {
        if (left < right)
        {
            if (left-right <= 10) //If size is less than or equal to 10, call insertion sort
            {
                Insertion_Sort IS = new Insertion_Sort();
                IS.sort(inputArray);
            }
            else
            {
                int partition = this.partition(inputArray, left, right);
                this.sort(inputArray, left, partition - 1);
                this.sort(inputArray, partition + 1, right);
            }
        }
    }
    private int partition(int[] inputArray, int left, int right)
    {
        int leftTemp = left;
        int rightTemp = right;
        int pivot = inputArray[left];
        while (leftTemp < rightTemp)
        {
            if (inputArray[leftTemp] < pivot)
            {
                leftTemp++;
                continue;
            }
            if (inputArray[rightTemp] > pivot)
            {
                rightTemp--;
                continue;
            }
            int tmp = inputArray[leftTemp];
            inputArray[leftTemp] = inputArray[rightTemp];
            inputArray[rightTemp] = tmp;
            leftTemp++;
        }
        return leftTemp;
    }
}