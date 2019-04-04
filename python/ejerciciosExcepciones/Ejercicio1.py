"""

Realiza un programa que pida 6 numeros por teclado y nos diga cual es el maximo.
Si el usuario introduce un dato erroneo(algo que no sea un numero entero)
el programa debe indicarlo y debe pedir de nuevo el numero.

Javier Lopera Jimenez

"""

print("Este programa pide 6 numeros(enteros) por teclado y muestra el mayor de ellos")

listaNumeros = []

for i in range(6):
    while True:
        try:
            listaNumeros.append(int(input("Introduzca el numero "+ str(i+1)+"\n")))
        except:
            print("Debes introducir un numero")

print("El numero maximo es el " + str(max(listaNumeros)))