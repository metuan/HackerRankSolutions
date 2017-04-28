n = int(raw_input().strip())
unsorted = []
unsorted_i = 0
for unsorted_i in xrange(n):
    unsorted_t = str(raw_input().strip())
    unsorted.append(unsorted_t)
# your code goes here
print "\n".join(sorted(unsorted, cmp=lambda a, b: cmp(a, b) if len(a)==len(b) else len(a)-len(b)))
