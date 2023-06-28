
edad = int(input("Ingrese su edad: "))

if edad > 0 and edad <= 10:
    print("La infancia es ingreible y bella")
elif edad > 10 and edad <= 19:
    print("Tienes muchos cambios, mucho por estudiar")
elif edad > 19 and edad <= 29:
    print("Amor y comienza el trabajo")
else:
    print("Error etapa en la vida no encontrada")