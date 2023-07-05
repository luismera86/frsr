'''
Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario y la sumatoria de todos
los salarios .
'''

tarifa = 300
salario = 0
sumatoria = 0

for i in range(5):
    horas = int(input(f'Ingrese las horas trabajadas por el trabajador {i+1}: '))
    salario = horas * tarifa
    sumatoria += salario
    print(f'El salario de la persona {i+1} es: {salario}')

print(f'La sumatoria de todos los salarios es: {sumatoria}')