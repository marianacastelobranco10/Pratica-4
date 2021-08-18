package com.company;

public class Vetores {
    private double[] arrayA = new double[10];
    private double[] arrayB = new double[10];

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }

    public double[] getArrayA() {
        return arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayANaPosicao(int posicao, double valor){
        try {
            this.arrayA[posicao] = valor;
            System.out.println("Valor adicionado com sucesso!");
        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Essa posição não existe nesse vetor, digite uma posiçao de 0 a 9");
        }
    }

    public void setArrayBNaPosicao(int posicao, double valor){
        try{
            this.arrayB[posicao] = valor;
            System.out.println("Valor adicionado com sucesso!");
        }catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Essa posição não existe nesse vetor, digite uma posiçao de 0 a 9");
        }
    }

    public double calcula(double numerador, double denominador) throws ExcecaoDivisaoResultadoZero{
        double resultado = 0;
        try{
            resultado = numerador/denominador;
        } catch(ArithmeticException error){
            System.out.println("Não da pra dividir por 0 meu filho, va catar coquinho e pare de baldear meu programa!");
            System.out.println("Valor do numerador" + numerador + "valor do denominador" + denominador);
        }

        if (resultado == 0) {
            throw new ExcecaoDivisaoResultadoZero();
        }

        return resultado;
    }

    public double[] calculaDivisaoArrays(double[] arrayA, double[] arrayB) throws ExcecaoDivisaoResultadoZero {

            double[] arrayResultado = new double[10];
            for(int i = 0; i < arrayA.length; i++){
                try {
                    arrayResultado[i] = calcula (arrayA[i], arrayB[i]);
                }
                finally {
                    System.out.println("Valor do numerador" + arrayA[i] + "valor do denominador" + arrayB[i]);
                }
            }
            return arrayResultado;
        }
}
