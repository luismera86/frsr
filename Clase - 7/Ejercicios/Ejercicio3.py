
mes_anio = int(input("Ingrese el mes del año entre 1 y 12: "))

if mes_anio <= 3:
    print("Es Verano")
elif mes_anio > 3 and mes_anio <= 6:
    print("Es Otonño")
elif mes_anio > 6 and mes_anio <= 9:
    print("Es Invierno")
elif mes_anio > 9 and mes_anio <= 12:
    print("Es primavera")
elif mes_anio > 1 or mes_anio < 12:
    print("El numero ingresado debe ser entre 1 y 12")