import random

lista = []
tamanho = int(input("Tamanho: "))

def funcaoLista():

    for i in range(tamanho):
        lista.append(random.randint(1, 100))
    print(lista)
    
    for i in lista:
        if i % 3 == 0:
            print(i, "esse numero é modulo de 3")
        
        elif i % 2 == 0:
            print(i, "esse numero é par")
            
        else:
            print(f"{i} esse numero é ímpar")
    return "lista"

print(funcaoLista())