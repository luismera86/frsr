'''
Ingresar "N" enteros, visualizar la suma de los números pares de la lista, cuantos números pares
existen y cual es el promedio de los números.
'''

n_enteros = int(input("Ingrese la cantidad de números enteros que desea ingresar: "))
num = 0
suma_pares = 0
cant_pares = 0
promedio = 0

for i in range(n_enteros):
    num = int(input("Ingrese un número entero: "))
    if num % 2 == 0:
        suma_pares += num
        cant_pares += 1
        promedio = suma_pares / cant_pares

print("La suma de los números pares es:", suma_pares)
print("La cantidad de números pares es:", cant_pares)
print("El promedio de los números pares es:", promedio)

