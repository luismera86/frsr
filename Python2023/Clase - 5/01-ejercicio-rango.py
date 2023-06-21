#Ejercicio: Rango entre 20 y 30

edad = int(input("Ingrese su edad: "))
veintes = edad >= 20 and edad < 30
print(veintes)
treintas = edad >= 30 and edad < 40
print(treintas)

if veintes or treintas:
    print("Estás en tus 20 o 30")
else:
    print("No estás en tus 20 o 30")


