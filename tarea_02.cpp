#include <stdio.h>

struct Racional
{
private:
    int numerador = 0;
    int denominador = 0;

public:
    void imprimir();
    void asignar(int n, int d);
    Racional sumarRacionales(Racional r);
    Racional restarRacionales(Racional r);
    Racional multiplicarRacionales(Racional r);
    Racional dividirRacionales(Racional r);
    Racional simplificarRacionales();
};

void Racional::imprimir()
{
    printf("%d/", numerador);
    printf("%d", denominador);
};

void Racional::asignar(int n, int d)
{
    numerador = n;
    denominador = d;
};

Racional Racional::sumarRacionales(Racional r)
{
    Racional aux;
    aux.numerador = numerador * r.denominador + denominador * r.numerador;
    aux.denominador = denominador * r.denominador;
};

Racional Racional::restarRacionales(Racional r)
{
    Racional aux;
    aux.numerador = numerador * r.denominador - denominador * r.numerador;
    aux.denominador = denominador * r.denominador;
}

Racional Racional::multiplicarRacionales(Racional r)
{
    Racional aux;
    aux.numerador = numerador * r.numerador;
    aux.denominador = denominador * r.denominador;
}

Racional Racional::dividirRacionales(Racional r)
{
    Racional aux;
    aux.numerador = numerador * r.denominador;
    aux.denominador = denominador * r.numerador;
}

Racional Racional::simplificarRacionales()
{
    Racional aux;
    int resta, mcd, num, den;

    num = numerador;
    den = denominador;

    do
    {
        resta = num % den;
        num = den;
        den = resta;

    } while (resta != 0);

    mcd = num;

    aux.numerador = numerador / mcd;
    aux.denominador = denominador / mcd;
}

int main()
{
    Racional r1, r2, r3, r4, r5;
    r1.asignar(1, 2);
    r2.asignar(10, 100);
    //r3 = r1.sumarRacionales(r2);
    //r3.imprimir();

    //r4 = r1.restarRacionales(r2);
    //r4.imprimir();

    //r1 = r3.sumarRacionales(r2);
    printf("El resulado es ");
    r2.imprimir();
}
