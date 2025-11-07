public class Operadores
{
    public float v1, v2;

    // Operadores Aritméticos

    public float adicao(float v1, float v2)
    {
        return v1+v2;
    }

    public float subtracao(float v1, float v2)
    {
        return v1-v2;
    }

    public float multiplicacao(float v1, float v2)
    {
        return v1*v2;
    }

    public float divisao(float v1, float v2)
    {
        return v1/v2;
    }

    public float modulo(float v1, float v2)
    {
        return v1%v2;
    }
    
    // Operadores de Atribuição

    public float atrbAdicao(float v1, float v2)
    {
        return v1+=v2;
    }

    public float atrbSubtracao(float v1, float v2)
    {
        return v1-=v2;
    }

    public float atrbMultiplicacao(float v1, float v2)
    {
        return v1*=v2;
    }

    public float atrbDivisao(float v1, float v2)
    {
        return v1/=v2;
    }

    public float atrbSimples(float v1, float v2)
    {
        return v1=v2;
    }

    // Operadores de Comparação

    public boolean igual(float v1, float v2)
    {
        return v1==v2;
    }
    
    public boolean diferente(float v1, float v2)
    {
        return v1!=v2;
    }
    
    public boolean menor(float v1, float v2)
    {
        return v1<v2;
    }
    
    public boolean maior(float v1, float v2)
    {
        return v1>v2;
    }
    
    public boolean menorIgual(float v1, float v2)
    {
        return v1<=v2;
    }
    
    public boolean maiorIgual(float v1, float v2)
    {
        return v1>=v2;
    }
}
