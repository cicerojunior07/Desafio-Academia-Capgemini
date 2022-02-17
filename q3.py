def anagrama(string):

 
    n = len(string)
    p = dict()
      

    for i in range(n):
        sb = ''
        for j in range(i, n):
            sb = ''.join(sorted(sb + string[j]))
            p[sb] = p.get(sb, 0)
              
 
            p[sb] += 1
  
    ana = 0
      
  
    for k, v in p.items():
        ana += (v*(v-1))//2
    return ana
  
# Driver Code
string = "ifailuhkqq"
print(anagrama(string))
  