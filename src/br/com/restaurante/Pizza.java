package br.com.restaurante;

public class Pizza
{
    public String nome;

    public double valor;

    public boolean borda;

    public double calcular(double valor, boolean borda)
    {
        if (borda)
        {
            valor +=5;
            return valor;
        }
        return valor;

    }

    public void retNome()
    {
        System.out.println(nome);
    }
}
