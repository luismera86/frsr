# Tienda de libros
print("Digite los siguientes datos del libro")
nombre = input("Ingrese el nombre del libro: ")
id = int(input("Ingrese el id del libro: "))
precio = float(input("Ingrese el precio del libro: "))
envioGratuito = input("Indique si el envio es gratuito (True/False): ")

if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "Valor incorrecto, debe digitar True o False"

# Imprimir los datos con el format
print(f'''
nombre: {nombre}
id: {id}
precio: {precio}
envioGratuito: {envioGratuito}
''')



