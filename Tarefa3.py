def Converte_Numeros (n):
    numeros = ('zero um dois tres quatro cinco seis sete oito nove'.split(' '))
    a = ''
    for e in str (n):
        a += numeros[int(e)] + ', '
    return a[:-2]

print (Converte_Numeros(9876543210))

def Converte_Texto(texto):
    numeros = ('zero um dois tres quatro cinco seis sete oito nove'.split(' '))
    a=''
    texto = texto.split(', ')
    for e in texto:
        a += str(numeros.index(e))
    return int(a)