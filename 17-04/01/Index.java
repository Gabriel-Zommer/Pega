public class Index{
    public static void main(String[] args) {
        int[] aluno = {7, 8, 9};
        int soma = 0;
        int divisoria = 3;
        int resultado = 0;
        for(int i = 0; i < aluno.length; i++){
            
            soma += aluno[i];
            resultado = soma / divisoria;
            
               
        }
        if(resultado >= 7){
            System.out.println("aprovado");

        }else{
            System.out.println("reprovado");
        }
       
    }
}