# Ciclo for

cadena = "Hola Mundo"

for letra in cadena:
    print(letra)
else:
    print("Fin ciclo for")

# Sentencia break

for letra in cadena:
    if letra == "M":
        break
    print(letra)
else:
    print("Fin ciclo for")

# Sentencia continue

for letra in cadena:
    if letra == "M":
        continue
    print(letra)
else:
    print("Fin ciclo for")
