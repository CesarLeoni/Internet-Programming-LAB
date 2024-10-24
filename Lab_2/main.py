#EXEMPLUL 1
print("Exemplul 1:lists")
xs = [3, 1, 2] # se introduce o lista
print(xs, xs[2]) # se afisează "[3, 1, 2] 2"
print(xs[-1]) # Index negative – de la sfarșitul listei;print "2"
xs[2] = 'foo' # lista poate conține elemente de tip diferit
print(xs) # afisează "[3, 1, 'foo']"
xs.append('bar') # adaugarea de elemente
print(xs) # Print "[3, 1, 'foo', 'bar']"
x = xs.pop() # se elimină si returnează ultimul element dintr-o listă
print(x, xs) # se afisează "bar [3, 1, 'foo']"

#EXEMPLUL 2
print("\nExemplul 2:lists")
nums = list(range(5)) # lista de intregi de la 0 la 4
print(nums)
print(nums[2:4]) #elem de la index 2 la index 4
print(nums[2:]) #elem de la index 2 in colo
print(nums[:2]) #elem pana la index 2 (exclusiv)
print(nums[:])
print(nums[:-1]) # 0,1,2,3
nums [2:4] = [543,314]
print(nums)

#exemplul 3
print("\nExemplul 3:loops")
animals = ['dog', 'cat', 'fish']
for animal in animals:
    print(animal)

#EXEMPLUL 4
print("\nExemplul 4:dictionaries")
d= {'cat':'cute','dog':'furry'}
print(d['cat'])
print('cat' in d)
d['fish']='wet'
print(d.get('monkey', 'N/A'))
print(d.get('fish', 'N/A'))
del d['fish']

#EXEMPLU 5
print("\nExemplul 5:sets")
animals_set = {'dog', 'cat'}
print('cat' in animals_set)
print('fish' in animals_set)
animals_set.add('fish')
print('fish' in animals_set)
print(len(animals_set))
animals_set.add('cat')
print(len(animals_set))
animals_set.remove('cat')
print(len(animals_set))
print()

for idx,animal in enumerate(animals_set):
    print('#%d: %s' % (idx+1,animal))#ordine impredictibila cred

#EXEMPLUL 6
print("\nExemplul 6:tuples")
d6={(x,x+1):x for x in range(10)}
t=(5,6)

print(type(t))
print(d6[t])
print(d6[(1,2)])
print(d6)

#EXEMPLUL 7
import numpy as np
print("\nExemplul 7: numpy array")
a=np.array([1,2,3]) #create a rank 1 array
print(type(a))
print(a.shape)
print(a[0],a[1],a[2])
a[0]=5
print(a)

b=np.array([[1,2,3],[4,5,6]])
print(b.shape)
print(b[0,0],b[0,1],b[1,0])

#EX8
print("\nExemplul 9: numpy array functions")
z=np.zeros((2,2))
print(z)

o=np.ones((1,2))
print(o)

f=np.full((2,2),7)
print(f)

e= np.eye(2)
print(e)

r=np.random.random((2,2))
print(r)

print()
#exercises
#1
m=np.random.randn(2,2)
any_el_diff_of_0 = np.any( z!=0)

print("Sunt toate elementele diferite de 0?",any_el_diff_of_0)

#2
matrix2 = np.array([1,7,13,105])
memory = matrix2.nbytes
print(f"Matricea {matrix2} ocupa {memory} bytes")

#3
matrix3 = np.arange(30,71)
print(f"Matricea urmatoare are o serie de elem de la 30 la 70 {matrix3}")


