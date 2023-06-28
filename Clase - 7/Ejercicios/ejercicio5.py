calificacion = int(input("Ingrese el valor de la calificación en números: "))

if 9 <= calificacion <= 10:
    print("A")
elif 8 <= calificacion < 9:
    print("B")
elif 7 <= calificacion < 8:
    print("C")
elif 6 <= calificacion < 7:
    print("D")
elif 5 <= calificacion < 6:
    print("E")
elif 0 <= calificacion < 6:
    print("F")