def ransom_note(magazine, ransom):
    for word in ransom:
        try:
            magazine.remove(word)
        except ValueError:
            return False
    return True
    
m, n = map(int, input().strip().split(' '))
magazine = input().strip().split(' ')
ransom = input().strip().split(' ')
answer = ransom_note(magazine, ransom)
if(answer):
    print("Yes")
else:
    print("No")
