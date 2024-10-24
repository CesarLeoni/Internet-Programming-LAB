import numpy as np
import matplotlib.pyplot as plt

#exemplul 10
print("Exemplul 10: matplotlib")
x = np.arange(0, 3 * np.pi, 0.1)
y = np.sin(x)

plt.plot(x,y)
plt.show()


print("\nExemplul 11: matplotlib")
y_cos=np.cos(x)
plt.plot(x,y)
plt.plot(x,y_cos)

plt.xlabel('X axis label')
plt.ylabel('Y axis label')

plt.title('Sine and cosine')
plt.legend(['Sine', 'Cosine'])
plt.show()

print("\nExemplul 12: subplots")
plt.subplot(2,1,1)
plt.plot(x,y)
plt.title('Sine')

plt.subplot(2,1,2)
plt.plot(x,y_cos)
plt.title('Cosine')

plt.show()

#exercitii
#1
print("\nExercitiu 1:")
x_axis = np.arange(0,50,0.1)
y_axis = 3*x_axis
plt.plot(x_axis,y_axis)
plt.title('Draw a line')
plt.xlabel('x - axis')
plt.ylabel('y - axis')
plt.show()

#exemplu 13
print("\nExemplu 13: bar chart")
x = ['Java', 'Python','PHP','JavaScript','C#','C++']
popularity = [22.2,17.6,8.8,8,7.7,6.7]
x_pos = [i for i, _ in enumerate(x)]
plt.bar(x_pos,popularity, color='green')
plt.xlabel('Languages')
plt.ylabel('Popularity')

plt.title("Popularity of Programming Languages\n"
          +"Worldwide, Oct 2020 compared to a year ago")

plt.xticks(x_pos,x)

plt.minorticks_on() #turn on the grid
plt.grid(which='major', linestyle='-', linewidth='0.5',color='red')

#customize the minor grid
plt.grid(which='minor', linestyle=':',linewidth='0.5',color='black')
plt.show()


print("\nExercitiu 2: horizontal bar chart")
x = ['Java', 'Python', 'PHP', 'JavaScript', 'C#', 'C++']
popularity = [22.2, 17.6, 8.8, 8, 7.7, 6.7]
x_pos = [i for i, _ in enumerate(x)]

# Horizontal bar chart
plt.barh(x_pos, popularity, color='green')

# Setting labels and title
plt.ylabel('Languages')  # Now the languages are on the y-axis
plt.xlabel('Popularity')

plt.title("Popularity of Programming Languages\n"
          + "Worldwide, Oct 2020 compared to a year ago")

# Setting the y-ticks (labels for the bars)
plt.yticks(x_pos, x)

# Turn on major and minor grids
plt.minorticks_on()
plt.grid(which='major', linestyle='-', linewidth='0.5', color='red')
plt.grid(which='minor', linestyle=':', linewidth='0.5', color='black')

plt.show()




