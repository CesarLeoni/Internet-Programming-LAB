#date and time display
import datetime
now = datetime.datetime.now()
print ("Current date and time : ")
print (now.strftime("%Y-%m-%d %H:%M:%S"))

#sphere volume
import math
#radius = float(input("Insert radius: "))
radius=2
V=4*math.pi*radius**3/3
print("Sphere volume is: ",V)

#cauta un nr intr-o lista
def list_count_x(nums,x):
    count = 0
    for num in nums:
        if num==x:
            count = count+1
    return count

list = [1,2,3,4,5,6,5,4,3,2,1]
x=3
print(x,"appears in",list, " ",list_count_x(list,x)," times")


qq