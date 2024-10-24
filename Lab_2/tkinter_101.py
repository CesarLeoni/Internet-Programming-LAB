import tkinter as tk


# print("Basic Tkinter Example")
# window = tk.Tk()
# greeting = tk.Label(text="Hello, Tkinter!")
# greeting.pack()
# window.mainloop()

# print("Tkinker fonts and colors")
# window = tk.Tk()
# greeting = tk.Label(text="Hello, Tkinter",
#                 foreground = "white",##white text
#                     background="black",font = ("Arial Bold",50))## black background
# greeting.pack()
# window.mainloop()


# print("Nice button and action example")
# def write_slogan():
#     print("Tkinter is easy to use!")
#     greeting = tk.Label(text="Hello, Tkinter",
#                     foreground = "white",##white text
#                     background="black",
#                     font = ("Arial Bold",50))## black background
#     greeting.pack()
# def quit():
#     root.destroy()
#
# root = tk.Tk()
# frame = tk.Frame(root)
# frame.pack()
#
# button = tk.Button(frame,text="QUIT", fg="red", command=quit)
# button.pack(side=tk.LEFT)
#
# slogan = tk.Button(frame,text="Hello", command=write_slogan)
# slogan.pack(side=tk.LEFT)
# root.mainloop()


print("Example 17: utilizarea de continut dinamic in eticheta")
counter =0
def counter_label(label):
    counter = 0
    def count():
        global counter
        counter += 1
        label.config(text=str(counter))
        label.after(1000, count)
    count()
root = tk.Tk()
root.title("Counting Seconds")
label = tk.Label(root, fg="dark green")
label.pack()
counter_label(label)
button = tk.Button(root, text='Stop', width=25, command=root.destroy)
button.pack()
root.mainloop()

