# Calcular el área de un rectángulo

alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El area del Rectángulo es : {area}")
print(f"El perímetro del Rectángulo es: {perimetro}")

# Numero par o impar

a = int(input("Digite un número: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número par")
else:
    print(f"El valor de a es: {a} es un número impar")

# Determinar si es mayor de edad
edad = int(input("Ingrese su edad: "))
if edad >= 18:
    print(f"La edad es {edad} es mayor de edad")
else:
    print(f"La edad es {edad} es menor de edad")
