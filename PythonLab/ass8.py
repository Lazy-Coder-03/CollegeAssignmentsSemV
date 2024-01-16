# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# Implement popular sorƟng algorithms like quick sort and merge sort to sort 
# lists of numbers. . [01.12.23] 

# Quick sort

def quickSort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less_than_pivot = [x for x in arr[1:] if x <= pivot]
        greater_than_pivot = [x for x in arr[1:] if x > pivot]
        return quickSort(less_than_pivot) + [pivot] + quickSort(greater_than_pivot)


# Merge sort

def mergeSort(arr):
    if len(arr) <= 1:
        return arr

    middle = len(arr) // 2
    left_half = arr[:middle]
    right_half = arr[middle:]

    left_half = mergeSort(left_half)
    right_half = mergeSort(right_half)

    return merge(left_half, right_half)

# Merge function for merge sort algorithm

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])

    return result

def main():
    arr1 = [56,98,12,7,9,23,1,25,45,60]
    n = len(arr1)
    print("Unsorted array              :",arr1)
    q_sort=quickSort(arr1)
    print("Sorted array using quicksort:",q_sort)
    print("---------------------------------------------------------------")
    arr2 = [56,98,12,7,9,23,1,25,45,60]
    print("Unsorted array              :",arr2)
    m_sort=mergeSort(arr2)
    print("Sorted array using mergesort:",m_sort)

if __name__ == "__main__":
    main()
    
# Output:
#     Unsorted array              : [56, 98, 12, 7, 9, 23, 1, 25, 45, 60]
#     Sorted array using quicksort: [1, 7, 9, 12, 23, 25, 45, 56, 60, 98]
#     ---------------------------------------------------------------
#     Unsorted array              : [56, 98, 12, 7, 9, 23, 1, 25, 45, 60]
#     Sorted array using mergesort: [1, 7, 9, 12, 23, 25, 45, 56, 60, 98]

# Visualizations of the above algorithms (for better understanding) in the form of functions that print the steps of the algorithms:

def quickSortVis(arr): #show the pivot and the array after partitioning
    print(f"Original Array: {arr}")

    if len(arr) <= 1:
        return arr

    #mid = len(arr) // 2
    pivot = arr[0]
    less_than_pivot = [x for x in arr[1:] if x <= pivot]
    greater_than_pivot = [x for x in arr[1:] if x > pivot]

    print(f"Pivot: {pivot}")
    print(f"Less than Pivot: {less_than_pivot}")
    print(f"Greater than Pivot: {greater_than_pivot}")

    sorted_left = quickSortVis(less_than_pivot)
    sorted_right = quickSortVis(greater_than_pivot)

    result = sorted_left + [pivot] + sorted_right
    print(f"Sorted Array: {result}")

    return result

    
# Merge sort
    
#not using Merge Function
def mergeSortVis(arr): #show the splitting and merging of the array
    print(f"Splitting: {arr}")
    
    if len(arr) > 1:
        middle = len(arr) // 2
        left_half = arr[:middle]
        right_half = arr[middle:]

        print(f"   Left half: {left_half}")
        print(f"   Right half: {right_half}")

        mergeSortVis(left_half)
        mergeSortVis(right_half)

        i = j = k = 0

        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

    print(f"Merging: {arr}")