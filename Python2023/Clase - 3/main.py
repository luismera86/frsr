# Tipos de datos

# Tipo string en python abrevia str
a = "Hola"
print(type(a))  # <class 'str'>

# Tipo float
numero = 10.0
print(type(numero))  # <class 'float'>

# Tipos bool
buleano = True  # o False
print(type(buleano))  # <class 'bool'>

# Tipo int
numero_entero = 10
print(type(numero_entero))  # <class 'int'>

# Manejo de cadenas
banda = "Attaque 77"
print(banda)

# Concatenación de cadenas
print("Mi grupo favorito es " + banda)  # Mi grupo favorito es Attaque 77
print(f"Mi grupo favorito es {banda}")  # Mi grupo favorito es Attaque 77

caracteristicas = "Banda de Punk"
print("Mi grupo favorito es ", banda, caracteristicas)  # Mi grupo favorito es  Attaque 77 Banda de Punk

# Pasar de str a int
numero1 = "10"
numero2 = "5"
print(int(numero1) + int(numero2))  # 15

# Tipos bool
variable = 2 < 5
print(variable)  # True

# Condicional if
if variable:
    print("El Resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# Función input
resultado = input("Ingrese un nombre: ")  # Siempre regresa un dato tipo str
print("El nombre es", resultado)

# Conversion en la entrada de datos
numero3 = int(input("Ingrese un número: "))
numero4 = int(input("Ingrese otro número: "))
suma = numero4 + numero3
print("El resultado de la suma es:", suma)
