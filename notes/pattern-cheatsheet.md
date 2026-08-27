# Pattern Cheatsheet

## Two Pointers
Use when: array/string problem needs comparing or converging from both ends, or in-place manipulation.
Signal words: "sorted array", "pair sum", "reverse", "palindrome".

## Sliding Window
Use when: contiguous subarray/substring with a size or sum condition.
Signal words: "subarray of size k", "longest substring with...", "smallest window".

## HashMap / HashSet
Use when: need O(1) lookups for frequency, duplicates, or complements.
Signal words: "two sum", "anagram", "contains duplicate", "frequency count".

## Binary Search
Use when: sorted array (or search space is monotonic), looking for a target/boundary.
Signal words: "find in sorted", "search insert position", "minimum that satisfies condition".

## Recursion / Backtracking
Use when: problem breaks into smaller identical subproblems, or need to explore all combinations.
Signal words: "all combinations", "permutations", "nth term", memoize for overlapping subproblems.

## Tree Traversal
Use when: hierarchical data, need to visit nodes in specific order (in/pre/post-order, level order = BFS).
Signal words: "binary tree", "depth", "ancestor", "path sum".

## Graphs
Use when: nodes with arbitrary connections (not strictly hierarchical), need shortest path or connectivity.
Signal words: "connected components", "shortest path", "cycle detection", "topological order".

## Dynamic Programming
Use when: optimal substructure + overlapping subproblems (can you define state in terms of smaller states?).
Signal words: "maximum/minimum ways", "longest common", "can you reach", knapsack-style constraints.

## Stacks / Queues
Use when: need LIFO/FIFO order, matching pairs, or "next greater/smaller element" style problems.
Signal words: "valid parentheses", "next greater element", "monotonic".