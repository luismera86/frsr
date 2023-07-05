# Calcular el factorial de un número mayor o igual a 0

numero = int(input("Ingresa un número: "))

if numero < 0:
    print("El número debe ser mayor o igual a 0.")
else:
    resultado = 1
    i = 1
    while i <= numero:
        resultado *= i
        i += 1

    print("El factorial de", numero, "es", resultado)