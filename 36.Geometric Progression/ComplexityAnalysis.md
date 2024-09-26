# Fermat's Little Theorem

- **If you have a prime number `p`, and any number `a` (as long as `a` isn’t divisible by `p`), the result of `a^(p-1) mod p` is always 1.**

This means:
a^(p-1) ≡ 1 (mod p)

### Why Did We Use It in This Problem?

In this problem, we are working with very large exponents. Specifically, we have to compute something like `2^(2^N) mod 1000000007`, where `N` can be as large as `10^18`. This is an enormous number, and directly calculating it would be impossible with regular methods.

Here’s where Fermat’s Little Theorem comes in handy:

### Step 1: Reduce the Exponent Using Fermat's Theorem

Instead of calculating `2^(2^N) mod 1000000007`, Fermat’s theorem allows us to reduce the exponent:

2^N mod (1000000007 - 1) = 1000000006

This reduction is crucial to make the problem solvable within time limits.

### Step 2: Use the Reduced Exponent

After reducing the exponent using Fermat's theorem, we can compute:

2^reduced_exponent mod 1000000007

Which is much easier to calculate.

So, Fermat's theorem helped us handle the **huge exponent problem** by reducing it to something manageable.

### Where Can You Use Fermat’s Theorem?

You can use **Fermat’s Little Theorem** in any problem where you have to work with:

- **Modular arithmetic:** Especially when you are taking powers of numbers modulo a large prime number.
- **Large exponents:** If you need to calculate something like `a^b mod p` and both `a` and `b` are large numbers, Fermat’s theorem helps simplify the calculation.
- **Inverse modulo:** Fermat’s theorem helps you find the modular inverse of a number. If `p` is prime, then the inverse of `a` modulo `p` is `a^(p-2) mod p`. This is because:

### Conclusion:

Fermat's Little Theorem is a powerful tool when dealing with large numbers in modular arithmetic. It simplifies complex calculations, especially when the numbers involved are very large, as seen in the problem we worked on.

# COMPLEXITY ANALYSIS

## Time complexity:
- The function modExp is going to run in logarithmic time as the exponent is divided into half after evry iteration,to know more in detail why logarithmic review q-5 ie.,powe of numbers to get clarity
- Hence the time complexity is O(log(exp))
- The function geoProg runs for log(N) time sas it contains the recursive function called in it
- **TOTAL COMPLEXITY:** O(log(N))

## Space complexity:
- Due to recursive depth,the recursive stack takes O(log(N)) space
- The variables used takes constant space->O(1)
- **TOTAL COMPLEXITY:** O(log(N))
