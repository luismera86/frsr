# Sentecias if - else

condicion = 0
# condicion = "" quiere decir que la variable esta vacia y es igual a False
# condicion = "algo" quiere decir que la variable tiene algo y es igual a True
# condicion = 0 quiere decir que la variable tiene un valor y es igual a False
# condicion = 1 quiere decir que la variable tiene un valor y es igual a True

if condicion:
    print("La condicion es verdadera")
else:
    print("La condicion es falsa")

# Conversión de números a texto
num = int(input("Escribe un número del 1 al 3: "))
if num == 1:
    numTexto = "Número uno"
elif num == 2:
    numTexto = "Número dos"
elif num == 3:
    numTexto = "Número tres"
else:
    numTexto = "Has ingresado un valor fuera de rango"
    print(f"El numero ingresado es : {num} - {numTexto}")
