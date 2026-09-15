# 🧠 NeetCode & Kattis Solutions — Promit Das

> My solutions to [NeetCode.io](https://neetcode.io) and [Kattis](https://open.kattis.com) problems.

---

## 📊 Progress

| # | Problem | Difficulty | Language | Category |
|---|---------|------------|----------|----------|
| 1 | [Contains Duplicate](Data%20Structures%20%26%20Algorithms/duplicate-integer/) | 🟢 Easy | Python | Arrays & Hashing |
| 2 | [Valid Anagram](Data%20Structures%20%26%20Algorithms/is-anagram/) | 🟢 Easy | Python | Arrays & Hashing |
| 3 | [Two Sum](Data%20Structures%20%26%20Algorithms/two-integer-sum/) | 🟢 Easy | Java | Arrays & Hashing |
| 4 | [Group Anagrams](Data%20Structures%20%26%20Algorithms/anagram-groups/) | 🟡 Medium | Java | Arrays & Hashing |
| 5 | [Top K Frequent Elements](Data%20Structures%20%26%20Algorithms/top-k-elements-in-list/) | 🟡 Medium | Java | Arrays & Hashing |

**Total Solved: 5** · **Easy: 3** · **Medium: 2** · **Hard: 0**

---

## 🗂️ Repository Structure

```
Data Structures & Algorithms/
├── duplicate-integer/          # Contains Duplicate — HashSet approach
│   └── submission-3.py
├── is-anagram/                 # Valid Anagram — Character frequency map
│   └── submission-0.py
├── two-integer-sum/            # Two Sum — HashMap one-pass
│   └── submission-0.java
├── anagram-groups/             # Group Anagrams — Sorted character key
│   └── submission-0.java
└── top-k-elements-in-list/     # Top K Frequent — Bucket sort
    └── submission-0.java

practice/                       # Extra competitive programming practice
├── hashmap.py                  # Custom HashMap implementation
├── A_Twins.py                  # Codeforces — Twins (Greedy)
└── helpfulMaths.py             # Codeforces — Helpful Maths (Counting sort)

Kattis/                         # Kattis programming problems
├── Akcija.java
├── Babelfish.java
├── CD.java
├── CountingStars.java
├── DisastrousDowntime.java
├── ExactChange.java
├── WhatDoesTheFoxSay.java
├── Grid.java
├── SingleSourceShortestPath.java
└── CookingWater.py
```

---

## 🔑 Approach Highlights

### Arrays & Hashing

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| Contains Duplicate | HashSet — return `True` on first collision | O(n) | O(n) |
| Valid Anagram | Character frequency maps comparison | O(n) | O(1)* |
| Two Sum | One-pass HashMap storing complement lookups | O(n) | O(n) |
| Group Anagrams | Character count array as HashMap key | O(n·k) | O(n·k) |
| Top K Frequent | Bucket sort by frequency | O(n) | O(n) |

*\*O(1) since the alphabet size is fixed at 26.*

---

## 🐱 Kattis Solutions

| Problem | Language |
|---------|----------|
| [Akcija](Kattis/Akcija.java) | Java |
| [Babelfish](Kattis/Babelfish.java) | Java |
| [CD](Kattis/CD.java) | Java |
| [Counting Stars](Kattis/CountingStars.java) | Java |
| [Disastrous Downtime](Kattis/DisastrousDowntime.java) | Java |
| [Exact Change](Kattis/ExactChange.java) | Java |
| [What does the fox say?](Kattis/WhatDoesTheFoxSay.java) | Java |
| [Grid](Kattis/Grid.java) | Java |
| [Single source shortest path](Kattis/SingleSourceShortestPath.java) | Java |
| [Cooking Water](Kattis/CookingWater.py) | Python |

---

## ⚙️ Sync

Solutions are synced automatically from [NeetCode.io](https://neetcode.io) via GitHub integration. Each accepted submission is pushed as a separate file (`submission-{n}.{ext}`).

---

## 📝 Languages Used

- **Python** — Quick prototyping and clean syntax for easy problems
- **Java** — Preferred for medium/hard problems with strong type safety

---

*Solving the [NeetCode Roadmap](https://neetcode.io/roadmap) one problem at a time.*
