# 🧠 NeetCode & Kattis Solutions — Promit Das

> My solutions to [NeetCode.io](https://neetcode.io) and [Kattis](https://open.kattis.com) problems.

---

## 📊 Progress

**29 solutions in this repo** — 19 from NeetCode, 10 from Kattis.

### NeetCode

| # | Problem | Difficulty | Language | Category |
|---|---------|------------|----------|----------|
| 1 | [Contains Duplicate](Data%20Structures%20%26%20Algorithms/duplicate-integer/) | 🟢 Easy | Python | Arrays & Hashing |
| 2 | [Valid Anagram](Data%20Structures%20%26%20Algorithms/is-anagram/) | 🟢 Easy | Python | Arrays & Hashing |
| 3 | [Two Sum](Data%20Structures%20%26%20Algorithms/two-integer-sum/) | 🟢 Easy | Java | Arrays & Hashing |
| 4 | [Group Anagrams](Data%20Structures%20%26%20Algorithms/anagram-groups/) | 🟡 Medium | Java | Arrays & Hashing |
| 5 | [Top K Frequent Elements](Data%20Structures%20%26%20Algorithms/top-k-elements-in-list/) | 🟡 Medium | Java | Arrays & Hashing |
| 6 | [Encode and Decode Strings](Data%20Structures%20%26%20Algorithms/string-encode-and-decode/) | 🟡 Medium | Java | Arrays & Hashing |
| 7 | [Product of Array Except Self](Data%20Structures%20%26%20Algorithms/products-of-array-discluding-self/) | 🟡 Medium | Java | Arrays & Hashing |
| 8 | [Valid Sudoku](Data%20Structures%20%26%20Algorithms/valid-sudoku/) | 🟡 Medium | Java | Arrays & Hashing |
| 9 | [Longest Consecutive Sequence](Data%20Structures%20%26%20Algorithms/longest-consecutive-sequence/) | 🟡 Medium | Java | Arrays & Hashing |
| 10 | [Valid Palindrome](Data%20Structures%20%26%20Algorithms/is-palindrome/) | 🟢 Easy | Java | Two Pointers |
| 11 | [Two Sum II](Data%20Structures%20%26%20Algorithms/two-integer-sum-ii/) | 🟡 Medium | Java | Two Pointers |
| 12 | [3Sum](Data%20Structures%20%26%20Algorithms/three-integer-sum/) | 🟡 Medium | Java | Two Pointers |
| 13 | [Valid Parentheses](Data%20Structures%20%26%20Algorithms/validate-parentheses/) | 🟢 Easy | Java | Stack |
| 14 | [Min Stack](Data%20Structures%20%26%20Algorithms/minimum-stack/) | 🟡 Medium | Java | Stack |
| 15 | [Evaluate Reverse Polish Notation](Data%20Structures%20%26%20Algorithms/evaluate-reverse-polish-notation/) | 🟡 Medium | Java | Stack |
| 16 | [Daily Temperatures](Data%20Structures%20%26%20Algorithms/daily-temperatures/) | 🟡 Medium | Java | Stack |
| 17 | [Binary Search](Data%20Structures%20%26%20Algorithms/binary-search/) | 🟢 Easy | Java | Binary Search |
| 18 | [Best Time to Buy and Sell Stock](Data%20Structures%20%26%20Algorithms/buy-and-sell-crypto/) | 🟢 Easy | Java | Sliding Window |
| 19 | [Reverse Linked List](Data%20Structures%20%26%20Algorithms/reverse-a-linked-list/) | 🟢 Easy | Java | Linked List |

**NeetCode: 19** · 🟢 Easy 8 · 🟡 Medium 11 · 🔴 Hard 0

### Kattis

| Problem | Difficulty | Language |
|---------|------------|----------|
| [Akcija](Kattis/Akcija.java) | 1.4 Easy | Java |
| [Exact Change](Kattis/ExactChange.java) | 1.6 Easy | Java |
| [What does the fox say?](Kattis/WhatDoesTheFoxSay.java) | 1.8 Easy | Java |
| [Babelfish](Kattis/Babelfish.java) | 2.0 Easy | Java |
| [Cooking Water](Kattis/CookingWater.py) | 2.0 Easy | Python |
| [CD](Kattis/CD.java) | 2.1 Easy | Java |
| [Single source shortest path](Kattis/SingleSourceShortestPath.java) | 2.1 Easy | Java |
| [Counting Stars](Kattis/CountingStars.java) | 2.2 Easy | Java |
| [Grid](Kattis/Grid.java) | 2.3 Easy | Java |
| [Disastrous Downtime](Kattis/DisastrousDowntime.java) | 2.7 Easy | Java |

**Kattis: 10** · 9 Java · 1 Python · difficulty 1.4 – 2.7

### By language

| Language | Solutions |
|----------|-----------|
| Java | 26 |
| Python | 3 |

---

## 🗂️ Repository Structure

```
Data Structures & Algorithms/    # NeetCode, one folder per problem slug
├── duplicate-integer/          # Contains Duplicate — HashSet
├── is-anagram/                 # Valid Anagram — frequency map
├── two-integer-sum/            # Two Sum — one-pass HashMap
├── anagram-groups/             # Group Anagrams — char-count key
├── top-k-elements-in-list/     # Top K Frequent — bucket sort
├── string-encode-and-decode/   # Encode/Decode — length prefixing
├── products-of-array-discluding-self/  # prefix x suffix products
├── valid-sudoku/               # Valid Sudoku — row/col/box bitsets
├── longest-consecutive-sequence/       # sequence starts only
├── is-palindrome/              # Valid Palindrome — two pointers
├── two-integer-sum-ii/         # Two Sum II — two pointers
├── three-integer-sum/          # 3Sum — sort + two pointers
├── validate-parentheses/       # Valid Parentheses — stack
├── minimum-stack/              # Min Stack — parallel min stack
├── evaluate-reverse-polish-notation/   # RPN — operand stack
├── daily-temperatures/         # monotonic decreasing stack
├── binary-search/              # Binary Search — overflow-safe mid
├── buy-and-sell-crypto/        # Best Time to Buy/Sell — min so far
└── reverse-a-linked-list/      # Reverse Linked List — iterative

Kattis/                         # Kattis programming problems
├── Akcija.java
├── Babelfish.java
├── CD.java
├── CookingWater.py
├── CountingStars.java
├── DisastrousDowntime.java
├── ExactChange.java
├── Grid.java
├── SingleSourceShortestPath.java
└── WhatDoesTheFoxSay.java

practice/                       # Extra competitive programming practice
├── hashmap.py                  # Custom HashMap implementation
├── A_Twins.py                  # Codeforces — Twins (Greedy)
└── helpfulMaths.py             # Codeforces — Helpful Maths (Counting sort)
```

---

## 🔑 Approach Highlights

### Arrays & Hashing

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| Contains Duplicate | HashSet — return on first collision | O(n) | O(n) |
| Valid Anagram | Character frequency maps comparison | O(n) | O(1)* |
| Two Sum | One-pass HashMap storing complement lookups | O(n) | O(n) |
| Group Anagrams | Character count array as HashMap key | O(n·k) | O(n·k) |
| Top K Frequent | Bucket sort by frequency | O(n) | O(n) |
| Encode and Decode Strings | Length-prefix each string (`len#payload`) so any delimiter is safe | O(n) | O(n) |
| Product of Array Except Self | Prefix products, then a running suffix product | O(n) | O(1)† |
| Valid Sudoku | One pass with row / column / box seen-flags | O(1)‡ | O(1)‡ |
| Longest Consecutive Sequence | Count only from numbers with no left neighbour | O(n) | O(n) |

### Two Pointers

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| Valid Palindrome | Converge from both ends, skipping non-alphanumerics | O(n) | O(1) |
| Two Sum II | Input is sorted — move the pointer that corrects the sum | O(n) | O(1) |
| 3Sum | Sort, fix one value, two-pointer the rest, skip duplicates | O(n²) | O(1)§ |

### Stack

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| Valid Parentheses | Push openers, match each closer against the top | O(n) | O(n) |
| Min Stack | Parallel stack whose top is always the current minimum | O(1) per op | O(n) |
| Evaluate RPN | Operand stack; subtraction and division respect operand order | O(n) | O(n) |
| Daily Temperatures | Monotonic decreasing stack of indices awaiting a warmer day | O(n) | O(n) |

### Binary Search · Sliding Window · Linked List

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| Binary Search | `l + (r - l) / 2` to avoid midpoint overflow | O(log n) | O(1) |
| Best Time to Buy and Sell Stock | Track cheapest price so far, best profit against it | O(n) | O(1) |
| Reverse Linked List | Iterative pointer rewiring with a trailing `prev` | O(n) | O(1) |

*\*O(1) since the alphabet size is fixed at 26.*
*†Excluding the output array.*
*‡Board size is fixed at 9x9.*
*§Excluding the sort and the output list.*

---

## ⚙️ Sync

NeetCode solutions sync automatically from [NeetCode.io](https://neetcode.io) via GitHub integration — each accepted submission lands as its own file (`submission-{n}.{ext}`).

Two file names are used inside each problem folder, and the distinction is deliberate:

| File | Meaning |
|------|---------|
| `submission-{n}.{ext}` | A real accepted submission, synced from NeetCode. Reserved — nothing else is ever written under this name. |
| `solution.{ext}` | Written by hand to the same signature, for a problem the sync has not backfilled yet. |

Keeping them apart means the sync can backfill a genuine submission into any folder without overwriting anything, and both versions can sit side by side.

Kattis has no such integration; those solutions are added by hand.

---

## 📝 Languages Used

- **Python** — Quick prototyping and clean syntax for easy problems
- **Java** — Preferred for medium/hard problems with strong type safety

---

*Solving the [NeetCode Roadmap](https://neetcode.io/roadmap) one problem at a time.*
