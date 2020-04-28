# Assumption -> original_list is a sorted list


def do_insertions_fast(insertion_list, original_list):
    original_list_dup = original_list.copy()
    output_list = []  # Create a new, empty list. We will use this list to build up the output.
    for i in insertion_list:  # For each pair (i, x) in insertions, do the following:
        if i[0] <= len(output_list):  # If i is less than the current length of the output list,
            output_list.insert(i[0], i[1])  # insert x into the output list at the appropriate position.
        else:  # Otherwise, do as follows:
            for element in original_list:  # Find out how many list elements should fall between the current end of
                # the original list and the place x should go.
                if element >= i[1]:
                    output_list.append(element)
                    # Take only those elements from the original list l, and concatenate
                    # them to the output list.
                    original_list_dup.remove(element)
            output_list.append(i[1])  # Then append x to the end of the output list.
        original_list = original_list_dup.copy()
    output_list += original_list  # Finally, after all insertions are done, concatenate any remaining elements
    # of l onto the output list.
    return output_list  # Return the output list.


if __name__ == '__main__':
    result = do_insertions_fast([(1, 2), (3, 4), (8, 1)], [5, 6, 7, 8])
    print(result)
